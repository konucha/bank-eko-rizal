package com.example.bankakprind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.bankakprind.model.RekeningModel;


public class Dashboard extends AppCompatActivity {

    TextView tvNama, tvAlamat;
Button btnAddTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().hide();

        Intent intentPrev = getIntent();
        RekeningModel akun = (RekeningModel) intentPrev.getSerializableExtra("akun");

        tvNama = findViewById(R.id.nama);
        tvAlamat = findViewById(R.id.alamat);

        tvNama.setText("Nama : " + akun.getNama());
        tvAlamat.setText("Alamat : " + akun.getAlamat());

       // btnAddTransaction = findViewById(R.id.btnAddTransaction);
        //btnAddTransaction.setOnClickListener(view ->{
          //  Intent intent = new Intent(getApplicationContext(), AddTransaction.class);
            //startActivity(intent);
       // });


//        getDataTransaksi(akun.getNoRekening());
    }

    private void getDataTransaksi(int noRekening) {

    }
}