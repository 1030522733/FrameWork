package com.example.framework.ui.vv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.example.framework.base.App;

/**
 * @Author: JianTours
 * @Data: 2021/12/21 20:31
 * @Description:
 */
public class CustomImageView extends AppCompatImageView {
    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 普通网络地址图片
     *
     * @param imageView 图片视图
     * @param url       网络url
     */
    @BindingAdapter(value = {"networkUrl"}, requireAll = false)
    public static void setNetworkUrl(ImageView imageView, String url) {
        Glide.with(App.getContext()).load(url).into(imageView);
    }
}
