package com.github.yangkangli.jni;

public class JNIDemo {

    static {
        System.loadLibrary("native-lib");
    }

    /**
     * 测试传递并接受boolean类型数据
     *
     * @param booleanValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native boolean testBoolean(boolean booleanValue);

    /**
     * 测试传递并接受byte类型数据
     *
     * @param byteValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native boolean testByte(byte byteValue);
}
