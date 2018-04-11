package com.karl.gux.gkjam.Activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.karl.gux.gkjam.R;

public class NewToScalesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scales_text_dialog);

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
