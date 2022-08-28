package com.example.androidtutorial_17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSave , btnLoad;
    EditText txtName , txtAge;

    String name;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = findViewById(R.id.btn_save);
        btnLoad = findViewById(R.id.btn_load);

        txtName = findViewById(R.id.name);
        txtAge = findViewById(R.id.age);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = txtName.getText().toString();
                age = Integer.parseInt(txtAge.getText().toString());

                SharedPreferences prf = getSharedPreferences("details",MODE_PRIVATE);
                SharedPreferences.Editor editor = prf.edit();
                editor.putString("name",name);
                editor.putInt("age",age);
                editor.commit();
                Toast.makeText(getApplicationContext(),"Data Saved",Toast.LENGTH_LONG).show();

            }
        });

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences prf = getSharedPreferences("details",MODE_PRIVATE);
                String name = prf.getString("name","unknown");
                int age = prf.getInt("age" , 0);
                Toast.makeText(getApplicationContext(),"name : " + name + " age : " + age,Toast.LENGTH_LONG).show();

            }
        });




    }
}