package com.example.androidtutorial_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;

    /*
    There is an error here
    String changed_text = Resources.getSystem().getString(R.string.app_final_text);
     */

    String changed_text = "I have changed";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.btnOK);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text = findViewById(R.id.txtHello);
                text.setText(changed_text);

            }
        });


    }




}