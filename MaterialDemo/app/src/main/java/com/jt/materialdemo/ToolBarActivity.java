package com.jt.materialdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by 姜腾 on 2017/8/3.
 */

public class ToolBarActivity extends AppCompatActivity {

    public void Start(Context context) {
        Intent intent = new Intent(context, ToolBarActivity.class);
        startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Title");
        toolbar.setSubtitle("Subtitle");
        toolbar.setLogo(R.mipmap.ic_launcher_round);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
    }
}
