package com.commai.module_test1.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.commai.module_test1.R;

/**
 * Created by fanqi on 2018/4/12.
 * Description:
 */

public class FillFormActivity extends AppCompatActivity {

    public static void action(Context mcontext){
        Intent intent=new Intent(mcontext,FillFormActivity.class);
        mcontext.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module1_activity_fill_form);
    }

}
