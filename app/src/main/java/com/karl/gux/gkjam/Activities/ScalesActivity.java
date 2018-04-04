package com.karl.gux.gkjam.Activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.karl.gux.gkjam.R;

public class ScalesActivity extends Activity implements View.OnClickListener {

    Button ok_btn, cancel_btn;

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


//        String s = getIntent().getStringExtra("EXTRA_SESSION_ID");


        //getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_scales);

        ok_btn = (Button) findViewById(R.id.ok_btn_id);
        cancel_btn = (Button) findViewById(R.id.cancel_btn_id);

        textView1 = findViewById(R.id.textView1);

//        textView1.setText(s.toString());

        ok_btn.setOnClickListener(this);
        cancel_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ok_btn_id:

                showToastMessage("Ok Button Clicked");
                this.finish();

                break;

            case R.id.cancel_btn_id:

                showToastMessage("Cancel Button Clicked");
                this.finish();

                break;
        }

    }

    void showToastMessage(String message) {
//        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT)
//                .show();
    }

}