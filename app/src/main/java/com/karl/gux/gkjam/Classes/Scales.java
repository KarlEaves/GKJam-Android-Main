package com.karl.gux.gkjam.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karl on 3/28/2018.
 */

public class Scales {

    public List<List<String>> major_scales = new ArrayList<>();
    public List<List<String>> minor_scales = new ArrayList<>();
    public List<List<String>> major_pentatonic_scales = new ArrayList<>();
    public List<List<String>> minor_pentatonic_scales = new ArrayList<>();
    public List<List<String>> minor_melodic_scales = new ArrayList<>();
    public List<List<String>> minor_harmonic_scales = new ArrayList<>();
    public List<List<String>> minor_blues_scales = new ArrayList<>();
    public List<List<String>> major_blues_scales = new ArrayList<>();
    public List<List<String>> major_bebop_scales = new ArrayList<>();
    public List<List<String>> minor_bebop_scales = new ArrayList<>();
    public List<List<String>> dorian_scales = new ArrayList<>();
    public List<List<String>> phrygian_scales = new ArrayList<>();
    public List<List<String>> lydian_scales = new ArrayList<>();
    public List<List<String>> mixolydian_scales = new ArrayList<>();
    public List<List<String>> locrian_scales = new ArrayList<>();
    public List<List<String>> aeolian_scales = new ArrayList<>();


    public String[] music_notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
    //declare major scales
    List<String> a_major_scale = this.make_major("A", this.music_notes);
    List<String> a_sharp_major_scale = this.make_major("A#", this.music_notes);
    List<String> b_major_scale = this.make_major("B", this.music_notes);
    List<String> c_major_scale = this.make_major("C", this.music_notes);
    List<String> c_sharp_major_scale = this.make_major("C#", this.music_notes);
    List<String> d_major_scale = this.make_major("D", this.music_notes);
    List<String> d_sharp_major_scale = this.make_major("D#", this.music_notes);
    List<String> e_major_scale = this.make_major("E", this.music_notes);
    List<String> f_major_scale = this.make_major("F", this.music_notes);
    List<String> f_sharp_major_scale = this.make_major("F#", this.music_notes);
    List<String> g_major_scale = this.make_major("G", this.music_notes);
    List<String> g_sharp_major_scale = this.make_major("G#", this.music_notes);

    //declare minor scales
    List<String> a_minor_scale = this.make_minor("A", this.music_notes);
    List<String> a_sharp_minor_scale = this.make_minor("A#", this.music_notes);
    List<String> b_minor_scale = this.make_minor("B", this.music_notes);
    List<String> c_minor_scale = this.make_minor("C", this.music_notes);
    List<String> c_sharp_minor_scale = this.make_minor("C#", this.music_notes);
    List<String> d_minor_scale = this.make_minor("D", this.music_notes);
    List<String> d_sharp_minor_scale = this.make_minor("D#", this.music_notes);
    List<String> e_minor_scale = this.make_minor("E", this.music_notes);
    List<String> f_minor_scale = this.make_minor("F", this.music_notes);
    List<String> f_sharp_minor_scale = this.make_minor("F#", this.music_notes);
    List<String> g_minor_scale = this.make_minor("G", this.music_notes);
    List<String> g_sharp_minor_scale = this.make_minor("G#", this.music_notes);

    //declare major pentatonic scales
    List<String> a_major_p_scale = this.make_pentatonic_major("A", this.music_notes);
    List<String> a_sharp_major_p_scale = this.make_pentatonic_major("A#", this.music_notes);
    List<String> b_major_p_scale = this.make_pentatonic_major("B", this.music_notes);
    List<String> c_major_p_scale = this.make_pentatonic_major("C", this.music_notes);
    List<String> c_sharp_major_p_scale = this.make_pentatonic_major("C#", this.music_notes);
    List<String> d_major_p_scale = this.make_pentatonic_major("D", this.music_notes);
    List<String> d_sharp_major_p_scale = this.make_pentatonic_major("D#", this.music_notes);
    List<String> e_major_p_scale = this.make_pentatonic_major("E", this.music_notes);
    List<String> f_major_p_scale = this.make_pentatonic_major("F", this.music_notes);
    List<String> f_sharp_major_p_scale = this.make_pentatonic_major("F#", this.music_notes);
    List<String> g_major_p_scale = this.make_pentatonic_major("G", this.music_notes);
    List<String> g_sharp_major_p_scale = this.make_pentatonic_major("G#", this.music_notes);

    //declare minor pentatonic scales
    List<String> a_minor_p_scale = this.make_pentatonic_minor("A", this.music_notes);
    List<String> a_sharp_minor_p_scale = this.make_pentatonic_minor("A#", this.music_notes);
    List<String> b_minor_p_scale = this.make_pentatonic_minor("B", this.music_notes);
    List<String> c_minor_p_scale = this.make_pentatonic_minor("C", this.music_notes);
    List<String> c_sharp_minor_p_scale = this.make_pentatonic_minor("C#", this.music_notes);
    List<String> d_minor_p_scale = this.make_pentatonic_minor("D", this.music_notes);
    List<String> d_sharp_minor_p_scale = this.make_pentatonic_minor("D#", this.music_notes);
    List<String> e_minor_p_scale = this.make_pentatonic_minor("E", this.music_notes);
    List<String>  f_minor_p_scale = this.make_pentatonic_minor("F", this.music_notes);
    List<String> f_sharp_minor_p_scale = this.make_pentatonic_minor("F#", this.music_notes);
    List<String> g_minor_p_scale = this.make_pentatonic_minor("G", this.music_notes);
    List<String> g_sharp_minor_p_scale = this.make_pentatonic_minor("G#", this.music_notes);

    //declare melodic minor scales
    List<String> a_minor_melodic_scale = this.make_melodic_minor("A", this.music_notes);
    List<String> a_sharp_minor_melodic_scale = this.make_melodic_minor("A#", this.music_notes);
    List<String> b_minor_melodic_scale = this.make_melodic_minor("B", this.music_notes);
    List<String> c_minor_melodic_scale = this.make_melodic_minor("C", this.music_notes);
    List<String> c_sharp_minor_melodic_scale = this.make_melodic_minor("C#", this.music_notes);
    List<String> d_minor_melodic_scale = this.make_melodic_minor("D", this.music_notes);
    List<String> d_sharp_minor_melodic_scale = this.make_melodic_minor("D#", this.music_notes);
    List<String> e_minor_melodic_scale = this.make_melodic_minor("E", this.music_notes);
    List<String> f_minor_melodic_scale = this.make_melodic_minor("F", this.music_notes);
    List<String> f_sharp_minor_melodic_scale = this.make_melodic_minor("F#", this.music_notes);
    List<String> g_minor_melodic_scale = this.make_melodic_minor("G", this.music_notes);
    List<String> g_sharp_minor_melodic_scale = this.make_melodic_minor("G#", this.music_notes);

    //declare harmonic minor scales
    List<String> a_minor_harmonic_scale = this.make_harmonic_minor("A", this.music_notes);
    List<String> a_sharp_minor_harmonic_scale = this.make_harmonic_minor("A#", this.music_notes);
    List<String> b_minor_harmonic_scale = this.make_harmonic_minor("B", this.music_notes);
    List<String> c_minor_harmonic_scale = this.make_harmonic_minor("C", this.music_notes);
    List<String> c_sharp_minor_harmonic_scale = this.make_harmonic_minor("C#", this.music_notes);
    List<String> d_minor_harmonic_scale = this.make_harmonic_minor("D", this.music_notes);
    List<String> d_sharp_minor_harmonic_scale = this.make_harmonic_minor("D#", this.music_notes);
    List<String> e_minor_harmonic_scale = this.make_harmonic_minor("E", this.music_notes);
    List<String> f_minor_harmonic_scale = this.make_harmonic_minor("F", this.music_notes);
    List<String> f_sharp_minor_harmonic_scale = this.make_harmonic_minor("F#", this.music_notes);
    List<String> g_minor_harmonic_scale = this.make_harmonic_minor("G", this.music_notes);
    List<String> g_sharp_minor_harmonic_scale = this.make_harmonic_minor("G#", this.music_notes);

    //declare  minor blues scales
    List<String> a_minor_blues_scale = this.make_minor_blues("A", this.music_notes);
    List<String> a_sharp_minor_blues_scale = this.make_minor_blues("A#", this.music_notes);
    List<String> b_minor_blues_scale = this.make_minor_blues("B", this.music_notes);
    List<String> c_minor_blues_scale = this.make_minor_blues("C", this.music_notes);
    List<String> c_sharp_minor_blues_scale = this.make_minor_blues("C#", this.music_notes);
    List<String> d_minor_blues_scale = this.make_minor_blues("D", this.music_notes);
    List<String> d_sharp_minor_blues_scale = this.make_minor_blues("D#", this.music_notes);
    List<String> e_minor_blues_scale = this.make_minor_blues("E", this.music_notes);
    List<String> f_minor_blues_scale = this.make_minor_blues("F", this.music_notes);
    List<String> f_sharp_minor_blues_scale = this.make_minor_blues("F#", this.music_notes);
    List<String> g_minor_blues_scale = this.make_minor_blues("G", this.music_notes);
    List<String> g_sharp_minor_blues_scale = this.make_minor_blues("G#", this.music_notes);

    //declare  major blues scales
    List<String> a_major_blues_scale = this.f_sharp_minor_blues_scale;
    List<String> a_sharp_major_blues_scale = this.g_minor_blues_scale;
    List<String> b_major_blues_scale = this.g_sharp_minor_blues_scale;
    List<String> c_major_blues_scale = this.a_minor_blues_scale;
    List<String> c_sharp_major_blues_scale = this.a_sharp_minor_blues_scale;
    List<String> d_major_blues_scale = this.b_minor_blues_scale;
    List<String>  d_sharp_major_blues_scale = this.c_minor_blues_scale;
    List<String> e_major_blues_scale = this.c_sharp_minor_blues_scale;
    List<String> f_major_blues_scale = this.d_minor_blues_scale;
    List<String> f_sharp_major_blues_scale = this.d_sharp_minor_blues_scale;
    List<String> g_major_blues_scale = this.e_minor_blues_scale;
    List<String> g_sharp_major_blues_scale = this.f_minor_blues_scale;

    //declare  minor bebop scales
    List<String> a_minor_bebop_scale = this.make_bebop_minor("A", this.music_notes);
    List<String> a_sharp_minor_bebop_scale = this.make_bebop_minor("A#", this.music_notes);
    List<String> b_minor_bebop_scale = this.make_bebop_minor("B", this.music_notes);
    List<String> c_minor_bebop_scale = this.make_bebop_minor("C", this.music_notes);
    List<String> c_sharp_minor_bebop_scale = this.make_bebop_minor("C#", this.music_notes);
    List<String> d_minor_bebop_scale = this.make_bebop_minor("D", this.music_notes);
    List<String> d_sharp_minor_bebop_scale = this.make_bebop_minor("D#", this.music_notes);
    List<String> e_minor_bebop_scale = this.make_bebop_minor("E", this.music_notes);
    List<String> f_minor_bebop_scale = this.make_bebop_minor("F", this.music_notes);
    List<String> f_sharp_minor_bebop_scale = this.make_bebop_minor("F#", this.music_notes);
    List<String> g_minor_bebop_scale = this.make_bebop_minor("G", this.music_notes);
    List<String> g_sharp_minor_bebop_scale = this.make_bebop_minor("G#", this.music_notes);

    //declare major bebop scales
    List<String> a_major_bebop_scale = this.make_bebop_major("A", this.music_notes);
    List<String> a_sharp_major_bebop_scale = this.make_bebop_major("A#", this.music_notes);
    List<String>  b_major_bebop_scale = this.make_bebop_major("B", this.music_notes);
    List<String> c_major_bebop_scale = this.make_bebop_major("C", this.music_notes);
    List<String>  c_sharp_major_bebop_scale = this.make_bebop_major("C#", this.music_notes);
    List<String> d_major_bebop_scale = this.make_bebop_major("D", this.music_notes);
    List<String> d_sharp_major_bebop_scale = this.make_bebop_major("D#", this.music_notes);
    List<String> e_major_bebop_scale = this.make_bebop_major("E", this.music_notes);
    List<String> f_major_bebop_scale = this.make_bebop_major("F", this.music_notes);
    List<String> f_sharp_major_bebop_scale = this.make_bebop_major("F#", this.music_notes);
    List<String> g_major_bebop_scale = this.make_bebop_major("G", this.music_notes);
    List<String> g_sharp_major_bebop_scale = this.make_bebop_major("G#", this.music_notes);

    //declare dorian scales
    List<String> a_dorian_scale = this.make_major("G", this.music_notes);
    List<String> a_sharp_dorian_scale = this.make_major("G#", this.music_notes);
    List<String> b_dorian_scale = this.make_major("A", this.music_notes);
    List<String> c_dorian_scale = this.make_major("A#", this.music_notes);
    List<String> c_sharp_dorian_scale = this.make_major("B", this.music_notes);
    List<String> d_dorian_scale = this.make_major("C", this.music_notes);
    List<String>  d_sharp_dorian_scale = this.make_major("C#", this.music_notes);
    List<String> e_dorian_scale = this.make_major("D", this.music_notes);
    List<String> f_dorian_scale = this.make_major("D#", this.music_notes);
    List<String> f_sharp_dorian_scale = this.make_major("E", this.music_notes);
    List<String> g_dorian_scale = this.make_major("F", this.music_notes);
    List<String> g_sharp_dorian_scale = this.make_major("F#", this.music_notes);

    //declare phrygian scales
    List<String> a_phrygian_scale = this.make_major("F", this.music_notes);
    List<String> a_sharp_phrygian_scale = this.make_major("F#", this.music_notes);
    List<String> b_phrygian_scale = this.make_major("G", this.music_notes);
    List<String> c_phrygian_scale = this.make_major("G#", this.music_notes);
    List<String> c_sharp_phrygian_scale = this.make_major("A", this.music_notes);
    List<String> d_phrygian_scale = this.make_major("A#", this.music_notes);
    List<String> d_sharp_phrygian_scale = this.make_major("B", this.music_notes);
    List<String> e_phrygian_scale = this.make_major("C", this.music_notes);
    List<String> f_phrygian_scale = this.make_major("C#", this.music_notes);
    List<String> f_sharp_phrygian_scale = this.make_major("D", this.music_notes);
    List<String> g_phrygian_scale = this.make_major("D#", this.music_notes);
    List<String> g_sharp_phrygian_scale = this.make_major("E", this.music_notes);

    //declare lydian scales
    List<String> a_lydian_scale = this.make_major("E", this.music_notes);
    List<String> a_sharp_lydian_scale = this.make_major("F", this.music_notes);
    List<String> b_lydian_scale = this.make_major("F#", this.music_notes);
    List<String> c_lydian_scale = this.make_major("G", this.music_notes);
    List<String>  c_sharp_lydian_scale = this.make_major("G#", this.music_notes);
    List<String>  d_lydian_scale = this.make_major("A", this.music_notes);
    List<String>  d_sharp_lydian_scale = this.make_major("A#", this.music_notes);
    List<String>  e_lydian_scale = this.make_major("B", this.music_notes);
    List<String> f_lydian_scale = this.make_major("C", this.music_notes);
    List<String> f_sharp_lydian_scale = this.make_major("C#", this.music_notes);
    List<String> g_lydian_scale = this.make_major("D", this.music_notes);
    List<String> g_sharp_lydian_scale = this.make_major("D#", this.music_notes);

    //declare mixolydian scales
    List<String> a_mixolydian_scale = this.make_major("D", this.music_notes);
    List<String>  a_sharp_mixolydian_scale = this.make_major("D#", this.music_notes);
    List<String>  b_mixolydian_scale = this.make_major("E", this.music_notes);
    List<String> c_mixolydian_scale = this.make_major("F", this.music_notes);
    List<String> c_sharp_mixolydian_scale = this.make_major("F#", this.music_notes);
    List<String> d_mixolydian_scale = this.make_major("G", this.music_notes);
    List<String> d_sharp_mixolydian_scale = this.make_major("G#", this.music_notes);
    List<String> e_mixolydian_scale = this.make_major("A", this.music_notes);
    List<String> f_mixolydian_scale = this.make_major("A#", this.music_notes);
    List<String> f_sharp_mixolydian_scale = this.make_major("B", this.music_notes);
    List<String> g_mixolydian_scale = this.make_major("C", this.music_notes);
    List<String> g_sharp_mixolydian_scale = this.make_major("C#", this.music_notes);

    //declare aeolian scales
    List<String> a_aeolian_scale = this.make_minor("A", this.music_notes);
    List<String> a_sharp_aeolian_scale = this.make_minor("A#", this.music_notes);
    List<String> b_aeolian_scale = this.make_minor("B", this.music_notes);
    List<String> c_aeolian_scale = this.make_minor("C", this.music_notes);
    List<String> c_sharp_aeolian_scale = this.make_minor("C#", this.music_notes);
    List<String> d_aeolian_scale = this.make_minor("D", this.music_notes);
    List<String> d_sharp_aeolian_scale = this.make_minor("D#", this.music_notes);
    List<String> e_aeolian_scale = this.make_minor("E", this.music_notes);
    List<String> f_aeolian_scale = this.make_minor("F", this.music_notes);
    List<String> f_sharp_aeolian_scale = this.make_minor("F#", this.music_notes);
    List<String> g_aeolian_scale = this.make_minor("G", this.music_notes);
    List<String> g_sharp_aeolian_scale = this.make_minor("G#", this.music_notes);

    //declare locrian scales
    List<String> a_locrian_scale = this.make_major("A#", this.music_notes);
    List<String> a_sharp_locrian_scale = this.make_major("B", this.music_notes);
    List<String> b_locrian_scale = this.make_major("C", this.music_notes);
    List<String> c_locrian_scale = this.make_major("C#", this.music_notes);
    List<String> c_sharp_locrian_scale = this.make_major("D", this.music_notes);
    List<String>  d_locrian_scale = this.make_major("D#", this.music_notes);
    List<String>  d_sharp_locrian_scale = this.make_major("E", this.music_notes);
    List<String> e_locrian_scale = this.make_major("F", this.music_notes);
    List<String> f_locrian_scale = this.make_major("F#", this.music_notes);
    List<String> f_sharp_locrian_scale = this.make_major("G", this.music_notes);
    List<String> g_locrian_scale = this.make_major("G#", this.music_notes);
    List<String> g_sharp_locrian_scale = this.make_major("A", this.music_notes);

    //adds scales to a list
    public void make_scales() {
        //add major scales into array
        this.major_scales.add(this.a_major_scale);
        this.major_scales.add(this.a_sharp_major_scale);
        this.major_scales.add(this.b_major_scale);
        this.major_scales.add(this.c_major_scale);
        this.major_scales.add(this.c_sharp_major_scale);
        this.major_scales.add(this.d_major_scale);
        this.major_scales.add(this.d_sharp_major_scale);
        this.major_scales.add(this.e_major_scale);
        this.major_scales.add(this.f_major_scale);
        this.major_scales.add(this.f_sharp_major_scale);
        this.major_scales.add(this.g_major_scale);
        this.major_scales.add(this.g_sharp_major_scale);

        //add minor scales into array
        this.minor_scales.add(this.a_minor_scale);
        this.minor_scales.add(this.a_sharp_minor_scale);
        this.minor_scales.add(this.b_minor_scale);
        this.minor_scales.add(this.c_minor_scale);
        this.minor_scales.add(this.c_sharp_minor_scale);
        this.minor_scales.add(this.d_minor_scale);
        this.minor_scales.add(this.d_sharp_minor_scale);
        this.minor_scales.add(this.e_minor_scale);
        this.minor_scales.add(this.f_minor_scale);
        this.minor_scales.add(this.f_sharp_minor_scale);
        this.minor_scales.add(this.g_minor_scale);
        this.minor_scales.add(this.g_sharp_minor_scale);

        //add major pentatonic into array
        this.major_pentatonic_scales.add(this.a_major_p_scale);
        this.major_pentatonic_scales.add(this.a_sharp_major_p_scale);
        this.major_pentatonic_scales.add(this.b_major_p_scale);
        this.major_pentatonic_scales.add(this.c_major_p_scale);
        this.major_pentatonic_scales.add(this.c_sharp_major_p_scale);
        this.major_pentatonic_scales.add(this.d_major_p_scale);
        this.major_pentatonic_scales.add(this.d_sharp_major_p_scale);
        this.major_pentatonic_scales.add(this.e_major_p_scale);
        this.major_pentatonic_scales.add(this.f_major_p_scale);
        this.major_pentatonic_scales.add(this.f_sharp_major_p_scale);
        this.major_pentatonic_scales.add(this.g_major_p_scale);
        this.major_pentatonic_scales.add(this.g_sharp_major_p_scale);

        //add minor pentatonic into array
        this.minor_pentatonic_scales.add(this.a_minor_p_scale);
        this.minor_pentatonic_scales.add(this.a_sharp_minor_p_scale);
        this.minor_pentatonic_scales.add(this.b_minor_p_scale);
        this.minor_pentatonic_scales.add(this.c_minor_p_scale);
        this.minor_pentatonic_scales.add(this.c_sharp_minor_p_scale);
        this.minor_pentatonic_scales.add(this.d_minor_p_scale);
        this.minor_pentatonic_scales.add(this.d_sharp_minor_p_scale);
        this.minor_pentatonic_scales.add(this.e_minor_p_scale);
        this.minor_pentatonic_scales.add(this.f_minor_p_scale);
        this.minor_pentatonic_scales.add(this.f_sharp_minor_p_scale);
        this.minor_pentatonic_scales.add(this.g_minor_p_scale);
        this.minor_pentatonic_scales.add(this.g_sharp_minor_p_scale);

        this.minor_melodic_scales.add(this.a_minor_melodic_scale);
        this.minor_melodic_scales.add(this.a_sharp_minor_melodic_scale);
        this.minor_melodic_scales.add(this.b_minor_melodic_scale);
        this.minor_melodic_scales.add(this.c_minor_melodic_scale);
        this.minor_melodic_scales.add(this.c_sharp_minor_melodic_scale);
        this.minor_melodic_scales.add(this.d_minor_melodic_scale);
        this.minor_melodic_scales.add(this.d_sharp_minor_melodic_scale);
        this.minor_melodic_scales.add(this.e_minor_melodic_scale);
        this.minor_melodic_scales.add(this.f_minor_melodic_scale);
        this.minor_melodic_scales.add(this.f_sharp_minor_melodic_scale);
        this.minor_melodic_scales.add(this.g_minor_melodic_scale);
        this.minor_melodic_scales.add(this.g_sharp_minor_melodic_scale);

        this.minor_harmonic_scales.add(this.a_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.a_sharp_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.b_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.c_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.c_sharp_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.d_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.d_sharp_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.e_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.f_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.f_sharp_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.g_minor_harmonic_scale);
        this.minor_harmonic_scales.add(this.g_sharp_minor_harmonic_scale);

        this.minor_blues_scales.add(this.a_minor_blues_scale);
        this.minor_blues_scales.add(this.a_sharp_minor_blues_scale);
        this.minor_blues_scales.add(this.b_minor_blues_scale);
        this.minor_blues_scales.add(this.c_minor_blues_scale);
        this.minor_blues_scales.add(this.c_sharp_minor_blues_scale);
        this.minor_blues_scales.add(this.d_minor_blues_scale);
        this.minor_blues_scales.add(this.d_sharp_minor_blues_scale);
        this.minor_blues_scales.add(this.e_minor_blues_scale);
        this.minor_blues_scales.add(this.f_minor_blues_scale);
        this.minor_blues_scales.add(this.f_sharp_minor_blues_scale);
        this.minor_blues_scales.add(this.g_minor_blues_scale);
        this.minor_blues_scales.add(this.g_sharp_minor_blues_scale);

        this.major_blues_scales.add(this.a_major_blues_scale);
        this.major_blues_scales.add(this.a_sharp_major_blues_scale);
        this.major_blues_scales.add(this.b_major_blues_scale);
        this.major_blues_scales.add(this.c_major_blues_scale);
        this.major_blues_scales.add(this.c_sharp_major_blues_scale);
        this.major_blues_scales.add(this.d_major_blues_scale);
        this.major_blues_scales.add(this.d_sharp_major_blues_scale);
        this.major_blues_scales.add(this.e_major_blues_scale);
        this.major_blues_scales.add(this.f_major_blues_scale);
        this.major_blues_scales.add(this.f_sharp_major_blues_scale);
        this.major_blues_scales.add(this.g_major_blues_scale);
        this.major_blues_scales.add(this.g_sharp_major_blues_scale);

        this.locrian_scales.add(this.a_locrian_scale);
        this.locrian_scales.add(this.a_sharp_locrian_scale);
        this.locrian_scales.add(this.b_locrian_scale);
        this.locrian_scales.add(this.c_locrian_scale);
        this.locrian_scales.add(this.c_sharp_locrian_scale);
        this.locrian_scales.add(this.d_locrian_scale);
        this.locrian_scales.add(this.d_sharp_locrian_scale);
        this.locrian_scales.add(this.e_locrian_scale);
        this.locrian_scales.add(this.f_locrian_scale);
        this.locrian_scales.add(this.f_sharp_locrian_scale);
        this.locrian_scales.add(this.g_locrian_scale);
        this.locrian_scales.add(this.g_sharp_locrian_scale);

        this.dorian_scales.add(this.a_dorian_scale);
        this.dorian_scales.add(this.a_sharp_dorian_scale);
        this.dorian_scales.add(this.b_dorian_scale);
        this.dorian_scales.add(this.c_dorian_scale);
        this.dorian_scales.add(this.c_sharp_dorian_scale);
        this.dorian_scales.add(this.d_dorian_scale);
        this.dorian_scales.add(this.d_sharp_dorian_scale);
        this.dorian_scales.add(this.e_dorian_scale);
        this.dorian_scales.add(this.f_dorian_scale);
        this.dorian_scales.add(this.f_sharp_dorian_scale);
        this.dorian_scales.add(this.g_dorian_scale);
        this.dorian_scales.add(this.g_sharp_dorian_scale);

        this.mixolydian_scales.add(this.a_mixolydian_scale);
        this.mixolydian_scales.add(this.a_sharp_mixolydian_scale);
        this.mixolydian_scales.add(this.b_mixolydian_scale);
        this.mixolydian_scales.add(this.c_mixolydian_scale);
        this.mixolydian_scales.add(this.c_sharp_mixolydian_scale);
        this.mixolydian_scales.add(this.d_mixolydian_scale);
        this.mixolydian_scales.add(this.d_sharp_mixolydian_scale);
        this.mixolydian_scales.add(this.e_mixolydian_scale);
        this.mixolydian_scales.add(this.f_mixolydian_scale);
        this.mixolydian_scales.add(this.f_sharp_mixolydian_scale);
        this.mixolydian_scales.add(this.g_mixolydian_scale);
        this.mixolydian_scales.add(this.g_sharp_mixolydian_scale);

        this.lydian_scales.add(this.a_lydian_scale);
        this.lydian_scales.add(this.a_sharp_lydian_scale);
        this.lydian_scales.add(this.b_lydian_scale);
        this.lydian_scales.add(this.c_lydian_scale);
        this.lydian_scales.add(this.c_sharp_lydian_scale);
        this.lydian_scales.add(this.d_lydian_scale);
        this.lydian_scales.add(this.d_sharp_lydian_scale);
        this.lydian_scales.add(this.e_lydian_scale);
        this.lydian_scales.add(this.f_lydian_scale);
        this.lydian_scales.add(this.f_sharp_lydian_scale);
        this.lydian_scales.add(this.g_lydian_scale);
        this.lydian_scales.add(this.g_sharp_lydian_scale);

        this.phrygian_scales.add(this.a_phrygian_scale);
        this.phrygian_scales.add(this.a_sharp_phrygian_scale);
        this.phrygian_scales.add(this.b_phrygian_scale);
        this.phrygian_scales.add(this.c_phrygian_scale);
        this.phrygian_scales.add(this.c_sharp_phrygian_scale);
        this.phrygian_scales.add(this.d_phrygian_scale);
        this.phrygian_scales.add(this.d_sharp_phrygian_scale);
        this.phrygian_scales.add(this.e_phrygian_scale);
        this.phrygian_scales.add(this.f_phrygian_scale);
        this.phrygian_scales.add(this.f_sharp_phrygian_scale);
        this.phrygian_scales.add(this.g_phrygian_scale);
        this.phrygian_scales.add(this.g_sharp_phrygian_scale);

        this.aeolian_scales.add(this.a_aeolian_scale);
        this.aeolian_scales.add(this.a_sharp_aeolian_scale);
        this.aeolian_scales.add(this.b_aeolian_scale);
        this.aeolian_scales.add(this.c_aeolian_scale);
        this.aeolian_scales.add(this.c_sharp_aeolian_scale);
        this.aeolian_scales.add(this.d_aeolian_scale);
        this.aeolian_scales.add(this.d_sharp_aeolian_scale);
        this.aeolian_scales.add(this.e_aeolian_scale);
        this.aeolian_scales.add(this.f_aeolian_scale);
        this.aeolian_scales.add(this.f_sharp_aeolian_scale);
        this.aeolian_scales.add(this.g_aeolian_scale);
        this.aeolian_scales.add(this.g_sharp_aeolian_scale);

        this.major_bebop_scales.add(this.a_major_bebop_scale);
        this.major_bebop_scales.add(this.a_sharp_major_bebop_scale);
        this.major_bebop_scales.add(this.b_major_bebop_scale);
        this.major_bebop_scales.add(this.c_major_bebop_scale);
        this.major_bebop_scales.add(this.c_sharp_major_bebop_scale);
        this.major_bebop_scales.add(this.d_major_bebop_scale);
        this.major_bebop_scales.add(this.d_sharp_major_bebop_scale);
        this.major_bebop_scales.add(this.e_major_bebop_scale);
        this.major_bebop_scales.add(this.f_major_bebop_scale);
        this.major_bebop_scales.add(this.f_sharp_major_bebop_scale);
        this.major_bebop_scales.add(this.g_major_bebop_scale);
        this.major_bebop_scales.add(this.g_sharp_major_bebop_scale);

        this.minor_bebop_scales.add(this.a_minor_bebop_scale);
        this.minor_bebop_scales.add(this.a_sharp_minor_bebop_scale);
        this.minor_bebop_scales.add(this.b_minor_bebop_scale);
        this.minor_bebop_scales.add(this.c_minor_bebop_scale);
        this.minor_bebop_scales.add(this.c_sharp_minor_bebop_scale);
        this.minor_bebop_scales.add(this.d_minor_bebop_scale);
        this.minor_bebop_scales.add(this.d_sharp_minor_bebop_scale);
        this.minor_bebop_scales.add(this.e_minor_bebop_scale);
        this.minor_bebop_scales.add(this.f_minor_bebop_scale);
        this.minor_bebop_scales.add(this.f_sharp_minor_bebop_scale);
        this.minor_bebop_scales.add(this.g_minor_bebop_scale);
        this.minor_bebop_scales.add(this.g_sharp_minor_bebop_scale);

    }

    //these  s turn one note into a scale
    private List<String> make_major(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 2) % 12]);
        return_scale.add(notes[(i + 4) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 9) % 12]);
        return_scale.add(notes[(i + 11) % 12]);
        return return_scale;

    }

    private List<String> make_minor(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 2) % 12]);
        return_scale.add(notes[(i + 3) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 8) % 12]);
        return_scale.add(notes[(i + 10) % 12]);

        return return_scale;

    }

    private List<String> make_pentatonic_major(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 2) % 12]);
        return_scale.add(notes[(i + 4) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 9) % 12]);

        return return_scale;
    }

    private List<String> make_pentatonic_minor(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 3) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 10) % 12]);

        return return_scale;

    }

    private List<String> make_melodic_minor(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 2) % 12]);
        return_scale.add(notes[(i + 3) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 9) % 12]);
        return_scale.add(notes[(i + 11) % 12]);

        return return_scale;
    }

    private List<String> make_harmonic_minor(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 2) % 12]);
        return_scale.add(notes[(i + 3) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 8) % 12]);
        return_scale.add(notes[(i + 11) % 12]);

        return return_scale;
    }

    private List<String> make_minor_blues(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 3) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 6) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 10) % 12]);

        return return_scale;

    }

    private List<String> make_bebop_major(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 2) % 12]);
        return_scale.add(notes[(i + 4) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 8) % 12]);
        return_scale.add(notes[(i + 9) % 12]);
        return_scale.add(notes[(i + 11) % 12]);
        return return_scale;

    }

    private List<String> make_bebop_minor(String start_note, String[] notes) {
        List<String> return_scale = new ArrayList<>();
        int i = 0;
        while (start_note != notes[i])
        {
            i++;
        }
        return_scale.add(notes[i % 12]);
        return_scale.add(notes[(i + 2) % 12]);
        return_scale.add(notes[(i + 3) % 12]);
        return_scale.add(notes[(i + 4) % 12]);
        return_scale.add(notes[(i + 5) % 12]);
        return_scale.add(notes[(i + 7) % 12]);
        return_scale.add(notes[(i + 9) % 12]);
        return_scale.add(notes[(i + 10) % 12]);

        return return_scale;

    }

//    private List<String> make_lydian(String start_note, String[] notes) {
//
//        List<String> return_scale = new ArrayList<>();
//        int i = 0;
//        while (start_note != notes[i])
//        {
//            i++;
//        }
//        return_scale.add(notes[i % 12]);
//        return_scale.add(notes[(i + 2) % 12]);
//        return_scale.add(notes[(i + 4) % 12]);
//        return_scale.add(notes[(i + 6) % 12]);
//        return_scale.add(notes[(i + 7) % 12]);
//        return_scale.add(notes[(i + 9) % 12]);
//        return_scale.add(notes[(i + 11) % 12]);
//        return return_scale;
//
//    }
//
//    private List<String> make_mixolydian(String start_note, String[] notes) {
//
//        List<String> return_scale = new ArrayList<>();
//        int i = 0;
//        while (start_note != notes[i])
//        {
//            i++;
//        }
//        return_scale.add(notes[i % 12]);
//        return_scale.add(notes[(i + 2) % 12]);
//        return_scale.add(notes[(i + 4) % 12]);
//        return_scale.add(notes[(i + 5) % 12]);
//        return_scale.add(notes[(i + 7) % 12]);
//        return_scale.add(notes[(i + 9) % 12]);
//        return_scale.add(notes[(i + 10) % 12]);
//        return return_scale;
//
//    }
//
//    private List<String>  make_locrian(String start_note, String[] notes) {
//
//        List<String> return_scale = new ArrayList<>();
//        int i = 0;
//        while (start_note != notes[i])
//        {
//            i++;
//        }
//        return_scale.add(notes[i % 12]);
//        return_scale.add(notes[(i + 1) % 12]);
//        return_scale.add(notes[(i + 3) % 12]);
//        return_scale.add(notes[(i + 5) % 12]);
//        return_scale.add(notes[(i + 6) % 12]);
//        return_scale.add(notes[(i + 8) % 12]);
//        return_scale.add(notes[(i + 10) % 12]);
//        return return_scale;
//
//    }
//    private List<String> make_dorian(String start_note, String[] notes) {
//        List<String> return_scale = new ArrayList<>();
//        int i = 0;
//        while (start_note != notes[i])
//        {
//            i++;
//        }
//        return_scale.add(notes[i % 12]);
//        return_scale.add(notes[(i + 2) % 12]);
//        return_scale.add(notes[(i + 3) % 12]);
//        return_scale.add(notes[(i + 5) % 12]);
//        return_scale.add(notes[(i + 7) % 12]);
//        return_scale.add(notes[(i + 9) % 12]);
//        return_scale.add(notes[(i + 10) % 12]);
//        return return_scale;
//
//    }
//    private List<String> make_phrygian(String start_note, String[] notes) {
//        List<String> return_scale = new ArrayList<>();
//        int i = 0;
//        while (start_note != notes[i])
//        {
//            i++;
//        }
//        return_scale.add(notes[i % 12]);
//        return_scale.add(notes[(i + 1) % 12]);
//        return_scale.add(notes[(i + 3) % 12]);
//        return_scale.add(notes[(i + 5) % 12]);
//        return_scale.add(notes[(i + 7) % 12]);
//        return_scale.add(notes[(i + 8) % 12]);
//        return_scale.add(notes[(i + 10) % 12]);
//        return return_scale;
//
//    }
//
//    private List<String> make_major_blues(String start_note, String[] notes) {
//        List<String> return_scale = new ArrayList<>();
//        int i = 0;
//        while (start_note != notes[i])
//        {
//            i++;
//        }
//
//        return_scale.add(notes[i % 12]);
//        return_scale.add(notes[(i + 2) % 12]);
//        return_scale.add(notes[(i + 3) % 12]);
//        return_scale.add(notes[(i + 4) % 12]);
//        return_scale.add(notes[(i + 7) % 12]);
//        return_scale.add(notes[(i + 9) % 12]);
//
//        return return_scale;
//
//    }
}
