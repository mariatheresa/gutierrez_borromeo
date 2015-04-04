package Fragment_Class;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.theresa.chismis.R;

import java.util.ArrayList;
import java.util.List;

import Adapter.NotifAdapter;
import Model.NotifModel;

/**
 * Created by theresa on 26/3/15.
 */
public class FragmentTwo extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.activity_notification_list, container, false);

        ListView list = (ListView) rootView.findViewById(R.id.list);
        NotifAdapter adapter = new NotifAdapter (this.getActivity(), NotifModel.notifModel());
        list.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }




}