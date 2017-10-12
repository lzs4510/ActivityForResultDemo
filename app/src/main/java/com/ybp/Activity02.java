package com.ybp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 李宗书 on 2017/10/12.
 */

public class Activity02 extends AppCompatActivity {
    private int resultCode = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity02);

        Intent mIntent = new Intent();
        mIntent.putExtra("change01", "1000");
        mIntent.putExtra("change02", "2000");
        // 设置结果，并进行传送
        this.setResult(resultCode, mIntent);
       // finish();
    }
}
