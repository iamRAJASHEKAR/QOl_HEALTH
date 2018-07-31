package com.example.yeswanth.recyclerview_advanced.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.yeswanth.recyclerview_advanced.R;

public class Ayurveda extends AppCompatActivity {
    RelativeLayout relativeLayout, relativeLayout1,
            relativeLayout2, relativeLayout3, relativeLayout4, RelativeLayout7,
            relativeLayout5, relativeLayout6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayurveda);
        relativeLayout = (RelativeLayout) findViewById(R.id.recycler_mg);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relate_netmeds);
        relativeLayout2 = (RelativeLayout) findViewById(R.id.relate_myra);
        relativeLayout3 = (RelativeLayout) findViewById(R.id.relate_medlife);
        relativeLayout4 = (RelativeLayout) findViewById(R.id.relate_apolo);
        relativeLayout5 = (RelativeLayout) findViewById(R.id.relate_medplus);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        relativeLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });


    }
}
