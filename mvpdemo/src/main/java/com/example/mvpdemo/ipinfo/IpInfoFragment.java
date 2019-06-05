package com.example.mvpdemo.ipinfo;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvpdemo.model.IpInfo;

/**
 * @author HaiRun
 * @time 2019/6/4.17:46
 */
public class IpInfoFragment extends Fragment implements IpInfoContract.View {
    private TextView tv_counttry;
    private TextView tv_area;
    private TextView tv_city;
    private Button bt_ipinfo;
    private Dialog mDialog;
    private IpInfoContract.Presenter mPresenter;
    @Override
    public void setIpInfo(IpInfo ipInfo) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setPresenter(IpInfoContract.Presenter presenter) {

    }
}
