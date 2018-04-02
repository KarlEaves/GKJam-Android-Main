package com.karl.gux.gkjam.Activities.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ToggleButton;

import com.karl.gux.gkjam.Classes.Scales;
import com.karl.gux.gkjam.R;

import java.util.ArrayList;
import java.util.List;

public class ItemTwoFragment extends Fragment {

    Button find_scale;

    Scales scales = new Scales();

    ToggleButton toggle_button_a_major;
    ToggleButton toggle_button_a_sharp_major;
    ToggleButton toggle_button_b_major;
    ToggleButton toggle_button_c_major;
    ToggleButton toggle_button_c_sharp_major;
    ToggleButton toggle_button_d_major;
    ToggleButton toggle_button_d_sharp_major;
    ToggleButton toggle_button_e_major;
    ToggleButton toggle_button_f_major;
    ToggleButton toggle_button_f_sharp_major;
    ToggleButton toggle_button_g_major;
    ToggleButton toggle_button_g_sharp_major;



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

        find_scale = getView().findViewById(R.id.EnterNotes);
        toggle_button_a_major = getView().findViewById(R.id.AMajor);
        toggle_button_a_sharp_major= getView().findViewById(R.id.ASharpMajor);
        toggle_button_b_major= getView().findViewById(R.id.BMajor);
        toggle_button_c_major= getView().findViewById(R.id.CMajor);
        toggle_button_c_sharp_major= getView().findViewById(R.id.CSharpMajor);
        toggle_button_d_major= getView().findViewById(R.id.DMajor);
        toggle_button_d_sharp_major= getView().findViewById(R.id.DSharpMajor);
        toggle_button_e_major= getView().findViewById(R.id.EMajor);
        toggle_button_f_major= getView().findViewById(R.id.FMajor);
        toggle_button_f_sharp_major= getView().findViewById(R.id.FSharpMajor);
        toggle_button_g_major= getView().findViewById(R.id.GMajor);
        toggle_button_g_sharp_major= getView().findViewById(R.id.GSharpMajor);


        find_scale.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                try {
                    findScale();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }



    public String[] chordsToNote(String chord)
    {
        List<String> notes_in_chord=new ArrayList<>();

        int root = -1;
        for (int i=0;i<scales.music_notes.length;i++) {
            if (scales.music_notes[i].equals(chord.charAt(0))) {
                root = i;
                break;
            }
        }

        //if the chord has a #, it starts at 1 + the index of the letter
        if (chord.charAt(1)=='#')
        {
            root = root+1;
        }

        notes_in_chord.add(scales.music_notes[root]);

        //if the chord is minor, push the minor 3rd
        if (chord.charAt(1)=='m' || chord.charAt(2) == 'm')
        {
            notes_in_chord.add(scales.music_notes[(root+3)%12]);
        }
        //else push major 3rd
        else
        {
            notes_in_chord.add(scales.music_notes[(root+4)%12]);
        }

        notes_in_chord.add(scales.music_notes[(root+7)%12]);

        if (chord.includes("Maj7") || chord.includes("maj7") || chord.includes("M7"))
        {
            notes_in_chord.push(notes[(root+11)%12]);
        }
        else if (chord.includes("7"))
        {
            notes_in_chord.push(notes[(root+10)%12]);
        }

        //-------------------------print the notes to screen that are in the chords selected-----------------------------

        var para = document.createElement("P");
        para.appendChild(document.createTextNode(chord +" contains the following notes: "));
        for (let i = 0;i<notes_in_chord.length; i++)
        {                     // Create a <p> node
            var t = document.createTextNode(notes_in_chord[i]+ "  ");      // Create a text node
            para.appendChild(t);                 // Append the text to <p>
            document.getElementById("notesInChordsSelected").appendChild(para);
        }
        return notes_in_chord;
    }
    public void findScale()
    {

    }
}