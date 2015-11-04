package com.yeqf.app.viewdemo.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/10/31.
 */
public class AtyUsingNotification extends Activity {

    private Button button;
    private NotificationManager nManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_notification);
        nManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // 这句话是为了让点开通知后通知图标就不再显示了
        nManager.cancel(R.layout.aty_using_notification);

        button = (Button) findViewById(R.id.showNotification);
        button.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(AtyUsingNotification.this);
                builder.setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("My Notification")
                        .setContentText("Hello Notification");

                //第二个参数是点开通知后进入的Activity,即ResultActivity
                Intent resultIntent = new Intent(AtyUsingNotification.this, AtyUsingGridView.class);

                TaskStackBuilder stackBuilder = TaskStackBuilder.create(AtyUsingNotification.this);

                //此处的 AtyUsingGridView.class 也是 ResultActivity
                stackBuilder.addParentStack(AtyUsingGridView.class);

                stackBuilder.addNextIntent(resultIntent);
                PendingIntent pendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_CANCEL_CURRENT);
                builder.setContentIntent(pendingIntent);
                nManager.notify(R.layout.aty_using_notification,builder.build());

            }
        });
    }
}
