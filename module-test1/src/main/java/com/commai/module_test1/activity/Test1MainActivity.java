package com.commai.module_test1.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.commai.module_test1.R;

/**
 * Created by fanqi on 2018/4/11.
 * Description:
 */

@Route(path = "/module1/MainActivity")
public class Test1MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module1_activity_main_activity);
    }

    public void goToFillForm(View view) {
        FillFormActivity.action(this);
    }
}
