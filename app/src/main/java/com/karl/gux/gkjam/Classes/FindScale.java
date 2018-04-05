package com.karl.gux.gkjam.Classes;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Karl on 3/28/2018.
 */

public class FindScale {
    String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
    List<String> notes_to_find = new ArrayList<>();
    public FindScale(){};
    Scales scales = new Scales();


    private List<String> numberToNotes(List<Integer> hit)
    {
        int total_hits = 0;
        List<String> notes_to_return = new ArrayList<>();
        for (int i = 0; i < hit.size();i++)
        {
            total_hits += hit.get(i);
        }
        return notes_to_return;
    }

    public List<String> findScaleFromNotesHit(List<Integer> notes_hit)
    {
        notes_to_find = this.numberToNotes(notes_hit);

        //ADD EXTRA SCALES TO LOOP HERE
        //loop through all scales, check if they contain subset of notes in parameter, add to list if they do
        List<String> containing_scales= new ArrayList<>();
        for (int i = 0;i < scales.major_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.major_scales.get(i)))
            {
                containing_scales.add(scales.major_scales.get(i).get(0)+" major (ionian)");
                containing_scales.add(scales.dorian_scales.get((i+2)%12).get(1)+ " dorian");
                containing_scales.add(scales.phrygian_scales.get((i+4)%12).get(2) + " phrygian");
                containing_scales.add(scales.lydian_scales.get((i+5)%12).get(3)+ " lydian");
                containing_scales.add(scales.mixolydian_scales.get((i+7)%12).get(4)+ " mixolydian");
                containing_scales.add(scales.locrian_scales.get((i+11)%12).get(6)+ " locrian");
            }
        }

        for (int i = 0;i <scales.minor_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.minor_scales.get(i)))
            {
                containing_scales.add(scales.minor_scales.get(i).get(0)+" minor (aeolian)");
            }
        }

        for (int i = 0;i <scales.minor_pentatonic_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.minor_pentatonic_scales.get(i)))
            {
                containing_scales.add(scales.minor_pentatonic_scales.get(i).get(0)+" minor pentatonic");
            }
        }

        for (int i = 0;i <scales.major_pentatonic_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.major_pentatonic_scales.get(i)))
            {
                containing_scales.add(scales.major_pentatonic_scales.get(i).get(0)+" major pentatonic");
            }
        }
        for (int i = 0;i <scales.minor_melodic_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.minor_melodic_scales.get(i)))
            {
                containing_scales.add(scales.minor_melodic_scales.get(i).get(0)+" melodic minor");
            }
        }

        for (int i = 0;i <scales.minor_harmonic_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.minor_harmonic_scales.get(i)))
            {
                containing_scales.add(scales.minor_harmonic_scales.get(i).get(0)+" harmonic minor");
            }
        }

        for (int i = 0;i <scales.minor_blues_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.minor_blues_scales.get(i)))
            {
                containing_scales.add(scales.minor_blues_scales.get(i).get(0)+" blues minor");
            }
        }

        for (int i = 0;i <scales.major_blues_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.major_blues_scales.get(i)))
            {
                containing_scales.add(scales.major_blues_scales.get(i).get(0)+" blues major");
            }
        }

        for (int i = 0;i <scales.major_bebop_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.major_bebop_scales.get(i)))
            {
                containing_scales.add(scales.major_bebop_scales.get(i).get(0)+" bebop major");
            }
        }

        for (int i = 0;i <scales.minor_bebop_scales.size();i++)
        {
            if (notes_to_find.containsAll(scales.minor_bebop_scales.get(i)))
            {
                containing_scales.add(scales.minor_bebop_scales.get(i).get(0)+" bebop minor");
            }
        }

        //sends the containing scales list to be written to html and displayed
        return containing_scales;
    }


    public List<String> chordsToNote(String chord)
    {
        List<String> notes_in_chord=new ArrayList<>();


        int  root = 0;

        //find root (where the first note is )
        while (!(scales.music_notes[root].equals(Character.toString(chord.charAt(0)))))
        {
            root++;
        }

        //if the chord has a #, it starts at 1 + the index of the letter
        if (chord.charAt(1)=='#')
        {
            root = root+1;
        }
        //======ADD THE ROOT NOTE TO RETURN STRING===============
        notes_in_chord.add(scales.music_notes[root]);

        //====IF CHORD IS MAJOR, ADD MAJOR 3rd & 5th===========
        if (chord.toLowerCase().contains("major"))
        {
            notes_in_chord.add(scales.music_notes[(root+4)%12]);
            notes_in_chord.add(scales.music_notes[(root+7)%12]);
        }

        //===IF CHORD IS MINOR, ADD MINOR 3rd & 5th
        else if (chord.toLowerCase().contains("minor"))
        {
            notes_in_chord.add(scales.music_notes[(root+3)%12]);
            notes_in_chord.add(scales.music_notes[(root+7)%12]);
        }

        //+========IF CHORD IS MAJ7, ADD MAJOR 3RD, 5TH, AND MAJ7
        else if (chord.toLowerCase().contains("maj7"))
        {
            notes_in_chord.add(scales.music_notes[(root+4)%12]);
            notes_in_chord.add(scales.music_notes[(root+7)%12]);
            notes_in_chord.add(scales.music_notes[(root+11)%12]);
        }

        //=======IF CHORD IS M7, ADD MINOR 3RD, 5TH, MINOR 7TH=======
        else if (chord.toLowerCase().contains("m7"))
        {
            notes_in_chord.add(scales.music_notes[(root+3)%12]);
            notes_in_chord.add(scales.music_notes[(root+7)%12]);
            notes_in_chord.add(scales.music_notes[(root+10)%12]);
        }

        //=======IF CHORD IS M7, ADD MINOR 3RD, 5TH, MAJOR 7TH=======
        else if (chord.toLowerCase().contains("mM7"))
        {
            notes_in_chord.add(scales.music_notes[(root+3)%12]);
            notes_in_chord.add(scales.music_notes[(root+7)%12]);
            notes_in_chord.add(scales.music_notes[(root+11)%12]);
        }

        //+========IF CHORD IS MAJ7, ADD MAJOR 3RD, 5TH, AND Min7
        else if (chord.toLowerCase().contains("7"))
        {
            notes_in_chord.add(scales.music_notes[(root+4)%12]);
            notes_in_chord.add(scales.music_notes[(root+7)%12]);
            notes_in_chord.add(scales.music_notes[(root+10)%12]);
        }
        return notes_in_chord;
    }


    //===============Loops through scales to see if they contain subset of notes to find. Returns all scales that contains matching notes
    public List<String> findScaleFromChords(List<String> chords_to_find)
    {
        //=========TURN ALL CHORDS PASSED IN INTO NOTES================================================
        Set<String> notes_to_find = new HashSet<>();
        List<String> notes_in_chord;
        notes_to_find.clear();

        //loop through input (buttons that were clicked containing chords)
        for (int i = 0; i<chords_to_find.size();i++)
        {
            //turn each chord into notes
            notes_in_chord = chordsToNote(chords_to_find.get(i));
            //loop through returned notes and pushes to all notes list
            for (int j = 0; j < notes_in_chord.size(); j++)
            {
                notes_to_find.add(notes_in_chord.get(j));
            }
        }
        Log.i("-----------------", "notes to find: "+notes_to_find);

        //==============================================================================
        //
        //=======loop through all scales, check if they contain subset of notes in parameter, add to list if they do====================
        List<String> containing_scales = new ArrayList<>();
        Log.i("-----------------", "size: "+scales.major_scales.size());

        for (int i = 0;i <scales.major_scales.size();i++)
        {
            Log.i("-----------------", "scale contains: "+scales.major_scales.get(i));

            if (scales.major_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.major_scales.get(i).get(0)+" major (ionian)");
                containing_scales.add(scales.dorian_scales.get((i+2)%12).get(1)+ " dorian");
                containing_scales.add(scales.phrygian_scales.get((i+4)%12).get(2) + " phrygian");
                containing_scales.add(scales.lydian_scales.get((i+5)%12).get(3)+ " lydian");
                containing_scales.add(scales.mixolydian_scales.get((i+7)%12).get(4)+ " mixolydian");
                containing_scales.add(scales.locrian_scales.get((i+11)%12).get(6)+ " locrian");
            }

            if (scales.minor_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.minor_scales.get(i).get(0)+" minor (aeolian)");
            }

            if (scales.minor_pentatonic_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.minor_pentatonic_scales.get(i).get(0)+" minor pentatonic");
            }

            if (scales.major_pentatonic_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.major_pentatonic_scales.get(i).get(0)+" major pentatonic");
            }

            if (scales.minor_melodic_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.minor_melodic_scales.get(i).get(0)+" melodic minor");
            }

            if (scales.minor_harmonic_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.minor_harmonic_scales.get(i).get(0)+" harmonic minor");
            }

            if (scales.major_blues_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.major_blues_scales.get(i).get(0)+" blues major");
            }

            if (scales.minor_blues_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.minor_blues_scales.get(i).get(0)+" blues minor");
            }

            if (scales.major_bebop_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.major_bebop_scales.get(i).get(0)+" bebop major");
            }

            if (scales.minor_bebop_scales.get(i).containsAll(notes_to_find))
            {
                containing_scales.add(scales.minor_bebop_scales.get(i).get(0)+" bebop minor");
            }
        }

        return containing_scales;
    }
}
