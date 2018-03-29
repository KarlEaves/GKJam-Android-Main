package com.karl.gux.gkjam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karl on 3/28/2018.
 */

public class NoteCounter {


    List<Integer> notes_hit =new ArrayList<>();
    List<String> notes = new ArrayList<>();


    public NoteCounter(){
        for (int i = 0;i<12;i++)
        {
            notes_hit.add(0);
        }
        notes.add("A");
        notes.add("A#");
        notes.add("B");
        notes.add("C");
        notes.add("C#");
        notes.add("D");
        notes.add("D#");
        notes.add("E");
        notes.add("F");
        notes.add("F#");
        notes.add("G");
        notes.add("G#");
    }

    public void input_note(String note)
    {
        for (int i = 0;i<notes.size();i++)
        {
            if (note == notes.get(i))
            {
                notes_hit.set(i,notes_hit.get(i));
            }
        }
    }
    public List<Integer> get_notes_hit() {
        return notes_hit;
    }

}
