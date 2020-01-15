package com.example.baiduplatform.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.baiduplatform.ListAddDelActivity;
import com.example.baiduplatform.MainActivity;
import com.example.baiduplatform.R;
import com.example.baiduplatform.baseclass.MutiLayoutAdapter;
import com.example.baiduplatform.baseclass.MyAdapter;
import com.example.baiduplatform.entity.App;
import com.example.baiduplatform.entity.Book;
import com.example.baiduplatform.entity.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAddDel2Activity extends AppCompatActivity  {

    private static final int TYPE_BOOK = 0;
    private static final int TYPE_APP = 1;
    private ListView list_content;
    private ArrayList<Object> mData = null;
    private MutiLayoutAdapter myAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview1);

        //数据准备：
        mData = new ArrayList<Object>();
        for(int i = 0;i < 20;i++){
            switch ((int)(Math.random() * 2)){
                case TYPE_BOOK:
                    mData.add(new Book("《第一行代码》","郭霖"));
                    break;
                case TYPE_APP:
                    mData.add(new App(R.mipmap.loading_01,"百度"));
                    break;
            }
        }

        list_content = (ListView) findViewById(R.id.list_test1);
        myAdapter = new MutiLayoutAdapter(ListAddDel2Activity.this,mData);
        list_content.setAdapter(myAdapter);
    }
}
