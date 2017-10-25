package edu.nguyenmy.mvparchitecture.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;

import edu.nguyenmy.mvparchitecture.R;

/**
 * Created by DELL on 10/25/2017.
 */

public class ActivityLoading extends AppCompatActivity {
    private ImageView mImageView;
    private ProgressBar mProgressBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        mImageView = (ImageView) findViewById(R.id.img);
        mProgressBar = (ProgressBar)findViewById(R.id.progressbar);
    }
}
