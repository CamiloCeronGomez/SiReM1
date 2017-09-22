package com.example.camilo.sirem.attrs;

import android.databinding.BindingAdapter;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

/**
 * Created by camilo on 21/07/2017.
 */

public class Global {

    @BindingAdapter("app:imgUrl")
    public static void setImage(ImageView img, String url ){
        Picasso.with(img.getContext()).load(Uri.parse(url)).into(img);

    }

    @BindingAdapter("app:vdUrl")
    public static void setVideo(VideoView video, String url){
        video.setVideoURI(Uri.parse(url));
    }


}
