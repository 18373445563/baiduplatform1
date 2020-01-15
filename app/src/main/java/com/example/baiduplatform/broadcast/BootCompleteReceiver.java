package com.example.baiduplatform.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by xiaoqin on 2020/1/15.
 */

public class BootCompleteReceiver extends BroadcastReceiver {
    private final String ACTION_BOOT = "android.intent.action.BOOT_COMPLETED";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ACTION_BOOT.equals(intent.getAction()))
            Toast.makeText(context, "开机完毕~", Toast.LENGTH_LONG).show();
    }
}
