package com.github.yangkangli.jni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private JNIDemo jniDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jniDemo = new JNIDemo();
        // 基本数据类型
        findViewById(R.id.btn_basic_type).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_basic_type: {
                testBasicType();
                break;
            }
        }
    }

    private void testBasicType() {

        jniDemo.testBoolean(true);
        jniDemo.testByte((byte) 1);

    }
}
