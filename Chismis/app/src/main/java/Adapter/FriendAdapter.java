package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.theresa.chismis.Profile;
import com.example.theresa.chismis.R;
import com.example.theresa.chismis.Update;

import java.util.ArrayList;
import java.util.List;

import Information.Friends;
import Information.Prof;

/**
 * Created by theresa on 4/4/15.
 */
public class FriendAdapter extends BaseAdapter {


    Context context;
    ArrayList<Friends> friends;

    public FriendAdapter(Context context, List<Friends> friends) {
        this.context = context;
        this.friends = (ArrayList<Friends>) friends;
    }

    @Override
    public int getCount() {
        return friends.size();
    }

    @Override
    public Object getItem(int position) {
        return friends.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View v;

        if(convertView == null)
        {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = inflate.inflate(R.layout.activity_friend_list, parent, false);

        } else {

            v= convertView;
        }
      /*  RelativeLayout parentLayout = (RelativeLayout) v.findViewById(R.id.ld);
        if (shouldDisplayItem(position)) {
            parentLayout.setVisibility(View.VISIBLE);
        } else {
            parentLayout.setVisibility(View.GONE);
        }
*/
        final TextView uName = (TextView) v.findViewById(R.id.notif);
        final ImageView imgView = (ImageView) v.findViewById(R.id.imageView4);
        final Button acc = (Button) v.findViewById(R.id.accept);
        final Button dec = (Button) v.findViewById(R.id.decline);

        uName.setText(friends.get(position).getName());
        imgView.setImageResource(friends.get(position).getImage_Ref());
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "accepted the request",Toast.LENGTH_SHORT).show();
                  uName.setVisibility(View.GONE);
                    imgView.setVisibility(View.GONE);
                acc.setVisibility(View.GONE);
                dec.setVisibility(View.GONE);
                }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "denied the request",Toast.LENGTH_SHORT).show();
                uName.setVisibility(View.GONE);
                imgView.setVisibility(View.GONE);
                acc.setVisibility(View.GONE);
                dec.setVisibility(View.GONE);
            }
        });


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