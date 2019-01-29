package com.example.android.demo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;


public class BoxAdapter extends ArrayAdapter<Box> {

    public BoxAdapter(Context context, ArrayList<Box> collections) {
        super(context, 0, collections);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        Box box=getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_room, parent, false);
        }

        TextView soundtrackName=(TextView) listItemView.findViewById(R.id.roomName);
        soundtrackName.setText(box.getRoomName());

        return listItemView;
    }
}