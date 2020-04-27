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
     * 测试传递并接char类型数据
     *
     * @param charValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native char testChar(char charValue);

    /**
     * 测试传递并接受byte类型数据
     *
     * @param byteValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native byte testByte(byte byteValue);

    /**
     * 测试传递并接受short类型数据
     *
     * @param shortValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native short testShort(short shortValue);

    /**
     * 测试传递并接受int类型数据
     *
     * @param intValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native int testInt(int intValue);

    /**
     * 测试传递并接受long类型数据
     *
     * @param longValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native long testLong(long longValue);

    /**
     * 测试传递并接受float类型数据
     *
     * @param floatValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native float testFloat(float floatValue);

    /**
     * 测试传递并接受double类型数据
     *
     * @param doubleValue 传递给Native层的值
     * @return 接受Native层返回的数据
     */
    public native float testDouble(double doubleValue);
}
