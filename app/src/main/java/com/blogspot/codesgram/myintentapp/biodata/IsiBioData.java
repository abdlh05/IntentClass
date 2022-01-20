package com.blogspot.codesgram.myintentapp.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.blogspot.codesgram.myintentapp.R;

public class IsiBioData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_bio_data);

        EditText edt_nama = findViewById(R.id.edt_nama);
        EditText edt_ttl = findViewById(R.id.edt_ttl);
        EditText edt_kelas = findViewById(R.id.edt_kelas);
        EditText edt_alamat = findViewById(R.id.edt_alamat);
        EditText edt_hobi = findViewById(R.id.edt_hobi);
        Button btn_simpan = findViewById(R.id.btn_simpan);
        Button btn_intent= findViewById(R.id.btn_intent);
        TextView tv_biodata = findViewById(R.id.tv_biodata);

        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bawadata = new Intent(IsiBioData.this, TampilBioData.class);
                bawadata.putExtra("nama", edt_nama.getText().toString());
                bawadata.putExtra("ttl", edt_ttl.getText().toString());
                bawadata.putExtra("kelas", edt_kelas.getText().toString());
                bawadata.putExtra("alamat", edt_alamat.getText().toString());
                bawadata.putExtra("hobi", edt_hobi.getText().toString());
                startActivity(bawadata);
            }
        });

        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_biodata.setText("Halo namaku " + edt_nama.getText().toString() +
                                   ", Aku lahir pada " + edt_ttl.getText().toString() +
                                   ", Aku Kelas " + edt_kelas.getText().toString() +
                                   ", Aku tinggal di " + edt_alamat.getText().toString() +
                                   ", Hobi ku " + edt_hobi.getText().toString());
            }
        });
    }
}