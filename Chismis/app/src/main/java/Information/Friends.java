package Information;

import java.io.Serializable;

/**
 * Created by theresa on 4/4/15.
 */
public class Friends implements Serializable {

    public static final String KEY = "Friends";

    protected String name;
    protected int image_Ref;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage_Ref() {
        return image_Ref;
    }

    public void setImage_Ref(int image_Ref) {
        this.image_Ref = image_Ref;
    }
}