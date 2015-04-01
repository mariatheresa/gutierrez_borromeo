package Fragment_Class;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.theresa.chismis.Homepage;
import com.example.theresa.chismis.R;

/**
 * Created by theresa on 1/4/15.
 */
public class FragmentFive extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.activity_friend_list, container, false);
        Button decline = (Button) rootView.findViewById(R.id.decline);
        Button accept = (Button) rootView.findViewById(R.id.accept);

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Homepage.class);
                getActivity().startActivity(intent);
            }
        });
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Homepage.class);
                getActivity().startActivity(intent);
            }
        });
        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
