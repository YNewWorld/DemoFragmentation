package com.yrx.demofragmentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yrx.demofragmentation.fragment.Fragment1;
import com.yrx.demofragmentation.fragment.Fragment2;
import com.yrx.demofragmentation.fragment.Fragment3;

import me.yokeyword.fragmentation.SupportActivity;

public class MainActivity extends SupportActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = findViewById(R.id.main_bottom_bar);
        bottomBar.setContainer(R.id.layout_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(Fragment1.class,
                        "首页",
                        R.drawable.ic_account_balance_black_18dp,
                        R.drawable.ic_account_balance_white_18dp)
                .addItem(Fragment2.class,
                        "发现",
                        R.drawable.ic_accessibility_black_18dp,
                        R.drawable.ic_accessibility_white_18dp)
                .addItem(Fragment3.class,
                        "我的",
                        R.drawable.ic_account_box_black_18dp,
                        R.drawable.ic_account_box_white_18dp)
                .build();


    }
}
