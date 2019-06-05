package com.example.mvpdemo.net;

import com.example.mvpdemo.LoadTasksCallBack;

/**
 * @author HaiRun
 * @time 2019/6/4.17:48
 */
public interface NetTask<T> {
    void execute( T data , LoadTasksCallBack callBack);
}
