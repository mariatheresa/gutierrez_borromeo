package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.theresa.chismis.Profile;
import com.example.theresa.chismis.R;

import org.ocpsoft.prettytime.PrettyTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Information.Prof;

/**
 * Created by theresa on 1/4/15.
 */
public class OwnAdapter  extends BaseAdapter {


    Context context;
    ArrayList<Prof> prof;

    public OwnAdapter(Context context, List<Prof> prof) {
        this.context = context;
        this.prof = (ArrayList<Prof>) prof;
    }

    @Override
    public int getCount() {
        return prof.size();
    }

    @Override
    public Object getItem(int position) {
        return prof.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View v;

        if(convertView == null)
        {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = inflate.inflate(R.layout.homepage_list, parent, false);
        } else {

            v= convertView;
        }

        PrettyTime p = new PrettyTime();
       // System.out.println(p.format(new Date()));

        TextView date=(TextView) v.findViewById(R.id.date);
        date.setText(p.format(new Date()));

        TextView uName = (TextView) v.findViewById(R.id.notif);
        TextView post = (TextView) v.findViewById(R.id.action);
        ImageView imgView = (ImageView) v.findViewById(R.id.pp);
        ImageView imgView1 = (ImageView) v.findViewById(R.id.attach);

        uName.setText(prof.get(position).getName());
        post.setText(prof.get(position).getDescription());
        imgView.setImageResource(prof.get(position).getImage_ref());
        imgView1.setImageResource(prof.get(position).getImage_post());


        uName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Profile.class);
                v.getContext().startActivity(intent);
            }
        });

        return v;
    }



}