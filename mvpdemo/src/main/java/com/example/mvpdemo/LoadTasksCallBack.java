package com.example.mvpdemo;

/**
 * @author HaiRun
 * @time 2019/6/4.17:49
 */
public interface LoadTasksCallBack<T> {
    void onSuccess(T t);
    void onStart();
    void onFailed();
    void onFinish();
}
