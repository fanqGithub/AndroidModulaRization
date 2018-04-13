package com.commai.componentdevtest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.signature.MediaStoreSignature;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private ImageView ivTest;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    refreshImag();
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    refreshImag();
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    refreshImag();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.tipsMessage);
        ivTest=findViewById(R.id.testImg);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        refreshImag();
    }

    public void goToMudule1Main(View view) {
        ARouter.getInstance().build("/module1/MainActivity").navigation();
    }

    /**
     * 测试使用glide 4.0+，同一URL，资源变化的问题。
     * 通过添加signature
     */
    private void refreshImag(){
        String updateTime = String.valueOf(System.currentTimeMillis());
        String imgUrl="https://sys.commaai.cn/auth/qrcode/scancode?cmkey=opendoor&store_id=0&door_id=0&rtime=1523588068";
        GlideApp.with(this)
                .load(imgUrl)
                .signature(new MediaStoreSignature(updateTime,0,0))
                .into(ivTest);
    }
}
