#include <jni.h>
#include <string>

/**
 * 接收Java层传递过来的boolean类型数据，并返回boolean类型的数据
 */
extern "C"
JNIEXPORT jboolean JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testBoolean(JNIEnv *env, jobject thiz,
                                                   jboolean boolean_value) {
    // TODO: implement testBoolean()
}

/**
 * 接收Java层传递过来的byte类型数据，并返回byte类型的数据
 */
extern "C"
JNIEXPORT jboolean JNICALL
Java_com_github_yangkangli_jni_JNIDemo_testByte(JNIEnv *env, jobject thiz, jbyte byte_value) {
    // TODO: implement testByte()
}