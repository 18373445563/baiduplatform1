package com.example.baiduplatform.entity;

/**
 * Created by xiaoqin on 2020/1/7.
 */

public class Book {
    private String bName;
    private String bAuthor;

    public Book() {}

    public Book(String bName, String bAuthor) {
        this.bName = bName;
        this.bAuthor = bAuthor;
    }

    public String getbName() {
        return bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String content) {
        this.bAuthor = bAuthor;
    }
}
