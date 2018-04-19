package com.karl.gux.gkjam.Classes;

import java.util.List;

/**
 * Created by Karl on 4/16/2018.
 */

public class ScalePrioritizer {
    List<String> scales_to_organize;

    List<String> most_likely_scales;
    List<String> remaining_scales;

    List<String> pentatonic_scales;
    List<String> major_and_minor_scales;
    List<String> blues_scales;
    List<String> bebop_scales;
    List<String> jazz_scales;

    public ScalePrioritizer(List<String> input_scales){
        scales_to_organize = input_scales;
        categorize_scales();
    }

    //puts scales into category based on the type (pentatonic, blues, bebop, major/minor, jazz)
    private void categorize_scales()
    {
        for (String scale:scales_to_organize)
        {
            //if the scale returns a type of pentatonic, it is usually the best scale to play in
            if (scale.contains("pentatonic"))
            {
                pentatonic_scales.add(scale);
            }
            else if (scale.contains("blues"))
            {
                blues_scales.add(scale);
            }
            else if (scale.contains("bebop"))
            {
                bebop_scales.add(scale);
            }
            else if (scale.contains("major")||scale.contains("minor"))
            {
                major_and_minor_scales.add(scale);
            }
            else{
                jazz_scales.add(scale);
            }
        }
    }

    private void organize_scales()
    {

    }
}
