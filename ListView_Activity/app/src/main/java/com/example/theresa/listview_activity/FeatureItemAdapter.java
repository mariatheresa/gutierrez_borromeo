package com.example.theresa.listview_activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by theresa on 28/2/15.
 */
public class FeatureItemAdapter extends BaseAdapter{
   Context context;
    ArrayList<FeatureItem> item;

    public FeatureItemAdapter(Context context, List<FeatureItem>item){
        this.context=context;
        this.item=(ArrayList<FeatureItem>) item;
    }

    @Override
    public int getCount() {
        return item.size() ;
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v= null;

        if(convertView == null)
        {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = inflate.inflate(R.layout.list, parent, false);
        } else {

            v= convertView;
        }

        TextView title=(TextView) v.findViewById(R.id.textView);
        TextView desc= (TextView) v.findViewById(R.id.textView2);
        TextView sys= (TextView) v.findViewById(R.id.textView3);
        ImageView imgView = (ImageView) v.findViewById(R.id.bg_image);

        imgView.setImageResource(item.get(position).getImg());
        title.setText(item.get(position).getTitle());
        desc.setText(item.get(position).getDesc());
        sys.setText(item.get(position).getSys());
      return v;
    }
}
