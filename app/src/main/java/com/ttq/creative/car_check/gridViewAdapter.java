package com.ttq.creative.car_check;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gridViewAdapter extends BaseAdapter {
    private Context context;
    private String[] brandName;
    private int[] brandLogo;

    public gridViewAdapter(Context context, String[] brandName, int[] brandLogo) {
        this.context = context;
        this.brandName = brandName;
        this.brandLogo = brandLogo;
    }


    @Override
    public int getCount() {
        return brandName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView  = layoutInflater.inflate(R.layout.list_item_layout,null);
        TextView textView = (TextView)convertView.findViewById(R.id.brand_name);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.logo_brand);

        textView.setText(brandName[position]);
        imageView.setImageResource(brandLogo[position]);

        return convertView;
    }
}
