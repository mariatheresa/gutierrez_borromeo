package Model;

import com.example.theresa.chismis.R;

import java.util.ArrayList;
import java.util.List;

import Information.Friends;


/**
 * Created by theresa on 4/4/15.
 */
public class Friend {
    static final String val[]={"@Jacob123", "@123Maria", "@123Dahlia", "@123Angela", "@123Jestin", "@123Vincent", "@123Jeremy", "@123Jeremy", "@123Stephen", "@123Klifford"};
    static  final Integer[] img={R.drawable.guy, R.drawable.mutant, R.drawable.mutant, R.drawable.mutant, R.drawable.guy, R.drawable.guy, R.drawable.guy, R.drawable.guy, R.drawable.guy, R.drawable.guy};

    public static List<Friends> generateFriends()
    {
        ArrayList<Friends> friends = new ArrayList<Friends>();

        for(int x = 0; x < 10 ; x++)
        {
            Friends friend = new Friends();

            friend.setName(val[x]);
            friend.setImage_Ref(img[x]);

            friends.add(friend);

        }


        return friends;
    }
}
