package com.jt.customviewdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jt.customviewdemo.R;

import static com.jt.customviewdemo.R.id.bottom_not_cancel;

public class MainActivity extends AppCompatActivity {
    Button centerCancelBtn;
    Button centerNotCancelBtn;
    Button bottomCancelBtn;
    Button bottomNotCancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        centerCancelBtn= (Button) findViewById(R.id.center_cancelable);
        centerNotCancelBtn= (Button) findViewById(R.id.center_cancel_disable);
        bottomCancelBtn= (Button) findViewById(R.id.bottom_cancel);
        bottomNotCancelBtn= (Button) findViewById(bottom_not_cancel);
        centerCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
