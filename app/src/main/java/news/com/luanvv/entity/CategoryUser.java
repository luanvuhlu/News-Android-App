package news.com.luanvv.entity;

import android.graphics.Color;

/**
 * Created by luanvv on 11/2/15.
 */
public class CategoryUser extends Category {
    private boolean selected;

    public CategoryUser(){
        super();
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }
}
