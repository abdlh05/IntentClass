package com.blogspot.codesgram.myintentapp.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.codesgram.myintentapp.R;

public class TampilBioData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_bio_data);

        TextView tv_nama = findViewById(R.id.tv_nama);
        TextView tv_ttl = findViewById(R.id.tv_ttl);
        TextView tv_kelas = findViewById(R.id.tv_kelas);
        TextView tv_alamat = findViewById(R.id.tv_alamat);
        TextView tv_hobi = findViewById(R.id.tv_hobi);

        tv_nama.setText(getIntent().getStringExtra("nama"));
        tv_ttl.setText(getIntent().getStringExtra("ttl"));
        tv_kelas.setText(getIntent().getStringExtra("kelas"));
        tv_alamat.setText(getIntent().getStringExtra("alamat"));
        tv_hobi.setText(getIntent().getStringExtra("hobi"));
    }
}