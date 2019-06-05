package com.example.mvpdemo.net;

import com.example.mvpdemo.LoadTasksCallBack;
import com.example.mvpdemo.model.IpInfo;

import cn.finalteam.okhttpfinal.BaseHttpRequestCallback;
import cn.finalteam.okhttpfinal.HttpRequest;
import cn.finalteam.okhttpfinal.RequestParams;

/**
 * @author HaiRun
 * @time 2019/6/4.17:48
 */
public class IpInfoTask implements NetTask<String> {
    private static IpInfoTask INSTANCE = null;
    private static final String HOST = "http://ip.taobao.com/service/getIpInfo.php";
    private LoadTasksCallBack loadTasksCallback;

    public IpInfoTask() {
    }

    public static IpInfoTask getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IpInfoTask();
        }
        return INSTANCE;
    }


    @Override
    public void execute(String ip, final LoadTasksCallBack callBack) {

        RequestParams _requestParams = new RequestParams();
        _requestParams.addFormDataPart("ip", ip);
        HttpRequest.post(HOST, _requestParams, new BaseHttpRequestCallback<IpInfo>() {
            @Override
            public void onStart() {
                super.onStart();
                loadTasksCallback.onStart();
            }

            @Override
            public void onFinish() {
                super.onFinish();
                loadTasksCallback.onFinish();
            }

            @Override
            protected void onSuccess(IpInfo ipInfo) {
                super.onSuccess(ipInfo);
                loadTasksCallback.onSuccess(ipInfo);
            }

            @Override
            public void onFailure(int errorCode, String msg) {
                super.onFailure(errorCode, msg);
                loadTasksCallback.onFailed();
            }
        });
    }
}
