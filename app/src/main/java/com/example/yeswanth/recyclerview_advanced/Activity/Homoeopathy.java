package com.example.yeswanth.recyclerview_advanced.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.yeswanth.recyclerview_advanced.R;

public class Homoeopathy extends AppCompatActivity {
    RelativeLayout relativeLayout, relativeLayout1,
            relativeLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homoeopathy);
        relativeLayout = (RelativeLayout) findViewById(R.id.recycler_mg);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relate_netmeds);
        relativeLayout2 = (RelativeLayout) findViewById(R.id.relate_myra);


    }
}
