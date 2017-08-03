package com.jt.customviewdemo.customviews;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 姜腾 on 2017/7/23.
 */

public class CustomTitleView extends View {

    public CustomTitleView(Context context) {
        this(context,null);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }
}
