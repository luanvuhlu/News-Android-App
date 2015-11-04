package news.com.luanvv.entity;

import android.graphics.Color;

/**
 * Created by luanvv on 11/2/15.
 */
public class Category {
    private String name;
    private String source;
    private int color;

    public Category(){

    }

    public Category(String name, String source, int color) {
        this.name = name;
        this.source = source;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
