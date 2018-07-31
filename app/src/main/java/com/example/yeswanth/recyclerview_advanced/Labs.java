package com.example.yeswanth.recyclerview_advanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;

import com.thefinestartist.finestwebview.FinestWebView;

public class Labs extends AppCompatActivity {
    RelativeLayout relativeLayout, relativeLayout1,
            relativeLayout2, relativeLayout3, relativeLayout4, RelativeLayout7,
            relativeLayout5, relativeLayout6;
    String one = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fwww.1mglabs.com";
    String two = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fwww.thyrocare.com%2Fwellness%2FEmailer%2Femailer1.aspx%3Fval%3DUFJPSjEwMDkwNzgsUFJPSjEwMDkwNzksUFJPSjEwMDkwODAsUFJPSjEwMDkwODE%3D%26corpid%3DCORP121130%26orderM%3DADP1";
    String three = "https://www.srlworld.com";
    String four = "https://www.lalpathlabs.com";
    String five = "http://www.metropolisindia.com/patients/labs-home/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labs);
        relativeLayout = (RelativeLayout) findViewById(R.id.recycler_mg);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relate_thyro);
        relativeLayout2 = (RelativeLayout) findViewById(R.id.relate_myra);
        relativeLayout3 = (RelativeLayout) findViewById(R.id.relate_medlife);
        relativeLayout4 = (RelativeLayout) findViewById(R.id.relate_apolo);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(one, "1mg labs");
            }
        });
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(two, "Thyrocare");
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(three, "Srl labs");
            }
        });
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(four, "Lalpath labs");
            }
        });
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(five, "Metropolis");
            }
        });

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
