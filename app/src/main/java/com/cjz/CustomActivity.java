package com.cjz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.cjz.canvasview.DrawView;
import com.cjz.canvasview.DrawView2;
import com.cjz.canvasview.R;

/**
 * @author Mi
 */

public class CustomActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
    }

    private void init() {
        LinearLayout layout=(LinearLayout) findViewById(R.id.root);
        final DrawView2 view=new DrawView2(this);
        /*view.setMinimumHeight(500);
        view.setMinimumWidth(300);
        //通知view组件重绘
        view.invalidate();*/
        layout.addView(view);

    }
}