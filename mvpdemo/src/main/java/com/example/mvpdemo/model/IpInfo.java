package com.example.mvpdemo.model;

/**
 * @author HaiRun
 * @time 2019/6/4.17:48
 */
public class IpInfo {
    private int code;
    private IpData data;

    public IpData getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(IpData data) {
        this.data = data;
    }
}
