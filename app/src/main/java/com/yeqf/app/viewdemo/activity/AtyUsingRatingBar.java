package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.media.Rating;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/10/31.
 */
public class AtyUsingRatingBar extends Activity {

    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_ratingbar);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(AtyUsingRatingBar.this, "Rating is " + rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
