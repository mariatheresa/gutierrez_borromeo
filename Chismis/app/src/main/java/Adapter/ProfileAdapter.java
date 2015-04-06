package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import org.ocpsoft.prettytime.PrettyTime;
import com.example.theresa.chismis.R;

import java.util.Date;

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

        PrettyTime p = new PrettyTime();
        // System.out.println(p.format(new Date()));

        TextView date=(TextView) listv2.findViewById(R.id.dates);
        date.setText(p.format(new Date()));

        uName.setText(val[position]);


        return listv2	;
    }

}
