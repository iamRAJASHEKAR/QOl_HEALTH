package com.example.yeswanth.recyclerview_advanced;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.thefinestartist.finestwebview.FinestWebView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    Context context;
    SliderLayout sliderLayout;
    HashMap<String, Integer> slideimages;
    RecyclerView recyclerView;
    int[] icons = {R.drawable.buy_medicine, R.drawable.medicine_info, R.drawable.labs, R.drawable.doctor, R.drawable.weight,
            R.drawable.health_care, R.drawable.ayurveda, R.drawable.homeopathy, R.drawable.nutrition, R.drawable.gyms, R.drawable.yoga, R.drawable.babyandpregnent};
    String[] text = {"Medicines", "Medicine info", "Labs", "Doctor consultation", "\n" +
            "Weightloss", "Homecare", "Ayurveda", "Homeopathy", "Nutrition ", "Gyms", "Yoga", "Pregnency /Baby care"};
    ArrayList<ModelClass> arrayList = new ArrayList<>();
    RecyclerviewAdapter recyclerviewAdapter;
    ModelClass model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerviewAdapter = new RecyclerviewAdapter(getApplicationContext(), arrayList);
        recyclerView.setAdapter(recyclerviewAdapter);
        /*ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(getApplicationContext(),);
        recyclerView.addItemDecoration(itemDecoration);*/
       /* recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(context, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        //   Toast.makeText(context, "hi", Toast.LENGTH_SHORT).show();
                        // do whatever
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
*/
        setData();
        Log.e("size", " " + arrayList.size());
        sliderLayout = (SliderLayout) findViewById(R.id.imageslider1);
        slideimages = new HashMap<>();
        imageslideshow();


    }

    private void imageslideshow() {
        slideimages.put("one", R.drawable.mybabyoffer);
        slideimages.put("two", R.drawable.medoffer);
        slideimages.put("three", R.drawable.firstcryoffer);
        slideimages.put("four", R.drawable.onemgoffer);
        slideimages.put("five", R.drawable.apollooffer);

        Log.e("size", String.valueOf(slideimages.size()));

        for (final String string : slideimages.keySet()) {
            DefaultSliderView defaultSliderView = new DefaultSliderView(this);
            defaultSliderView.description(string)
                    .image(slideimages.get(string))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(MainActivity.this);
            Log.e("slidr", String.valueOf(slideimages.get(string)));
            // defaultSliderView.bundle(new Bundle());

            //defaultSliderView.getBundle().putString("extra",string);
/*
            defaultSliderView.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(BaseSliderView slider) {

                    Log.e("sachin", String.valueOf(slideimages.get(string)));
                    int ss = slideimages.get(string);
                    if (ss == 2131165304)
                    {
                        Intent intent = new Intent(getApplicationContext(), Webview.class);
                        startActivity(intent);
                    }
                    Toast.makeText(getApplicationContext(), String.valueOf(slideimages.get(string)), Toast.LENGTH_SHORT).show();
                }
            });*/
            sliderLayout.addSlider(defaultSliderView);
        }
        sliderLayout.setDuration(2000);
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.addOnPageChangeListener(MainActivity.this);

    }


    @Override
    public void onSliderClick(BaseSliderView slider) {
        //   slider.setOnSliderClickListener(null);

        Log.e("descriptio", slider.getDescription());
        String desc = slider.getDescription();
        if (desc.equals("one")) {
            Intent intent = new Intent(getApplicationContext(), Medicines.class);
            startActivity(intent);

        } else if (desc.equals("two")) {
            Intent intent = new Intent(getApplicationContext(), Medicineinfo.class);
            startActivity(intent);

        } else if (desc.equals("three")) {
            Intent intent = new Intent(getApplicationContext(), Medicines.class);
            startActivity(intent);

        } else if (desc.equals("four")) {
            Intent intent = new Intent(getApplicationContext(), Babycare.class);
            startActivity(intent);

        } else if (desc.equals("five")) {
            Intent intent = new Intent(getApplicationContext(), Yoga.class);
            startActivity(intent);

        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    public void nextpage(View view) {

    }

    //set data
    public void setData() {
        for (int i = 0; i < text.length; i++) {
            model = new ModelClass(text[i], icons[i]);
            arrayList.add(model);
        }
    }
}


