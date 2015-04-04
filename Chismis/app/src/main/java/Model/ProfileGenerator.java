package Model;

import com.example.theresa.chismis.R;

import java.util.ArrayList;
import java.util.List;

import Information.Prof;

/**
 * Created by theresa on 1/4/15.
 */
public class ProfileGenerator {
    static final String val[]={"@Jacob123", "@123Maria", "@123Dahlia", "@123Angela", "@123Jestin", "@123Vincent", "@123Jeremy", "@123Jeremy", "@123Stephen", "@123Klifford"};
    static final String msg[]={"I hate Mondays! :(", "Oh my god!", "Whatever, i'm tired", "Long hair", " yey", "hhahaahahhahahahaha","meeting him tonight!", "ye!!! i hate .... ", "i love that girl","lol, damn kids"};
    static  final Integer[] img={R.drawable.guy, R.drawable.mutant, R.drawable.mutant, R.drawable.mutant, R.drawable.guy, R.drawable.guy, R.drawable.guy, R.drawable.guy, R.drawable.guy, R.drawable.guy};
    static  final Integer[] post={R.drawable.f, R.drawable.f, R.drawable.f, R.drawable.f, R.drawable.f, R.drawable.f, R.drawable.f, R.drawable.f, R.drawable.f, R.drawable.f};

    public static List<Prof> generateProfs()
    {
        ArrayList<Prof> Prof = new ArrayList<Prof>();

        for(int x = 0; x < 10 ; x++)
        {
            Prof prof = new Prof();

            prof.setName(val[x]);
            prof.setDescription(msg[x]);
            prof.setImage_ref(img[x]);
            prof.setImage_post(post[x]);

            Prof.add(prof);

        }


        return Prof;
    }
}
