package com.karl.gux.gkjam.Activities.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aigestudio.wheelpicker.WheelPicker;
import com.karl.gux.gkjam.Activities.ChordListAdapter;
import com.karl.gux.gkjam.Activities.ScalesActivity;
import com.karl.gux.gkjam.Classes.Chord;
import com.karl.gux.gkjam.R;

import java.util.ArrayList;
import java.util.List;

public class ItemTwoFragment extends Fragment implements WheelPicker.OnItemSelectedListener, View.OnClickListener{

    List<String> notesList = new ArrayList<>();
    List<String> scalesList = new ArrayList<>();

    Button findScalesButton;
    Button addButton;

    private WheelPicker wheelLeft;
    private WheelPicker wheelRight;

    String latestLeft = "A";
    String latestRight = " ";

    //  Arrays
    String[] music_notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
    String[] different_scales = {" ","Major","Minor","maj7","m7","mM7","7"};

    private List<Chord> chordList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ChordListAdapter mAdapter;


    // Deals with the fragment
    public static ItemTwoFragment newInstance() {
        ItemTwoFragment fragment = new ItemTwoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_two, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {

        recyclerView =view.findViewById(R.id.recycler_view);
        mAdapter = new ChordListAdapter(chordList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        wheelLeft = view.findViewById(R.id.main_wheel_left);
        wheelRight = view.findViewById(R.id.main_wheel_right);
      
        findScalesButton = view.findViewById(R.id.find_scales_button);
        addButton = view.findViewById(R.id.add_button);
      
      addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItems(latestLeft,latestRight);
            }
        });

//      replace data in wheels
        for (String s: music_notes) {
            notesList.add(s);
            wheelLeft.setData(notesList);
        }

        for (String t: different_scales) {
            scalesList.add(t);
            wheelRight.setData(scalesList);
        }
      
      wheelLeft.setOnItemSelectedListener(this);
        wheelRight.setOnItemSelectedListener(this);

        findScalesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Dialog ----
                Intent intent = new Intent(getContext(), ScalesActivity.class);
                startActivity(intent);
            }
        });

    }
  
    //METHOD WHICH WILL HANDLE DYNAMIC INSERTION
    public void addItems(String left, String right) {
        Chord chord = new Chord(left + right);
        chordList.add(chord);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {
        Log.d("===============", "onClick: ");
    }

    @Override
    public void onItemSelected(WheelPicker picker, Object data, final int position) {
        switch (picker.getId()) {
            case R.id.main_wheel_left:
                latestLeft = notesList.get(position);

                break;
            case R.id.main_wheel_right:
                latestRight = scalesList.get(position);
                break;
        }
      
      

//    public List<String> chordsToNote(String chord)
//    {
//        List<String> notes_in_chord=new ArrayList<>();
//        //======ADD THE ROOT NOTE TO RETURN STRING===============
//        notes_in_chord.add(scales.music_notes[root]);
//
//        //====IF CHORD IS MAJOR, ADD MAJOR 3rd & 5th===========
//        if (chord.toLowerCase().contains("major"))
//        {
//            notes_in_chord.add(scales.music_notes[(root+4)%12]);
//            notes_in_chord.add(scales.music_notes[(root+7)%12]);
//        }
//
//        //===IF CHORD IS MINOR, ADD MINOR 3rd & 5th
//        else if (chord.toLowerCase().contains("minor"))
//        {
//            notes_in_chord.add(scales.music_notes[(root+3)%12]);
//            notes_in_chord.add(scales.music_notes[(root+7)%12]);
//        }
//
//        //+========IF CHORD IS MAJ7, ADD MAJOR 3RD, 5TH, AND MAJ7
//        else if (chord.toLowerCase().contains("maj7"))
//        {
//            notes_in_chord.add(scales.music_notes[(root+4)%12]);
//            notes_in_chord.add(scales.music_notes[(root+7)%12]);
//            notes_in_chord.add(scales.music_notes[(root+11)%12]);
//        }
//
//        //=======IF CHORD IS M7, ADD MINOR 3RD, 5TH, MINOR 7TH=======
//        else if (chord.toLowerCase().contains("m7"))
//        {
//            notes_in_chord.add(scales.music_notes[(root+3)%12]);
//            notes_in_chord.add(scales.music_notes[(root+7)%12]);
//            notes_in_chord.add(scales.music_notes[(root+10)%12]);
//        }
//
//        //=======IF CHORD IS M7, ADD MINOR 3RD, 5TH, MAJOR 7TH=======
//        else if (chord.toLowerCase().contains("mM7"))
//        {
//            notes_in_chord.add(scales.music_notes[(root+3)%12]);
//            notes_in_chord.add(scales.music_notes[(root+7)%12]);
//            notes_in_chord.add(scales.music_notes[(root+11)%12]);
//        }
//
//        //+========IF CHORD IS MAJ7, ADD MAJOR 3RD, 5TH, AND Min7
//        else if (chord.toLowerCase().contains("7"))
//        {
//            notes_in_chord.add(scales.music_notes[(root+4)%12]);
//            notes_in_chord.add(scales.music_notes[(root+7)%12]);
//            notes_in_chord.add(scales.music_notes[(root+10)%12]);
//        }
//        return notes_in_chord;
//    }
//
//
//    //===============Loops through scales to see if they contain subset of notes to find. Returns all scales that contains matching notes
//    public List<String> findScale(List<String> chords_to_find)
//    {
//        //=========TURN ALL CHORDS PASSED IN INTO NOTES================================================
//        Set<String> notes_to_find = new HashSet<>();
//        List<String> notes_in_chord;
//
//
//        //loop through input (buttons that were clicked containing chords)
//        for (int i = 0; i<chords_to_find.size();i++)
//            {
//            //turn each chord into notes
//            notes_in_chord = chordsToNote(chords_to_find.get(i));
//            //loop through returned notes and pushes to all notes list
//            for (int j = 0; j < notes_in_chord.size(); j++)
//            {
//                notes_to_find.add(notes_in_chord.get(j));
//            }
//        }
//
//        //==============================================================================
//        //
//        //=======loop through all scales, check if they contain subset of notes in parameter, add to list if they do====================
//        List<String> containing_scales = new ArrayList<>();
//        for (int i = 0;i <scales.major_scales.size();i++)
//        {
//            if (scales.major_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.major_scales.get(i).get(0)+" major (ionian)");
//                containing_scales.add(scales.dorian_scales.get((i+2)%12).get(1)+ " dorian");
//                containing_scales.add(scales.phrygian_scales.get((i+4)%12).get(2) + " phrygian");
//                containing_scales.add(scales.lydian_scales.get((i+5)%12).get(3)+ " lydian");
//                containing_scales.add(scales.mixolydian_scales.get((i+7)%12).get(4)+ " mixolydian");
//                containing_scales.add(scales.locrian_scales.get((i+11)%12).get(6)+ " locrian");
//            }
//
//            if (scales.minor_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.minor_scales.get(i).get(0)+" minor (aeolian)");
//            }
//
//            if (scales.minor_pentatonic_scales.get(i).containsAll(notes_to_find))
//                {
//                containing_scales.add(scales.minor_pentatonic_scales.get(i).get(0)+" minor pentatonic");
//            }
//
//            if (scales.major_pentatonic_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.major_pentatonic_scales.get(i).get(0)+" major pentatonic");
//            }
//
//            if (scales.minor_melodic_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.minor_melodic_scales.get(i).get(0)+" melodic minor");
//            }
//
//            if (scales.minor_harmonic_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.minor_harmonic_scales.get(i).get(0)+" harmonic minor");
//            }
//
//            if (scales.major_blues_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.major_blues_scales.get(i).get(0)+" blues major");
//            }
//
//            if (scales.minor_blues_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.minor_blues_scales.get(i).get(0)+" blues minor");
//            }
//
//            if (scales.major_bebop_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.major_bebop_scales.get(i).get(0)+" bebop major");
//            }
//
//            if (scales.minor_bebop_scales.get(i).containsAll(notes_to_find))
//            {
//                containing_scales.add(scales.minor_bebop_scales.get(i).get(0)+" bebop minor");
//            }
//        }
//
//        return containing_scales;
    }




}