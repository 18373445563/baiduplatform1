package com.example.baiduplatform;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.baiduplatform.baseclass.MyAdapter;
import com.example.baiduplatform.entity.Data;

import java.util.LinkedList;
import java.util.List;

public class ListAddDelActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView list_one;
     int flag=1;
    private MyAdapter mAdapter = null;
    private List<Data> mData = null;
    private Context mContext = null;
    private Button btn_add;
    private Button btn_add1;
    private Button btn_remove;
    private Button btn_remove1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        mContext = ListAddDelActivity.this;
        bindViews();
        mData = new LinkedList<Data>();
        mAdapter = new MyAdapter((LinkedList<Data>) mData,mContext);
        list_one.setAdapter(mAdapter);
    }

    private void bindViews(){
        list_one = (ListView) findViewById(R.id.list_test);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        btn_add1 = (Button) findViewById(R.id.btn_add1);
        btn_add1.setOnClickListener(this);
        btn_remove = (Button) findViewById(R.id.btn_remove);
        btn_remove.setOnClickListener(this);
        btn_remove1 = (Button) findViewById(R.id.btn_remove1);
        btn_remove1.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_add:
                mAdapter.add(new Data(R.mipmap.loading_01,"给猪哥跪了~~~ x " + flag));
                flag++;
                break;
            case R.id.btn_add1:
                mAdapter.add1(4,new Data(R.mipmap.loading_01,"给猪哥跪了~~~ x " + flag));
                flag++;
                break;
            case R.id.btn_remove:
                mAdapter.remove(mData.get(1));
                break;
            case R.id.btn_remove1:
                mAdapter.remove(2);
                break;
        }
    }
}
