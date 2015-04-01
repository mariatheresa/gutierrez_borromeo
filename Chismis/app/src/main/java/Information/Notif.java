package Information;

import java.io.Serializable;

/**
 * Created by theresa on 1/4/15.
 */
public class Notif implements Serializable {

    public static final String KEY = "Notif";

    protected String name;
    protected String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String status) {
        this.comment = status;
    }

}