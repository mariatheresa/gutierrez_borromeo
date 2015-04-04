package Model;

import android.support.annotation.Nullable;

import java.util.ArrayList;

import Information.Notif;

/**
 * Created by theresa on 1/4/15.
 */
public class NotifModel {
    static final String val[]={"@Jacob123", "@123Maria", "@123Dahlia", "@123Angela", "@123Jestin", "@123Vincent", "@123Jeremy", "@123Jeremy", "@123Stephen", "@123Klifford"};
    static final String msg[]={"accepts your request", "accepts your request", "accepts your request", "accepts your request","accepts your request", "accepts your request", "accepts your request", "accepts your request","accepts your request", "accepts your request"};

    public static ArrayList<Notif> notifModel()
    {
        ArrayList<Notif> notif = new ArrayList< Notif>();

        for(int x = 0; x < 10 ; x++)
        {
            Notif notif2 = new Notif();

            notif2.setName(val[x]);
            notif2.setComment(msg[x]);

            notif.add(notif2);

        }


        return notif;
    }
}
