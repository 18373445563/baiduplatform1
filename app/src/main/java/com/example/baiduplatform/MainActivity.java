package com.example.baiduplatform;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.baiduplatform.view.ListAddDel2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getMsgs();
    }

    public void checkswitch(View view){
        Intent intent = new Intent(this, SwitchActivity.class);
        startActivity(intent);

    }
    public void progress(View view){
        Intent intent = new Intent(this, ProgressActivity.class);
        startActivity(intent);

    }

    public void scrolltxt(View view){
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);

    }
    public void ratingBar(View view){
        Intent intent = new Intent(this, RatingBarActivity.class);
        startActivity(intent);

    }
    public void listview(View view){
        Intent intent = new Intent(this, ListviewActivity.class);
        startActivity(intent);

    }

    public void listviewadddel(View view){
        Intent intent = new Intent(this, ListAddDelActivity.class);
        startActivity(intent);
    }

    public void listviewadddel2(View view){
        Intent intent = new Intent(this, ListAddDel2Activity.class);
        startActivity(intent);
    }
    public void spinner(View view){
        Intent intent = new Intent(this, SpinnerActivity.class);
        startActivity(intent);
    }

    public void popup(View view){
        Intent intent = new Intent(this, PopActivity.class);
        startActivity(intent);
    }

    public void viewpage(View view){
        Intent intent = new Intent(this, ViewPageActivity.class);
        startActivity(intent);
    }
    public void psw(View view){
        Intent intent = new Intent(this, EditActivity.class);
        startActivity(intent);
    }

    public void oftenactivity(View view){
        Intent intent = new Intent(this, OftenActivity.class);
        startActivity(intent);
    }

    public void servicetest(View view){
        Intent intent = new Intent(this, Service1Activity.class);
        startActivity(intent);
    }

    public void service2test(View view){
        Intent intent = new Intent(this, Service2Activity.class);
        startActivity(intent);
    }

    public void service3test(View view){
        Intent intent = new Intent(this, Service3Activity.class);
        startActivity(intent);
    }

    public void receiver(View view){
        Intent intent = new Intent(this,BroadcastActivity.class);
        startActivity(intent);
    }

    public void receiver1(View view){
        Intent intent = new Intent(this,Broadcast1Activity.class);
        startActivity(intent);
    }


    public void receiver2(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }


//    private void getMsgs(){
//        Uri uri = Uri.parse("content://sms/");
//        ContentResolver resolver = getContentResolver();
//        //获取的是哪些列的信息
//        Cursor cursor = resolver.query(uri, new String[]{"address","date","type","body"}, null, null, null);
//        while(cursor.moveToNext())
//        {
//            String address = cursor.getString(0);
//            String date = cursor.getString(1);
//            String type = cursor.getString(2);
//            String body = cursor.getString(3);
//            System.out.println("地址:" + address);
//            System.out.println("时间:" + date);
//            System.out.println("类型:" + type);
//            System.out.println("内容:" + body);
//            System.out.println("======================");
//        }
//        cursor.close();
//    }
}
