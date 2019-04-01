package com.dynamicviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.chrisbanes.photoview.PhotoView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Pager extends PagerAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;
    private List<ImageModel> imageModelList;

    public Pager(Context context, ArrayList<ImageModel> feedItemList) {
        this.mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.imageModelList = feedItemList;
    }

    @Override
    public int getCount() {
        return (null != imageModelList ? imageModelList.size() : 0);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

        ImageModel get = imageModelList.get(position);

        PhotoView photoView = (PhotoView) itemView.findViewById(R.id.image);
        Glide
                .with(this.mContext)
                .load(get.getImageUrl())
                .into(photoView);

        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
