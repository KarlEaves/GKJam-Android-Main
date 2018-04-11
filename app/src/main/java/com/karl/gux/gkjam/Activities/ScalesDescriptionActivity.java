package com.karl.gux.gkjam.Activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.karl.gux.gkjam.Classes.Scales;
import com.karl.gux.gkjam.R;

import java.util.ArrayList;
import java.util.List;

public class ScalesDescriptionActivity extends AppCompatActivity {

    Scales scales;

    TextView A;
    TextView ASharp;
    TextView B;
    TextView C;
    TextView CSharp;
    TextView D;
    TextView DSharp;
    TextView E;
    TextView F;
    TextView FSharp;
    TextView G;
    TextView GSharp;

    List<TextView> textViews ;

    CardView ACard,ASharpCard,BCard,CCard,CSharpCard,DCard,DSharpCard,ECard,FCard,FSharpCard,GCard,GSharpCard;
    String scale_type;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scales_description);
        
        scales = new Scales();

        scale_type = getIntent().getStringExtra("scale");


        //===========TEXT VIEW===================
        A = findViewById(R.id.A);
        ASharp = findViewById(R.id.ASharp);
        B = findViewById(R.id.B);
        C = findViewById(R.id.C);
        CSharp = findViewById(R.id.CSharp);
        D = findViewById(R.id.D);
        DSharp = findViewById(R.id.DSharp);
        E = findViewById(R.id.E);
        F = findViewById(R.id.F);
        FSharp = findViewById(R.id.FSharp);
        G = findViewById(R.id.G);
        GSharp = findViewById(R.id.GSharp);

        textViews = new ArrayList<>();

        textViews.add(A);
        textViews.add(ASharp);
        textViews.add(B);
        textViews.add(C);
        textViews.add(CSharp);
        textViews.add(D);
        textViews.add(DSharp);
        textViews.add(E);
        textViews.add(F);
        textViews.add(FSharp);
        textViews.add(G);
        textViews.add(GSharp);

        //=========CARD VIEWS===========================
        ACard = findViewById(R.id.ACard);
        ASharpCard=findViewById(R.id.ASharpCard);
        BCard = findViewById(R.id.BCard);
        CCard = findViewById(R.id.CCard);
        CSharpCard=findViewById(R.id.CSharpCard);
        DCard = findViewById(R.id.DCard);
        DSharpCard=findViewById(R.id.DSharpCard);
        ECard = findViewById(R.id.ECard);
        FCard = findViewById(R.id.FCard);
        FSharpCard=findViewById(R.id.FSharpCard);
        GCard = findViewById(R.id.GCard);
        GSharpCard=findViewById(R.id.GSharpCard);




        this.write_scales(scale_type);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Drawable drawable = getDrawable(R.color.colorPrimary);
        getSupportActionBar().setBackgroundDrawable(drawable);

        onCardClickListerner(ACard);
        onCardClickListerner(ASharpCard);
        onCardClickListerner(BCard);
        onCardClickListerner(CCard);
        onCardClickListerner(CSharpCard);
        onCardClickListerner(DCard);
        onCardClickListerner(DSharpCard);
        onCardClickListerner(ECard);
        onCardClickListerner(FCard);
        onCardClickListerner(FSharpCard);
        onCardClickListerner(GCard);
        onCardClickListerner(GSharpCard);


    }

    public void onCardClickListerner(final CardView cardView) {
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IndividualScaleActivity.class);
                intent.putExtra("scale", scale_type.toString());

                //set text ofnote
                LinearLayout lin = (LinearLayout)cardView.getChildAt(0);
                TextView text = (TextView)lin.getChildAt(0);
                intent.putExtra("note",text.getText());
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void write_scales(String type_of_scale)
    {
        Log.i("==============", "write_scales: ");
        for (int i = 0; i< scales.music_notes.length; i++)
        {
            List<String> returned_notes = new ArrayList<>();
            if (type_of_scale.equals("major"))
            {
                Log.i("==============", "major: ");
                returned_notes = scales.make_major(scales.music_notes[i],scales.music_notes);
            }
            if (type_of_scale.equals("natural minor"))
            {
                returned_notes = scales.make_minor(scales.music_notes[i],scales.music_notes);
            }
            if (type_of_scale.equals("minor pentatonic"))
            {
                returned_notes = scales.make_pentatonic_minor(scales.music_notes[i],scales.music_notes);
            }
            if (type_of_scale.equals("major pentatonic"))
            {
                returned_notes = scales.make_pentatonic_major(scales.music_notes[i],scales.music_notes);
            }
//            if(type_of_scale.equals("majbeb"))
//            {
//                returned_notes = this.make_bebop_major(scales.music_notes[i],scales.music_notes);
//            }
//            if(scale_type.equals("minbeb"))
//            {
//                returned_notes = this.make_bebop_minor(scales.music_notes[i],scales.music_notes);
//            }
            if(type_of_scale.equals("major blues"))
            {
                returned_notes = scales.make_major_blues(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("minor blues"))
            {
                returned_notes = scales.make_minor_blues(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("harmonic minor"))
            {
                returned_notes = scales.make_harmonic_minor(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("melodic minor"))
            {
                returned_notes = scales.make_melodic_minor(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("ionian"))
            {
                returned_notes = scales.make_major(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("aeolian"))
            {
                returned_notes = scales.make_minor(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("dorian"))
            {
                returned_notes = scales.make_dorian(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("phrygian"))
            {
                returned_notes = scales.make_phrygian(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("lydian"))
            {
                returned_notes = scales.make_lydian(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("mixolydian"))
            {
                returned_notes = scales.make_mixolydian(scales.music_notes[i],scales.music_notes);
            }
            if(type_of_scale.equals("locrian"))
            {
                returned_notes = scales.make_locrian(scales.music_notes[i],scales.music_notes);
            }

            for (int j = 0;j<returned_notes.size();j++)
            {
                textViews.get(i).append(returned_notes.get(j));
                if (j!=returned_notes.size()-1)
                {
                    textViews.get(i).append(" - ");
                }
            }

        }
    }
}
