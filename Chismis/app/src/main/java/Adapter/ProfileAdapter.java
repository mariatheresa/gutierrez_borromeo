package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.theresa.chismis.R;

/**
 * Created by theresa on 4/4/15.
 */
public class ProfileAdapter extends ArrayAdapter<String> {
    public final Context context;
    public final String[] val;



    public ProfileAdapter(Context context, String[] val) {
        super(context, R.layout.list_profile, val);
        this.context = context;
        this.val = val;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View listv2 = inflate.inflate(R.layout.from_text_profile, parent, false);
        TextView uName = (TextView) listv2.findViewById(R.id.status);

        uName.setText(val[position]);


        return listv2	;
    }

}
