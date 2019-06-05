package com.example.mvpdemo.ipinfo;

import com.example.mvpdemo.BaseView;
import com.example.mvpdemo.LoadTasksCallBack;
import com.example.mvpdemo.model.IpInfo;
import com.example.mvpdemo.net.NetTask;

/**
 * @author HaiRun
 * @time 2019/6/4.17:46
 */
public class IpinfoPresenter implements IpInfoContract.Presenter, LoadTasksCallBack<IpInfo> {
        private NetTask netTask;
        private IpInfoContract.View  addTaskView;

    public IpinfoPresenter(NetTask netTask, IpInfoContract.View addTaskView) {
        this.netTask = netTask;
        this.addTaskView = addTaskView;
    }

    @Override
    public void getIpInfo(String ip) {
        netTask.execute(ip,this);
    }

    @Override
    public void onSuccess(IpInfo ipInfo) {
        if (addTaskView.isActive()){
            addTaskView.setIpInfo(ipInfo);
        }
    }

    @Override
    public void onStart() {
        if (addTaskView.isActive()){
            addTaskView.showLoading();
        }
    }

    @Override
    public void onFailed() {
        if (addTaskView.isActive()){
            addTaskView.showError();
            addTaskView.hideLoading();
        }
    }

    @Override
    public void onFinish() {
        if (addTaskView.isActive()){
            addTaskView.hideLoading();

        }
    }
}
