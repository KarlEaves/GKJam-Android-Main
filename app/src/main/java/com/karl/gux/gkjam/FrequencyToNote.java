package com.karl.gux.gkjam;

import android.util.Log;

/**
 * Created by Karl on 3/28/2018.
 */

public class FrequencyToNote {

    NotePitch C1 = new NotePitch(32.70f,"C");
    NotePitch CSharp1 = new NotePitch(34.65f,"C#");
    NotePitch D1 = new NotePitch(36.71f,"D");
    NotePitch DSharp1= new NotePitch(38.89f,"D#");
    NotePitch E1= new NotePitch(41.20f,"E");
    NotePitch F1= new NotePitch(43.65f,"F");
    NotePitch FSharp1= new NotePitch(46.25f,"F#");
    NotePitch G1= new NotePitch(48.99f,"G");
    NotePitch GSharp1= new NotePitch(51.91f,"G#");
    NotePitch A1= new NotePitch(55.00f,"A");
    NotePitch ASharp1= new NotePitch(58.27f,"A#");
    NotePitch B1= new NotePitch(61.73f,"B");
    NotePitch C2= new NotePitch(65.40f,"C");
    NotePitch CSharp2= new NotePitch(69.29f,"C#");
    NotePitch D2= new NotePitch(73.41f,"D");
    NotePitch DSharp2= new NotePitch(77.78f,"D#");
    NotePitch E2= new NotePitch(82.40f,"E");
    NotePitch F2= new NotePitch(87.30f,"F");
    NotePitch FSharp2= new NotePitch(92.49f,"F#");
    NotePitch G2= new NotePitch(97.99f,"G");
    NotePitch GSharp2= new NotePitch(103.83f,"G#");
    NotePitch A2= new NotePitch(110.00f,"A");
    NotePitch ASharp2= new NotePitch(116.54f,"A#");
    NotePitch B2= new NotePitch(123.47f,"B");
    NotePitch C3= new NotePitch(130.81f,"C");
    NotePitch CSharp3= new NotePitch(138.59f,"C#");
    NotePitch D3= new NotePitch(146.83f,"D");
    NotePitch DSharp3= new NotePitch(155.56f,"D#");
    NotePitch E3= new NotePitch(164.81f,"E");
    NotePitch F3= new NotePitch(174.61f,"F");
    NotePitch FSharp3= new NotePitch(185.00f,"F#");
    NotePitch G3= new NotePitch(196.00f,"G");
    NotePitch GSharp3= new NotePitch(207.65f,"G#");
    NotePitch A3= new NotePitch(220.00f,"A");
    NotePitch ASharp3= new NotePitch(233.08f,"A#");
    NotePitch B3= new NotePitch(246.94f,"B");
    NotePitch C4= new NotePitch(261.63f,"C");
    NotePitch CSharp4= new NotePitch(277.18f,"C#");
    NotePitch D4= new NotePitch(293.67f,"D");
    NotePitch DSharp4= new NotePitch(311.13f,"D#");
    NotePitch E4= new NotePitch(329.63f,"E");
    NotePitch F4= new NotePitch(349.23f,"F");
    NotePitch FSharp4= new NotePitch(369.99f,"F#");
    NotePitch G4= new NotePitch(392.00f,"G");
    NotePitch GSharp4= new NotePitch(415.30f,"G#");
    NotePitch A4= new NotePitch(440.00f,"A");
    NotePitch ASharp4= new NotePitch(466.16f,"A#");
    NotePitch B4= new NotePitch(493.88f,"B");
    NotePitch C5= new NotePitch(523.25f,"C");
    NotePitch CSharp5= new NotePitch(554.37f,"C#");
    NotePitch D5= new NotePitch(587.33f,"D");
    NotePitch DSharp5= new NotePitch(622.25f,"D#");
    NotePitch E5= new NotePitch(659.26f,"E");
    NotePitch F5= new NotePitch(698.46f,"F");
    NotePitch FSharp5= new NotePitch(739.99f,"F#");
    NotePitch G5= new NotePitch(783.99f,"G");
    NotePitch GSharp5= new NotePitch(830.61f,"G#");
    NotePitch A5= new NotePitch(880.00f,"A");
    NotePitch ASharp5= new NotePitch(932.33f,"A#");
    NotePitch B5 = new NotePitch(987.77f,"B");
    NotePitch C6 = new NotePitch(1046.5f,"C");
    NotePitch[] allNotes = {this.C1,this.CSharp1,this.D1,this.DSharp1,this.E1, this.F1, this.FSharp1,this.G1,this.GSharp1,this.A1,this.ASharp1,this.B1,
            this.C2,
            this.CSharp2,
            this.D2,
            this.DSharp2,
            this.E2,
            this.F2,
            this.FSharp2,
            this.G2,
            this.GSharp2,
            this.A2,
            this.ASharp2,
            this.B2,
            this.C3,
            this.CSharp3,
            this.D3,
            this.DSharp3,
            this.E3,
            this.F3,
            this.FSharp3,
            this.G3,
            this.GSharp3,
            this.A3,
            this.ASharp3,
            this.B3,
            this.C4,
            this.CSharp4,
            this.D4,
            this.DSharp4,
            this.E4,
            this.F4,
            this.FSharp4,
            this.G4,
            this.GSharp4,
            this.A4,
            this.ASharp4,
            this.B4,
            this.C5,
            this.CSharp5,
            this.D5,
            this.DSharp5,
            this.E5,
            this.F5,
            this.FSharp5,
            this.G5,
            this.GSharp5,
            this.A5,
            this.ASharp5,
            this.B5,
            this.C6};

    public FrequencyToNote() {}

    public String toNote(float frequency)
    {
        String returnString="";
        for (int i=0; i < allNotes.length; i++)
        {
//            Log.d("==============", "lower bound: "+allNotes[i].getFrequency()[0]);
//            Log.d("==============", "upper bound: "+allNotes[i].getFrequency()[1]);
//            Log.d("==============", "frequency:  "+frequency);
            if (allNotes[i].getFrequency()[0]<frequency && frequency < allNotes[i].getFrequency()[1])
            {
                returnString = allNotes[i].getName();
            }
        }
        Log.d("==============","returning: "+returnString);

        return returnString;
    }
}
