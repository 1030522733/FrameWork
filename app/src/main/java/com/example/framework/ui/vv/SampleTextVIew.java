package com.example.framework.ui.vv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * @author :JianTao
 * @date :2022/1/20 11:57
 * @description : 简单滚动
 */
public class SampleTextVIew extends TextView {


    public SampleTextVIew(Context context) {
        super(context);
    }

    public SampleTextVIew(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SampleTextVIew(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SampleTextVIew(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
