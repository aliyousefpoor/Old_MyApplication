package com.example.ali.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Ali on 7/13/2017.
 */

public class Info extends AppCompatActivity {

    TextView txt;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);

        txt = (TextView) findViewById(R.id.txt);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt.setText(getIntent().getExtras().getString("thetext"));
        txt1.setText(getIntent().getExtras().getString("thetext1"));
    }
}
