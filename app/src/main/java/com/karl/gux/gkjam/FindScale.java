package com.karl.gux.gkjam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karl on 3/28/2018.
 */

public class FindScale {
    String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
    List<String> notes_to_find = new ArrayList<>();
    public FindScale(){};
    Scales scales = new Scales();

    private List<String> numbers_to_notes(List<Integer> hit)
    {
        int total_hits = 0;
        List<String> notes_to_return = new ArrayList<>();
        for (int i = 0; i < hit.size();i++)
        {
            total_hits += hit.get(i);
        }
        return notes_to_return;
    }

    public List<String> find_scale(List<Integer> notes_hit)
    {
        notes_to_find = this.numbers_to_notes(notes_hit);

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
}
