package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.theresa.chismis.Profile;
import com.example.theresa.chismis.R;

import java.util.ArrayList;
import java.util.Date;

import org.ocpsoft.prettytime.PrettyTime;

import Information.Notif;

/**
 * Created by theresa on 1/4/15.
 */
public class NotifAdapter extends ArrayAdapter<String> {


    private final Context context;
    private final ArrayList<Notif> notif;

    public NotifAdapter(Context context, ArrayList<Notif> notif) {
        super(context, R.layout.activity_notification_list);
        this.context = context;
        this.notif = notif;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View v;

        if(convertView == null)
        {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = inflate.inflate(R.layout.activity_notification_list, parent, false);
        } else {

            v= convertView;
        }
        PrettyTime p = new PrettyTime();
        // System.out.println(p.format(new Date()));

        TextView date=(TextView) v.findViewById(R.id.dates);
        date.setText(p.format(new Date()));

        TextView tv = (TextView) v.findViewById(R.id.notif);
        TextView co = (TextView) v.findViewById(R.id.action);

        tv.setText(notif.get(position).getName());
        co.setText(notif.get(position).getComment());

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Profile.class);
                v.getContext().startActivity(intent);
            }
        });
        return v;
    }

    @Override
    public int getCount() {
        return notif.size();
    }

}