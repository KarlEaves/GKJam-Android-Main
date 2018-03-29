package com.karl.gux.gkjam.Activities.Fragments;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.karl.gux.gkjam.Classes.FindScale;
import com.karl.gux.gkjam.Classes.FrequencyToNote;
import com.karl.gux.gkjam.Classes.NoteCounter;
import com.karl.gux.gkjam.R;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.pitch.PitchDetectionHandler;
import be.tarsos.dsp.pitch.PitchDetectionResult;
import be.tarsos.dsp.pitch.PitchProcessor;

import static be.tarsos.dsp.io.android.AudioDispatcherFactory.fromDefaultMicrophone;
import static be.tarsos.dsp.pitch.PitchProcessor.PitchEstimationAlgorithm.FFT_YIN;

public class ItemOneFragment extends Fragment {

    public boolean stop_clicked= false;
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


    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        Log.d("===================", "onCreateView: "+getView());
        stop_button = getView().findViewById(R.id.stop_recording_button);
        //check for permission, once gotten, do other shit
        int permissionCheck = ActivityCompat.checkSelfPermission(getContext(),android.Manifest.permission.RECORD_AUDIO);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{Manifest.permission.RECORD_AUDIO}, RECORD_AUDIO_PERMISSION);
        } else {
            permissionGranted();
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_item_one, container, false);
    }

    private void permissionGranted()
    {
        Button start_button = getView().findViewById(R.id.start_recording_button);
        start_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                stop_clicked= false;
                final Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run()
                    {
                        startRecording();

                        //===========SET TEXT OF PITCH======================
                        final TextView pitchText = getView().findViewById(R.id.frequency);
                        String pitchTextString = Float.toString(pitch);

                        pitchText.setText(pitchTextString);


                        //==========================SET TEXT OF NOTE=========================

                        note = note_finder.toNote(pitch).toString();
                        TextView noteText=getView().findViewById(R.id.note);
                        if (note != "") {
                            noteText.setText(note);
                        }
                        note_counter.input_note(note);



                        handler.postDelayed(this,500);

                        if (stop_clicked == true)
                        {
                            Log.d("====================","stop clicked " );
                            handler.removeCallbacks(this);
                        }
                    }
                });

            }
        });

        stop_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                stopRecording();
            }
        });


    }

    private void stopRecording()
    {
        Log.d("==========","started");
        stop_clicked = true;
        scale_finder.find_scale(note_counter.get_notes_hit());
    }
    private void startRecording() {





        PitchDetectionHandler pitchDetectionHandler = new PitchDetectionHandler() {


            @Override
            public void handlePitch(PitchDetectionResult pitchDetectionResult,
                                    AudioEvent audioEvent) {

                if (pitch != pitchDetectionResult.getPitch())
                {
                    pitch = pitchDetectionResult.getPitch();
                }


                if (pitch > 0) {
                    //write pitch to screen
                    final TextView pitchText = getView().findViewById(R.id.frequency);
                    String pitchTextString = Float.toString(pitch);

                    pitchText.setText(pitchTextString);
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