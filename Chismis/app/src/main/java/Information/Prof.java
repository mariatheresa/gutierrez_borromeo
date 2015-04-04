package Information;

import java.io.Serializable;

/**
 * Created by theresa on 1/4/15.
 */
public class Prof implements Serializable {


    public static final String KEY = "Prof";

    protected String name;
    protected String description;
    protected int image_ref;
    protected int image_post;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage_ref() {
        return image_ref;
    }

    public void setImage_ref(int image_ref) {
        this.image_ref = image_ref;
    }

    public int getImage_post() {
        return image_post;
    }

    public void setImage_post(int image_post) {
        this.image_post = image_post;
    }
}
