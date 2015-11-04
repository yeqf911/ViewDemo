package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/10/31.
 */
public class AtyUsingImageSwitcher extends Activity {

    private ImageSwitcher imageSwitcher;
    private boolean showImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_imageswitcher);
        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        //imageSwitcher.setImageResource(R.drawable.sample_1);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(AtyUsingImageSwitcher.this);
            }
        });


        /**
         * 用ImageSwitcher是为了用图片切换的动画效果
         */
        imageSwitcher.setInAnimation(AtyUsingImageSwitcher.this, android.R.anim.slide_in_left);
        imageSwitcher.setOutAnimation(AtyUsingImageSwitcher.this, android.R.anim.fade_out);

        imageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage = !showImage;
                setShowImage();
            }
        });

    }

    public void setShowImage() {
        if (showImage) {
            imageSwitcher.setImageResource(R.drawable.sample_1);
        } else {
            imageSwitcher.setImageResource(R.drawable.sample_0);
        }
    }
}
