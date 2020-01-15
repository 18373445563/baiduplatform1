package com.example.baiduplatform.entity;

/**
 * Created by xiaoqin on 2020/1/7.
 */

public class App {
    private int aIcon;
    private String aName;

    public App() {}

    public App(int aIcon, String aName) {
        this.aIcon = aIcon;
        this.aName = aName;
    }

    public int getaIcon() {
        return aIcon;
    }

    public String getaName() {
        return aName;
    }

    public void setaIcon(int imgId) {
        this.aIcon = aIcon;
    }

    public void setaName(String content) {
        this.aName = aName;
    }
}
