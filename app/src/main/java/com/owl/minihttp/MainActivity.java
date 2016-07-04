package com.owl.minihttp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.owl.baselib.http.HttpUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpUtils.post();
            }
        });
    }
}
