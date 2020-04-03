package com.yuong.temp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.ll_order_all).setOnClickListener(this);
        findViewById(R.id.ll_my_house).setOnClickListener(this);
        findViewById(R.id.ll_my_cards).setOnClickListener(this);
        findViewById(R.id.ll_integral_mall).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_order_all:
                break;
            case R.id.ll_my_house:
                break;
            case R.id.ll_my_cards:
                break;
            case R.id.ll_integral_mall:
                break;
        }
    }
}
