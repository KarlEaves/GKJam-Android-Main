package com.karl.gux.gkjam;

import android.util.Log;

/**
 * Created by Karl on 3/28/2018.
 */

public class NotePitch {

    float[] frequency = {0,1};
    String name;

    public NotePitch(float frequency, String name)
    {
        this.frequency[0] = (float)(frequency * 0.98566319864);
        this.frequency[1] = (float)(frequency * 1.01454533494);
        this.name = name;
    }

    public float[] getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }

}
