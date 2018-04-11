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
import com.karl.gux.gkjam.Activities.PrintScalesActivity;
import com.karl.gux.gkjam.Classes.Chord;
import com.karl.gux.gkjam.Classes.FindScale;
import com.karl.gux.gkjam.Classes.Scales;
import com.karl.gux.gkjam.R;

import java.util.ArrayList;
import java.util.List;

public class ScaleFinderFragment extends Fragment implements WheelPicker.OnItemSelectedListener, View.OnClickListener {

    List<String> notesList = new ArrayList<>();
    List<String> scalesList = new ArrayList<>();
    Scales scales = new Scales();
    FindScale scale_finder = new FindScale();

    Button findScalesButton;
    Button addButton;

    private WheelPicker wheelLeft;
    private WheelPicker wheelRight;

    String latestLeft = "A";
    String latestRight = " ";

    //  Arrays
    String[] music_notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
    String[] different_scales = {" ", "Major", "Minor", "maj7", "m7", "mM7", "7"};

    private List<Chord> chordList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ChordListAdapter mAdapter;


    // Deals with the fragment
    public static ScaleFinderFragment newInstance() {
        ScaleFinderFragment fragment = new ScaleFinderFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_scale_finder, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recycler_view);
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
                addItems(latestLeft, latestRight);
            }
        });

//      replace data in wheels
        for (String s : music_notes) {
            notesList.add(s);
            wheelLeft.setData(notesList);
        }

        for (String t : different_scales) {
            scalesList.add(t);
            wheelRight.setData(scalesList);
        }

        wheelLeft.setOnItemSelectedListener(this);
        wheelRight.setOnItemSelectedListener(this);

        //=========WHEN FIND SCALES BUTTON IS CLICKED============================================

        findScalesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<String> stringChordList = new ArrayList<>();
                for (Chord chord:chordList)
                {
                    stringChordList.add(chord.getChord());
                }
                List<String> scales_containing;
                scales_containing = scale_finder.findScaleFromChords(stringChordList);
                Log.i("-----------------", "scales containing: "+scales_containing);
//                Dialog ----
                Intent intent = new Intent(getContext(), PrintScalesActivity.class);
                intent.putStringArrayListExtra("scales",(ArrayList<String>)scales_containing);
                startActivity(intent);
            }
        });
        //======================================================================================

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

    }
}
