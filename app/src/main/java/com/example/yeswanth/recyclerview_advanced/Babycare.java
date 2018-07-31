package com.example.yeswanth.recyclerview_advanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;

import com.thefinestartist.finestwebview.FinestWebView;

public class Babycare extends AppCompatActivity {
    RelativeLayout relativeLayout, relativeLayout1,
            relativeLayout2;

    String one = "http://www.firstcry.com/m/";
    String two = "https://mybabycart.com";
    String three = "https://www.hopscotch.in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babycare);

        relativeLayout = (RelativeLayout) findViewById(R.id.recycler_mg);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relate_netmeds);
        relativeLayout2 = (RelativeLayout) findViewById(R.id.relate_myra);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(one, "First cry");
            }
        });
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(two, "MyBabycart");
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(three, "Hopscotch");
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
