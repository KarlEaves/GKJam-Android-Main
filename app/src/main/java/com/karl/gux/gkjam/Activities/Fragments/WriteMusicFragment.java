package com.karl.gux.gkjam.Activities.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.karl.gux.gkjam.R;

public class WriteMusicFragment extends Fragment {
    public static WriteMusicFragment newInstance() {
        WriteMusicFragment fragment = new WriteMusicFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note_listener, container, false);
    }
}