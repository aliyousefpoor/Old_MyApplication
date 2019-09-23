package com.example.ali.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Ali on 7/13/2017.
 */

public class SignupActivity extends AppCompatActivity {

    EditText txt;
    EditText txt1;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        txt = (EditText) findViewById(R.id.txt);
        txt1 = (EditText) findViewById(R.id.txt1);
        btn4 = (Button) findViewById(R.id.btn4);


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, Info.class);
                intent.putExtra("thetext", txt.getText().toString());

                intent.putExtra("thetext1", txt1.getText().toString());


                if (txt.getText().toString().isEmpty()) {

                    txt.setError("This field can not be empty");
                } else {

                    startActivity(intent);
                }


            }
        });
    }



}
