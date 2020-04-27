#include <jni.h>
#include <string>
#include "include/android_log.h"

#define TAG "JNIDemo"

/**
 * 接收Java层传递过来的boolean类型数据，并返回boolean类型的数据
 */
extern "C"
JNIEXPORT jboolean JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testBoolean(JNIEnv *env, jobject thiz, jboolean boolean_value) {
    uint8_t receive_data = boolean_value;
    LOGD(TAG, "testBoolean -> receiveData = %d (非零为true)", receive_data);
    jboolean return_data = !receive_data;
    return return_data;
}

/**
 * 接收Java层传递过来的byte类型数据，并返回byte类型的数据
 */
extern "C"
JNIEXPORT jchar JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testChar(JNIEnv *env, jobject thiz, jchar char_value) {
    uint16_t receive_data = char_value;
    LOGD(TAG, "testChar -> receiveData = %c", receive_data);
    jchar return_data = '@';
    return return_data;
}

/**
 * 接收Java层传递过来的byte类型数据，并返回byte类型的数据
 */
extern "C"
JNIEXPORT jbyte JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testByte(JNIEnv *env, jobject thiz, jbyte byte_value) {
    int8_t receive_data = byte_value;
    LOGD(TAG, "testByte -> receive data = %d", receive_data);
    jbyte return_data = (receive_data + 2) * 2;
    return return_data;
}

/**
 * 接收Java层传递过来的short类型数据，并返回short类型的数据
 */
extern "C"
JNIEXPORT jbyte JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testShort(JNIEnv *env, jobject thiz, jshort short_value) {
    int16_t receive_data = short_value;
    LOGD(TAG, "testShort -> receive data = %d", receive_data);
    jshort return_data = (receive_data + 5) * 5;
    return return_data;
}

/**
 * 接收Java层传递过来的int类型数据，并返回int类型的数据
 */
extern "C"
JNIEXPORT jint JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testInt(JNIEnv *env, jobject thiz, jint int_value) {
    int32_t receive_data = int_value;
    LOGD(TAG, "testInt -> receive data = %d", receive_data);
    jint return_data = (receive_data + 100) * 100;
    return return_data;
}

/**
 * 接收Java层传递过来的long类型数据，并返回long类型的数据
 */
extern "C"
JNIEXPORT jlong JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testLong(JNIEnv *env, jobject thiz, jlong long_value) {
    int64_t receive_data = long_value;
    LOGD(TAG, "testLong -> receive data = %d", receive_data);
    jlong return_data = (receive_data + 1000) * 1000;
    return return_data;
}

/**
 * 接收Java层传递过来的float类型数据，并返回float类型的数据
 */
extern "C"
JNIEXPORT jfloat JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testFloat(JNIEnv *env, jobject thiz, jfloat float_value) {
    float receive_data = float_value;
    LOGD(TAG, "testFloat -> receive data = %f", receive_data);
    jfloat return_data = (receive_data + 10) * 3.5;
    return return_data;
}

/**
 * 接收Java层传递过来的double类型数据，并返回double类型的数据
 */
extern "C"
JNIEXPORT jfloat JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testDouble(JNIEnv *env, jobject thiz, jdouble double_value) {
    double receive_data = double_value;
    LOGD(TAG, "testDouble -> receive data = %.2f", receive_data);
    jdouble return_data = (receive_data + 10) * 5.5;
    return return_data;
}