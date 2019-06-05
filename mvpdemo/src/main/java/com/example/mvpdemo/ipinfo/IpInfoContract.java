package com.example.mvpdemo.ipinfo;

import com.example.mvpdemo.BaseView;
import com.example.mvpdemo.model.IpInfo;

/**
 * @author HaiRun
 * @time 2019/6/4.17:45
 */
public interface IpInfoContract {

    interface Presenter{
        void getIpInfo(String ip);
    }

    interface View extends BaseView<Presenter> {
        void setIpInfo(IpInfo ipInfo);
        void showLoading();
        void hideLoading();
        void showError();
        boolean isActive();

    }
}
