package com.karl.gux.gkjam.Activities.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.karl.gux.gkjam.Activities.ScalesDescriptionActivity;
import com.karl.gux.gkjam.Activities.NewToScalesActivity;
import com.karl.gux.gkjam.R;

public class LearnScalesFragment extends Fragment {
    public static LearnScalesFragment newInstance() {
        LearnScalesFragment fragment = new LearnScalesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CardView testCardView = view.findViewById(R.id.new_to_scales_card);
        testCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), NewToScalesActivity.class);
                startActivity(intent);
            }
        });

        //Define linear layouts to hide/show
        final LinearLayout main_minor_button_layout = view.findViewById(R.id.main_minor_scale_layout);
        final LinearLayout hidden_minor_button_layout = view.findViewById(R.id.hidden_minor_scale_layout);

        final LinearLayout main_blues_button_layout = view.findViewById(R.id.main_blues_scale_layout);
        final LinearLayout hidden_blues_button_layout = view.findViewById(R.id.hidden_blues_scale_layout);

        final LinearLayout main_jazz_button_layout = view.findViewById(R.id.main_jazz_scale_layout);
        final LinearLayout hidden_jazz_button_layout = view.findViewById(R.id.hidden_jazz_scale_layout);

        final LinearLayout main_pentatonic_button_layout = view.findViewById(R.id.main_pentatonic_scale_layout);
        final LinearLayout hidden_pentatonic_button_layout = view.findViewById(R.id.hidden_pentatonic_scales_layout);

        //define cards to click
        CardView major_card = view.findViewById(R.id.major_scale_card);

        CardView minor_card = view.findViewById(R.id.minor_scale_card);
        CardView natural_minor_card = view.findViewById(R.id.natural_minor_card);
        CardView harmonic_minor_card = view.findViewById(R.id.harmonic_minor_card);
        CardView melodic_minor_card = view.findViewById(R.id.melodic_minor_card);

        CardView pentatonic_card = view.findViewById(R.id.pentatonic_card);
        CardView major_pentatonic_card = view.findViewById(R.id.major_pentatonic_card);
        CardView minor_pentatonic_card = view.findViewById(R.id.minor_pentatonic_card);

        CardView blues_card = view.findViewById(R.id.blues_card);
        CardView major_blues_card = view.findViewById(R.id.major_blues_card);
        CardView minor_blues_card = view.findViewById(R.id.minor_blues_card);

        CardView jazz_card = view.findViewById(R.id.jazz_card);
        CardView ionian_card = view.findViewById(R.id.ionian_card);
        CardView dorian_card = view.findViewById(R.id.dorian_card);
        CardView phrygian_card = view.findViewById(R.id.phrygian_card);
        CardView lydian_card = view.findViewById(R.id.lydian_card);
        CardView mixolydian_card = view.findViewById(R.id.mixolydian_card);
        CardView aeolian_card = view.findViewById(R.id.aeolian_card);
        CardView locrian_card = view.findViewById(R.id.locrian_card);

        minor_card.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                main_minor_button_layout.setVisibility(View.GONE);
                hidden_minor_button_layout.setVisibility(View.VISIBLE);

                main_blues_button_layout.setVisibility(View.VISIBLE);
                hidden_blues_button_layout.setVisibility(View.GONE);

                main_jazz_button_layout.setVisibility(View.VISIBLE);
                hidden_jazz_button_layout.setVisibility(View.GONE);

                main_pentatonic_button_layout.setVisibility(View.VISIBLE);
                hidden_pentatonic_button_layout.setVisibility(View.GONE);
            }
        });

        pentatonic_card.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                main_minor_button_layout.setVisibility(View.VISIBLE);
                hidden_minor_button_layout.setVisibility(View.GONE);

                main_blues_button_layout.setVisibility(View.VISIBLE);
                hidden_blues_button_layout.setVisibility(View.GONE);

                main_jazz_button_layout.setVisibility(View.VISIBLE);
                hidden_jazz_button_layout.setVisibility(View.GONE);

                main_pentatonic_button_layout.setVisibility(View.GONE);
                hidden_pentatonic_button_layout.setVisibility(View.VISIBLE);
            }
        });

        blues_card.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                main_minor_button_layout.setVisibility(View.VISIBLE);
                hidden_minor_button_layout.setVisibility(View.GONE);

                main_blues_button_layout.setVisibility(View.GONE);
                hidden_blues_button_layout.setVisibility(View.VISIBLE);

                main_jazz_button_layout.setVisibility(View.VISIBLE);
                hidden_jazz_button_layout.setVisibility(View.GONE);

                main_pentatonic_button_layout.setVisibility(View.VISIBLE);
                hidden_pentatonic_button_layout.setVisibility(View.GONE);
            }
        });

        jazz_card.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                main_minor_button_layout.setVisibility(View.VISIBLE);
                hidden_minor_button_layout.setVisibility(View.GONE);

                main_blues_button_layout.setVisibility(View.VISIBLE);
                hidden_blues_button_layout.setVisibility(View.GONE);

                main_jazz_button_layout.setVisibility(View.GONE);
                hidden_jazz_button_layout.setVisibility(View.VISIBLE);

                main_pentatonic_button_layout.setVisibility(View.VISIBLE);
                hidden_pentatonic_button_layout.setVisibility(View.GONE);
            }
        });
        
        
        //Sends to scale activity
        major_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "major");
                startActivity(intent);
            }
        });

        natural_minor_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "natural minor");
                startActivity(intent);
            }
        });

        harmonic_minor_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "harmonic minor");
                startActivity(intent);
            }
        });
        
        melodic_minor_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "melodic minor");
                startActivity(intent);
            }
        });

        major_pentatonic_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "major pentatonic");
                startActivity(intent);
            }
        });

        minor_pentatonic_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "minor pentatonic");
                startActivity(intent);
            }
        });

        major_blues_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "major blues");
                startActivity(intent);
            }
        });

        minor_blues_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "minor blues");
                startActivity(intent);
            }
        });

        ionian_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "ionian");
                startActivity(intent);
            }
        });

        dorian_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "dorian");
                startActivity(intent);
            }
        });

        phrygian_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "phrygian");
                startActivity(intent);
            }
        });

        lydian_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "lydian");
                startActivity(intent);
            }
        });
        mixolydian_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "mixolydian");
                startActivity(intent);
            }
        });

        aeolian_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "aeolian");
                startActivity(intent);
            }
        });

        locrian_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ScalesDescriptionActivity.class);
                intent.putExtra("scale", "locrian");
                startActivity(intent);
            }
        });
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_learn_scales, container, false);
    }


}