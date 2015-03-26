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
import com.example.theresa.chismis.Login;
import com.example.theresa.chismis.R;

/**
 * Created by theresa on 26/3/15.
 */
public class FragmentFour extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View v=inflater.inflate(R.layout.about,container,false);
        Button out = (Button) v.findViewById(R.id.button);

        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Login.class);
                getActivity().startActivity(intent);
            }
        });
        return v;
    }
}
