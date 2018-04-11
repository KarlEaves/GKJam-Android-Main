package com.karl.gux.gkjam.Activities;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.karl.gux.gkjam.R;

public class IndividualScaleActivity extends AppCompatActivity {

    TextView scaleTextView, noteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_scale);

        scaleTextView = findViewById(R.id.scale);
        noteTextView  =findViewById(R.id.note);


        String scale = getIntent().getStringExtra("scale");
        String note = getIntent().getStringExtra("note");

        scaleTextView.setText(scale);
        noteTextView.setText(note);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Drawable drawable = getDrawable(R.color.colorPrimary);
        getSupportActionBar().setBackgroundDrawable(drawable);



    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
