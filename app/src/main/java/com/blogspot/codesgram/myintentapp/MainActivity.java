package com.blogspot.codesgram.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.codesgram.myintentapp.biodata.IsiBioData;
import com.blogspot.codesgram.myintentapp.biodata.TampilBioData;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveData = findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        Button btnObject = findViewById(R.id.btn_object);
        btnObject.setOnClickListener(this);

        Button btnBioData = findViewById(R.id.btn_biodata);
        btnBioData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_data:
                Intent Mdata = new Intent(MainActivity.this, MoveActivity.class);
                Mdata.putExtra("data1","Yeay Pindah :)");
                Mdata.putExtra("data2","Bisa Kaaaaaan!!!");
                startActivity(Mdata);
                break;

            case R.id.btn_object:
                Person person = new Person("Abdullah","kepo@gmail.com","malang",16);
                Intent Mobject = new Intent(MainActivity.this, MoveWithObject.class);
                Mobject.putExtra(MoveWithObject.EXTRA_PERSON, person);
                startActivity(Mobject);
                break;

            case R.id.btn_biodata:
                Intent biodata = new Intent(MainActivity.this, IsiBioData.class);
                startActivity(biodata);
                break;
        }
    }

}