package news.com.luanvv.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import news.com.luanvv.entity.Category;
import news.com.luanvv.news.R;

/**
 * Created by luanvv on 11/4/15.
 */
public class CategoryAdapter extends ArrayAdapter<Category> {


    public CategoryAdapter(Context context, List<Category> categoryList) {
        super(context, R.layout.category_item, categoryList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflater.inflate(R.layout.category_item, parent, false);
        TextView tvName = (TextView) rootView.findViewById(R.id.tvName);
        tvName.setText(getItem(position).getName());
        rootView.setBackgroundColor(getItem(position).getColor());
        return rootView;
    }
}
