package com.karl.gux.gkjam.Activities.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;

import com.karl.gux.gkjam.Activities.Fragments.ScaleFragments.MajorScaleFragment;
import com.karl.gux.gkjam.Activities.Fragments.ScaleFragments.MinorScaleFragment;
import com.karl.gux.gkjam.Activities.Fragments.ScaleFragments.ScalesIntroFragment;
import com.karl.gux.gkjam.Activities.ScalesTextDialogActivity;
import com.karl.gux.gkjam.R;

import java.util.ArrayList;

import yalantis.com.sidemenu.interfaces.Resourceble;

public class ItemThreeFragment extends Fragment {
    public static ItemThreeFragment newInstance() {
        ItemThreeFragment fragment = new ItemThreeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CardView testCardView = view.findViewById(R.id.testid);
        testCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesTextDialogActivity.class);
                startActivity(intent);
            }
        });

//        final Button minor_scales_button = view.findViewById(R.id.minor_scale_button);
//        minor_scales_button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                view.findViewById(R.id.hidden_minor_scales).setVisibility(View.VISIBLE);
//                view.findViewById(R.id.hidden_jazz_scales1).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales2).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_blues_scales).setVisibility(View.GONE);
//
//
//
//            }
//        });
//
//        final Button scales_home_button = view.findViewById(R.id.scales_home_button);
//        scales_home_button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                view.findViewById(R.id.hidden_minor_scales).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales1).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales2).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_blues_scales).setVisibility(View.GONE);
//
//
//                Fragment scaleFragment = ScalesIntroFragment.newInstance("ok","ok");
//                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//                transaction.replace(R.id.frame_layout, scaleFragment).commit();
//
//            }
//        });
//
//        final Button jazz_scales_button = view.findViewById(R.id.jazz_scale_button);
//        jazz_scales_button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                view.findViewById(R.id.hidden_minor_scales).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales1).setVisibility(View.VISIBLE);
//                view.findViewById(R.id.hidden_jazz_scales2).setVisibility(View.VISIBLE);
//                view.findViewById(R.id.hidden_blues_scales).setVisibility(View.GONE);
//
//
//
//            }
//        });
//
//        final Button blues_scales_button = view.findViewById(R.id.blues_scale_button);
//        blues_scales_button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                view.findViewById(R.id.hidden_minor_scales).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales1).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales2).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_blues_scales).setVisibility(View.VISIBLE);
//
//
//
//            }
//        });
//
//
//        final Button major_scales_button = view.findViewById(R.id.major_scale_button);
//        major_scales_button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                view.findViewById(R.id.hidden_minor_scales).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_blues_scales).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales1).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales2).setVisibility(View.GONE);
//
//                Fragment scaleFragment = MajorScaleFragment.newInstance("ok","ok");
//                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//                transaction.replace(R.id.frame_layout, scaleFragment).commit();
//
//            }
//        });
//
//        final Button major_blues_scales_button = view.findViewById(R.id.major_blues_button);
//        major_blues_scales_button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                view.findViewById(R.id.hidden_minor_scales).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_blues_scales).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales1).setVisibility(View.GONE);
//                view.findViewById(R.id.hidden_jazz_scales2).setVisibility(View.GONE);
//
//                Fragment scaleFragment = MajorScaleFragment.newInstance("ok","ok");
//                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//                transaction.replace(R.id.frame_layout, scaleFragment).commit();
//
//            }
//        });
//        //=========default fragment=========================================================
//        Fragment scaleFragment = ScalesIntroFragment.newInstance("ok","ok");
//        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//        transaction.replace(R.id.frame_layout,scaleFragment).commit();
//        //=============================================================================
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_three, container, false);
    }


}