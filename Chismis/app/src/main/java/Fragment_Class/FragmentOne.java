package Fragment_Class;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.theresa.chismis.R;
import Adapter.OwnAdapter;
import Model.ProfileGenerator;

import java.util.Date;

/**
 * Created by theresa on 26/3/15.
 */
public class FragmentOne  extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.homepage_list, container, false);

        ListView list = (ListView) rootView.findViewById(R.id.list2);
        OwnAdapter adapter = new OwnAdapter(this.getActivity(), ProfileGenerator.generateProfs());
        list.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



}
