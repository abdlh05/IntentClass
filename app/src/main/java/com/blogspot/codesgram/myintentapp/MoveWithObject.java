package com.blogspot.codesgram.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObject extends AppCompatActivity {

    public static String EXTRA_PERSON = "extra_person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        if (getIntent() != null){
            TextView tvObject = (TextView) findViewById(R.id.txt_object);
            Person orang = getIntent().getParcelableExtra(EXTRA_PERSON);
            String text = " Name : "+orang.getName()+"\n Email : "+orang.getEmail()+"\n City : "+orang.getCity()+"\n Age : "+orang.getAge();
            tvObject.setText(text);
        }
    }
}