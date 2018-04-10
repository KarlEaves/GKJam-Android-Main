package com.karl.gux.gkjam.Activities.Fragments;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;

import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.karl.gux.gkjam.Activities.ChordListAdapter;
import com.karl.gux.gkjam.Activities.NoteListAdpater;
import com.karl.gux.gkjam.Activities.ScalesActivity;
import com.karl.gux.gkjam.Classes.FindScale;
import com.karl.gux.gkjam.Classes.FrequencyToNote;
import com.karl.gux.gkjam.Classes.Note;
import com.karl.gux.gkjam.Classes.NoteCounter;
import com.karl.gux.gkjam.Classes.WheelMenu;
import com.karl.gux.gkjam.R;

import java.util.ArrayList;
import java.util.List;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.pitch.PitchDetectionHandler;
import be.tarsos.dsp.pitch.PitchDetectionResult;
import be.tarsos.dsp.pitch.PitchProcessor;

import static be.tarsos.dsp.io.android.AudioDispatcherFactory.fromDefaultMicrophone;
import static be.tarsos.dsp.pitch.PitchProcessor.PitchEstimationAlgorithm.FFT_YIN;

public class ItemOneFragment extends Fragment {

    public boolean stop_clicked = false;
    public static final int RECORD_AUDIO_PERMISSION = 0;


    public float pitch;
    String note;
    private static final int SAMPLE_RATE = 44100;

    private static final int BUFFER_SIZE = 1024 * 4;
    private static final int OVERLAP = 768 * 4;

    private AudioDispatcher audioDispatcher;
    Button stop_button;

    FrequencyToNote note_finder = new FrequencyToNote();
    NoteCounter note_counter = new NoteCounter();
    FindScale scale_finder = new FindScale();

    private List<Note> noteList = new ArrayList<>();
    private RecyclerView recyclerView;
    private NoteListAdpater mAdapter;

    private WheelMenu wheelMenu;
    private TextView selectedPositionText;

    private String selected;

    private boolean stopped = false;

    TextView pitchText;


    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_item_one, container, false);
    }

    public int getElement(int[] arrayOfInts, int index) {
        return arrayOfInts[index];
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


//      Wheel Selector
        wheelMenu = view.findViewById(R.id.wheelMenu);

        final String[] music_notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

        pitchText = getView().findViewById(R.id.frequency);


        wheelMenu.setDivCount(music_notes.length);
        wheelMenu.setWheelImage(R.drawable.musicneedle);

        selectedPositionText = view.findViewById(R.id.selected_position_text);
        selectedPositionText.setText("selected: " + (wheelMenu.getSelectedPosition() + 1));

        wheelMenu.setWheelChangeListener(new WheelMenu.WheelChangeListener() {
            @Override
            public void onSelectionChange(int selectedPosition) {
                switch (selectedPosition) {
                    case 0:
                        selected = "C";
                        break;
                    case 1:
                        selected = "B";
                        break;
                    case 2:
                        selected = "A#";
                        break;
                    case 3:
                        selected = "A";
                        break;
                    case 4:
                        selected = "G#";
                        break;
                    case 5:
                        selected = "G";
                        break;
                    case 6:
                        selected = "F#";
                        break;
                    case 7:
                        selected = "F";
                        break;
                    case 8:
                        selected = "E";
                        break;
                    case 9:
                        selected = "D#";
                        break;
                    case 10:
                        selected = "D";
                        break;
                    case 11:
                        selected = "C#";
                        break;


                }

                selectedPositionText.setText("selected: " + selected);//music_notes[(selectedPosition+3)%12]));
            }
        });


        recyclerView = view.findViewById(R.id.recycler_view);
        mAdapter = new NoteListAdpater(noteList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        stop_button = getView().findViewById(R.id.stop_recording_button);

        //check for permission, once gotten, do other shit
        int permissionCheck = ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.RECORD_AUDIO);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{Manifest.permission.RECORD_AUDIO}, RECORD_AUDIO_PERMISSION);
        } else {
            permissionGranted();
        }


    }

    @Override
    public void onStop() {
        super.onStop();
        stopped = true;
        stop_clicked = true;
    }

    @Override
    public void onResume() {
        super.onResume();
        stopped = false;
    }

    private void permissionGranted() {
        CardView start_button = getView().findViewById(R.id.start_recording_botton);
        start_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stop_clicked = false;
                final Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (!stopped) {


                            Log.d("==================", "before start recording");
                            startRecording();
                            Log.d("==================", "after start recording");
                            //===========SET TEXT OF PITCH======================
                            if (pitch > 0) {
                                String pitchTextString = Float.toString(pitch);

                                pitchText.setText(pitchTextString);
                                Log.i("-----------------", "pitch: " + pitchTextString);

                                Log.i("==========", "stopped");

                                //==========================SET TEXT OF NOTE=========================

                                note = note_finder.toNote(pitch).toString();
                                TextView noteText = getView().findViewById(R.id.note);
                                if (note != "") {
                                    noteText.setText(note);
                                }
                                note_counter.input_note(note);


                                switch (note) {
                                    case "A":
                                        wheelMenu.setSelectedPosition(9);
                                        break;
                                    case "A#":
                                        wheelMenu.setSelectedPosition(10);
                                        break;
                                    case "B":
                                        wheelMenu.setSelectedPosition(11);
                                        break;
                                    case "C":
                                        wheelMenu.setSelectedPosition(0);
                                        break;
                                    case "C#":
                                        wheelMenu.setSelectedPosition(1);
                                        break;
                                    case "D":
                                        wheelMenu.setSelectedPosition(2);
                                        break;
                                    case "D#":
                                        wheelMenu.setSelectedPosition(3);
                                        break;
                                    case "E":
                                        wheelMenu.setSelectedPosition(4);
                                        break;
                                    case "F":
                                        wheelMenu.setSelectedPosition(5);
                                        break;
                                    case "F#":
                                        wheelMenu.setSelectedPosition(6);
                                        break;
                                    case "G":
                                        wheelMenu.setSelectedPosition(7);
                                        break;
                                    case "G#":
                                        wheelMenu.setSelectedPosition(8);
                                        break;

                                }

                            } else {
                                Log.i("=====", "pitch <=0");
                            }
                            handler.postDelayed(this, 500);

                            if (stop_clicked == true) {
                                Log.d("====================", "stop clicked ");
                                handler.removeCallbacks(this);
                            }
                        }
                    }
                });

            }
        });

        stop_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopRecording();
            }
        });


    }

    private void stopRecording() {
        Log.i("==========", "notes hit" + note_counter.get_notes_hit());
        stop_clicked = true;

        List<String> scales_containing = scale_finder.findScaleFromNotesHit(note_counter.get_notes_hit());
        Log.i("==========", "scales containing: " + scales_containing);
        Intent intent = new Intent(getContext(), ScalesActivity.class);
        intent.putStringArrayListExtra("scales", (ArrayList<String>) scales_containing);
        startActivity(intent);
    }

    private void startRecording() {
        PitchDetectionHandler pitchDetectionHandler = new PitchDetectionHandler() {


            @Override
            public void handlePitch(PitchDetectionResult pitchDetectionResult,
                                    AudioEvent audioEvent) {
                if (!stopped) {


                    if (pitch != pitchDetectionResult.getPitch()) {
                        pitch = pitchDetectionResult.getPitch();
                    }
                    if (pitch > 0) {
                        //write pitch to screen
                        if (!stopped) {
//                            final TextView pitchText = getView().findViewById(R.id.frequency);
//
//                            String pitchTextString = Float.toString(pitch);
//
//                            pitchText.setText(pitchTextString);


                            if (pitch > 0) {
                                Log.d("-----------", "handlePitch: " + pitch);
                            }
                        }
                    }
                    audioDispatcher.stop();
                }


            }


        };

        PitchProcessor pitchProcessor = new PitchProcessor(FFT_YIN, SAMPLE_RATE,
                BUFFER_SIZE, pitchDetectionHandler);
        audioDispatcher = fromDefaultMicrophone(SAMPLE_RATE,
                BUFFER_SIZE, OVERLAP);
        audioDispatcher.addAudioProcessor(pitchProcessor);
        audioDispatcher.run();

    }


}