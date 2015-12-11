package com.wusui.redrock;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by fg on 2015/12/11.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    private int resourceId;
    public StudentAdapter(Context context, int resource,List<Student>objects){
        super(context, resource, objects);
        resourceId = resource;
    }
    public View getView(int position,View convertView,ViewGroup parent){
        Student student = getItem(position);
        View view =
                LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView imageView =(ImageView)
                view.findViewById(R.id.iv_item);
        TextView textView = (TextView)
                view.findViewById(R.id.tv_item);
        imageView.setImageResource(student.getImageId());
        textView.setText(student.getText());
        return view;

    }

}
