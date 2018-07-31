package com.example.yeswanth.recyclerview_advanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;

import com.thefinestartist.finestwebview.FinestWebView;

public class Labsnew extends AppCompatActivity {
    RelativeLayout relativeLayout, relativeLayout1,
            relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout7,
            relativeLayout5, relativeLayout6;
    String onemg = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fwww.1mg.com";
    String zoylo = "https://linksredirect.com/?pub_id=23484CL21133&source=linkkit&url=https%3A%2F%2Fwww.zoylo.com%2F";
    String practo = "https://www.practo.com";
    String lybrate = "https://www.lybrate.com";
    String just = "https://justdoc.com";
    String askap = "https://www.askapollo.com";
    String iclinq = "https://www.icliniq.com/en/doctor/dr-j-mariano-anto-bruno-mascarenhas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorconsultation);
        relativeLayout = (RelativeLayout) findViewById(R.id.recycler_mg);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relate_zylo);
        relativeLayout2 = (RelativeLayout) findViewById(R.id.relate_practo);
        relativeLayout3 = (RelativeLayout) findViewById(R.id.relate_lybra);
        relativeLayout4 = (RelativeLayout) findViewById(R.id.relate_jusdoc);
        relativeLayout5 = (RelativeLayout) findViewById(R.id.relate_iclik);
        relativeLayout6 = (RelativeLayout) findViewById(R.id.relate_appolo);
        //relativeLayout7 = (RelativeLayout) findViewById(R.id.relate_myra);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(onemg, "1 MG");
            }
        });


        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(zoylo, "Zoylo");
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(practo, "Practo");
            }
        });
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(lybrate, "Lybrate");
            }
        });
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(just, "Just doc");
            }
        });
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                blue(iclinq, "I cliniQ");

            }
        });
        relativeLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue(askap, "Ask Appollo");
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
