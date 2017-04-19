package com.example.n.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }
    private int id = 7000;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onReceive(Context context, Intent intent) {
        /*String msg = intent.getStringExtra("KEY_MSG");
        Intent newintent = new Intent();
        newintent.setClass(context, MyReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, newintent, 0);
        Notification notify = newNotification(context, pendingIntent,"(New) Broadcast is received.",msg);
        NotificationManager notificationManager =(NotificationManager)context.
                getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(id++, notify);*/

    }
    /*@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private Notification newNotification(Context context, PendingIntent pi, String title, String msg) {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle(title);
        builder.setContentText(msg);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentIntent(pi);
        builder.setTicker(msg);
        builder.setWhen(System.currentTimeMillis());
        Notification notify = builder.build();
        return notify;
    }*/

}
