package com.example.framework.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.framework.R;
import com.example.framework.model.BannerBean;
import com.example.framework.ui.viewholder.ImageTitleHolder;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

/**
 * 自定义布局，图片+标题
 */

public class ImageTitleAdapter extends BannerAdapter<BannerBean.DataBean, ImageTitleHolder> {


    public ImageTitleAdapter(List<BannerBean.DataBean> datas) {
        super(datas);
    }

    @Override
    public ImageTitleHolder onCreateHolder(ViewGroup parent, int viewType) {
        return new ImageTitleHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.banner_image_title, parent, false));
    }

    @Override
    public void onBindView(ImageTitleHolder holder, BannerBean.DataBean data, int position, int size) {
        Glide.with(holder.itemView)
                .load(data.getImagePath())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                .into(holder.imageView);
        holder.title.setText(data.getTitle());
    }
}
