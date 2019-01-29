package com.example.android.demo2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;

public class Room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        ArrayList<Box> items = new ArrayList<Box>();
        items.add(new Box("First Room"));



        BoxAdapter adapter = new BoxAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                                                if (position == 0) {
                                                    Intent boxIntent = new Intent(Room.this, RoomDetails.class);
                                                    startActivity(boxIntent);
                                                }
                                            }

                                        }
        );

    }
}