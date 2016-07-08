package com.asi.likeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private GoodView mGoodView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGoodView = new GoodView(this);


    }

    public void good(View view) {
        ((ImageView) view).setImageResource(R.mipmap.good_checked);
        mGoodView.setText("+1");
        mGoodView.show(view);
    }
}
