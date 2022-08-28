package com.example.androidtutorial_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.btnOne);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"someone@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"This is our test subject");
        intent.putExtra(Intent.EXTRA_TEXT,"This is our test email body");
        intent.setType("message/rfc822");
        //intent.setType("text/plain");

        final Intent chooser;
        chooser = intent;

        Intent.createChooser(intent,"send email test app");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(chooser);

            }
        });

    }





}