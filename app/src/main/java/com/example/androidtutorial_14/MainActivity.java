package com.example.androidtutorial_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {

        Toast toast = Toast.makeText(getApplicationContext(),"Hello this is a toast",Toast.LENGTH_LONG);
        toast.show();

    }
}