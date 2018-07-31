package com.example.yeswanth.recyclerview_advanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.yeswanth.recyclerview_advanced.Adapter.Mediceneadap;
import com.thefinestartist.finestwebview.FinestWebView;

import java.util.ArrayList;

public class Medicines extends AppCompatActivity {
    RecyclerView recyclerView;
    RelativeLayout relativeLayout, relativeLayout1,
            relativeLayout2, relativeLayout3, relativeLayout4, RelativeLayout7,
            relativeLayout5, relativeLayout6;
    /*int[] icons = {R.drawable.one_mg, R.drawable.medicine_info, R.drawable.labs, R.drawable.doctor, R.drawable.weight,
            R.drawable.health_care, R.drawable.ayurveda, R.drawable.homeopathy, R.drawable.nutrition, R.drawable.gyms, R.drawable.yoga, R.drawable.babyandpregnent};
    String[] text = {"One MG", "Medicine info", "Labs", "Doctor consultation", "\n" +
            "Weightloss", "Homecare", "Ayurveda", "Homeopathy", "Nutrition ", "Gyms", "Yoga", "Pregnency /Baby care"};
    ArrayList<ModelClass> arrayList = new ArrayList<>();
  */ Mediceneadap recyclerviewAdapter;
    ModelClass model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines);


        final String one = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fwww.1mg.com";
        final String three = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fwww.netmeds.com%2F";
        final String myra = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fmyramed.in%2F";
        final String five = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fm.medlife.com%2F";
        final String apolo = "https://www.apollopharmacy.in";
        final String med = "https://www.medplusmart.com/pharmaHome";

        relativeLayout = (RelativeLayout) findViewById(R.id.recycler_mg);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relate_netmeds);
        relativeLayout2 = (RelativeLayout) findViewById(R.id.relate_myra);
        relativeLayout3 = (RelativeLayout) findViewById(R.id.relate_medlife);
        relativeLayout4 = (RelativeLayout) findViewById(R.id.relate_apolo);
        relativeLayout5 = (RelativeLayout) findViewById(R.id.relate_medplus);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(one, "1MG");
            }
        });
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(three, "Netmeds");

            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(myra, "Myra");
            }
        });
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(five, "Med Life");
            }
        });
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(apolo, "Apolo");
            }
        });
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(med, "Medplus");
            }
        });
       /* recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerviewAdapter = new Mediceneadap(getApplicationContext(), arrayList);
        recyclerView.setAdapter(recyclerviewAdapter);
        setData();
   */
    }

  /*  public void setData() {
        for (int i = 0; i < text.length; i++) {
            model = new ModelClass(text[i], icons[i]);
            arrayList.add(model);
        }
    }*/


    public void black(String url, String title) {
        new FinestWebView.Builder(getApplicationContext()).theme(R.style.FinestWebViewTheme)
                .titleDefault(title)
                .toolbarScrollFlags(0)
                .showUrl(false)
                .statusBarColorRes(R.color.blackPrimaryDark)
                .toolbarColorRes(R.color.blackPrimary)
                .titleColorRes(R.color.finestWhite)
                .urlColorRes(R.color.blackPrimaryLight)
                .iconDefaultColorRes(R.color.finestWhite)
                .progressBarColorRes(R.color.finestWhite)
                .swipeRefreshColorRes(R.color.blackPrimaryDark)
                .menuSelector(R.drawable.selector_light_theme)
                .menuTextGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT)
                .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
                .dividerHeight(0)
                .gradientDivider(false)
                //                    .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                .setCustomAnimations(R.anim.slide_left_in, R.anim.hold, R.anim.hold,
                        R.anim.slide_right_out)
                //                    .setCustomAnimations(R.anim.fade_in_fast, R.anim.fade_out_medium, R.anim.fade_in_medium, R.anim.fade_out_fast)
                .disableIconBack(true)
                .disableIconClose(false)
                .disableIconForward(true)
                .disableIconMenu(true)
                .show(url);


    }

    public void blue(String url, String title) {

        new FinestWebView.Builder(this).theme(R.style.FinestWebViewTheme)
                .titleDefault(title)
                .showUrl(false)
                .statusBarColorRes(R.color.bluePrimaryDark)
                .toolbarColorRes(R.color.bluePrimary)
                .titleColorRes(R.color.finestWhite)
                .urlColorRes(R.color.bluePrimaryLight)
                .iconDefaultColorRes(R.color.finestWhite)
                .progressBarColorRes(R.color.finestWhite)
                .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                .showSwipeRefreshLayout(true)
                .showIconMenu(false)
                .swipeRefreshColorRes(R.color.bluePrimaryDark)
                .menuSelector(R.drawable.selector_light_theme)
                .menuTextGravity(Gravity.CENTER)
                .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
                .dividerHeight(0)
                .gradientDivider(false)
                .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                .show(url);
    }

}
