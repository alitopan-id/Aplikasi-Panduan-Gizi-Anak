package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nama = (EditText)findViewById(R.id.idnama);
        final EditText usia = (EditText)findViewById(R.id.idusia);
        final EditText alamat = (EditText)findViewById(R.id.idalamat);



        Button btn = (Button)findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                if(nama.getText().toString().isEmpty() && usia.getText().toString().isEmpty() && alamat.getText().toString().isEmpty() ){
//
//                    Toast.makeText(getApplicationContext(),"Harap diisi kolom di atas",Toast.LENGTH_LONG).show();
//                }
//
//                else{
//                    FirebaseDatabase database = FirebaseDatabase.getInstance();
//                    DatabaseReference namaa = database.getReference("nama");
//                    DatabaseReference usiaa = database.getReference("usia");
//                    DatabaseReference alamatt = database.getReference("pekerjaan");
//                    namaa.child("").setValue(nama.getText().toString());
//                    usiaa.setValue(usia.getText().toString());
//                    alamatt.setValue(alamat.getText().toString());
//                    Toast.makeText(getApplicationContext(),"Login Berhasil ",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, SplashActivity.class);
                    startActivity(intent);
//
//                }



            }
        });

    }
}
