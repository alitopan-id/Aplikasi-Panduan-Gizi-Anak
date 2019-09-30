package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AngkaKecukupanGiziActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka_kecukupan_gizi);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.idangkagizi1);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AngkaKecukupanGiziActivity.this, Menu2_13Activity.class);
                startActivity(intent);

            }
        });
    }
}
