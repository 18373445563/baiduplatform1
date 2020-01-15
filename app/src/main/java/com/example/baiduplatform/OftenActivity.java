package com.example.baiduplatform;

import android.content.Intent;
import android.icu.util.Calendar;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Contacts;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.baiduplatform.view.ListAddDel2Activity;

import java.io.File;

public class OftenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_often);
    }

    public void bu1(View view){
        Uri uri = Uri.parse("tel:10086");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);

    }
    public void button2(View view){
        Uri uri = Uri.parse("smsto:10086");
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", "Hello");
        startActivity(intent);

    }

    public void button3(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra("sms_body", "Hello");
        Uri uri = Uri.parse("content://media/external/images/media/23");
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.setType("image/png");
        startActivity(intent);

    }
    public void button4(View view){
        Uri uri = Uri.parse("http://www.baidu.com");
        Intent intent  = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
    public void button5(View view){
        Uri uri = Uri.parse("mailto:someone@domain.com");
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(intent);
    }

    public void button6(View view){
        Uri uri = Uri.parse("geo:39.9,116.3");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void button7(View view){
        Uri uri = Uri.parse("http://maps.google.com/maps?f=d&saddr=39.9 116.3&daddr=31.2 121.4");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void button8(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("file:///sdcard/foo.mp3");
        intent.setDataAndType(uri, "audio/mp3");
        startActivity(intent);
    }

    public void button9(View view){
        Uri uri = Uri.withAppendedPath(MediaStore.Audio.Media.INTERNAL_CONTENT_URI, "1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void button10(View view){
        //Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        time = Calendar.getInstance().getTimeInMillis();
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(Environment
//                .getExternalStorageDirectory().getAbsolutePath()+"/tucue", time + ".jpg")));
//        startActivityForResult(intent, ACTIVITY_GET_CAMERA_IMAGE);
    }
    public void button11(View view){
        Intent intent = new Intent(this, EditActivity.class);
        startActivity(intent);
    }
    public void button12(View view){
        Uri uri = Uri.parse("market://details?id=" + "com.demo.app");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void button13(View view){
        Intent intent = new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS);
        startActivityForResult(intent, 0);
    }

    public void button14(View view){
//        Uri uri = Uri.fromParts("package", strPackageName, null);
//        Intent it = new Intent(Intent.ACTION_DELETE, uri);
//        startActivity(it);

    }

    public void button15(View view){
        Intent it = new Intent(Intent.ACTION_SEND);
        it.putExtra(Intent.EXTRA_SUBJECT, "The email subject text");
        it.putExtra(Intent.EXTRA_STREAM, "file:///sdcard/eoe.mp3");
        it.setType("audio/mp3");
        startActivity(Intent.createChooser(it, "Choose Email Client"));
    }
    public void button16(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Contacts.People.CONTENT_URI);
        startActivity(intent);
    }



}
