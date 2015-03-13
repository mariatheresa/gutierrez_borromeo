package com.example.theresa.listview_activity;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by theresa on 28/2/15.
 */
public class FeatureItem {
    protected  String title;
    protected String desc;
    protected String sys;
    protected int img;

   public FeatureItem( String title, int img, String desc, String sys){
       this.title=title;
       this.desc=desc;
       this.sys=sys;
       this.img=img;
   }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setSys(String  sys) {
        this.sys = sys;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String  getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }

    public String getSys() {
        return sys;
    }
}
