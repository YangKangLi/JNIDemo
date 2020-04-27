package com.github.yangkangli.jni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "JNIDemo";

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
            default: {
                break;
            }
        }
    }

    /**
     * 测试基本数据类型
     */
    private void testBasicType() {
        Log.d(TAG, "=============================================================================");
        boolean returnBoolean = jniDemo.testBoolean(false);
        Log.d(TAG, "returnBoolean = " + returnBoolean);
        Log.d(TAG, "=============================================================================");
        char returnChar = jniDemo.testChar('$');
        Log.d(TAG, "returnChar = " + returnChar);
        Log.d(TAG, "=============================================================================");
        byte returnByte = jniDemo.testByte((byte) 1);
        Log.d(TAG, "returnByte = " + returnByte);
        Log.d(TAG, "=============================================================================");
        short returnShort = jniDemo.testShort((short) 5);
        Log.d(TAG, "returnShort = " + returnShort);
        Log.d(TAG, "=============================================================================");
        int returnInt = jniDemo.testInt(100);
        Log.d(TAG, "returnInt = " + returnInt);
        Log.d(TAG, "=============================================================================");
        long returnLong = jniDemo.testLong(1000);
        Log.d(TAG, "returnLong = " + returnLong);
        Log.d(TAG, "=============================================================================");
        float returnFloat = jniDemo.testFloat(3.1415926F);
        Log.d(TAG, "returnFloat = " + returnFloat);
        Log.d(TAG, "=============================================================================");
        float returnDouble = jniDemo.testDouble(3.1415926);
        Log.d(TAG, "returnDouble = " + returnDouble);
    }
}
