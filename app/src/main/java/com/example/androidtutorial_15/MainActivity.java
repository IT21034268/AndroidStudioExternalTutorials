package com.example.androidtutorial_15;

import static com.example.androidtutorial_15.R.drawable.ic_android_black_24dp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch (view.getId()){
            case R.id.button_success:
                Toasty.success(getApplicationContext(),"Success Toast",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_error:
                Toasty.error(getApplicationContext(),"Error Toast",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_info:
                Toasty.info(getApplicationContext(),"Info Toast",Toasty.LENGTH_SHORT).show();
                break;

            case R.id.button_warning:
                Toasty.warning(getApplicationContext(),"Warning Toast",Toasty.LENGTH_SHORT).show();
                break;

            case R.id.button_normal:
                Toasty.normal(getApplicationContext(),"Toast with an icon,",Toasty.LENGTH_SHORT,ContextCompat.getDrawable(getApplicationContext(),ic_android_black_24dp)).show();

        }

    }
}