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
import com.example.theresa.chismis.Post;
import com.example.theresa.chismis.R;
import com.example.theresa.chismis.Update;

/**
 * Created by theresa on 26/3/15.
 */
public class FragmentThree extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.profile,container,false);
        Button clickMe = (Button) rootView.findViewById(R.id.update);
        Button post = (Button) rootView.findViewById(R.id.button3);


        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Update.class);
                getActivity().startActivity(intent);
            }
        });
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Post.class);
                getActivity().startActivity(intent);
            }
        });
        // End new code.
        return rootView;

    }

}


