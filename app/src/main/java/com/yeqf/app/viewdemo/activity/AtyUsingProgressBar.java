package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.yeqf.app.viewdemo.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yeqf on 2015/10/31.
 */
public class AtyUsingProgressBar extends Activity {

    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_progressbar);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressBar.setProgress(45);
    }

    @Override
    protected void onResume() {
        super.onResume();
        startTimer();
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopTimer();
    }

    private int progress = 0;


    private Timer timer = null;
    private TimerTask timerTask = null;

    public void startTimer() {
        if (timer == null) {
            timer = new Timer();
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    progress++;
                    progressBar.setProgress(progress);
                }
            };
            timer.schedule(timerTask, 1000, 100);
        }
    }

    public void stopTimer() {
        if (timer != null) {
            timer.cancel();
            timerTask.cancel();
            timer = null;
            timerTask = null;
        }
    }
}
