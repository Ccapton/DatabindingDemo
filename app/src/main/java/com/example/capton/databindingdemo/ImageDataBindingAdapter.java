package com.example.capton.databindingdemo;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by CAPTON on 2017/9/24.
 */

public class ImageDataBindingAdapter {

    @BindingAdapter("app:image")
    public static void setImage(ImageView imageView,String url){
        Glide.with(ContextUtil.getInstance().getAppContext()).load(url).into(imageView);
    }
}
