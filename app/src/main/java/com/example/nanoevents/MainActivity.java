package com.example.nanoevents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nanoevents.Adapters.EventAdapterClass;
import com.example.nanoevents.Entities.Event;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView eventRV;
    private ArrayList<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventRV = findViewById(R.id.EventRV);
        eventList.add(new Event("event1","description1","date1"));
        EventAdapterClass adapter = new EventAdapterClass(this, eventList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        eventRV.setLayoutManager(linearLayoutManager);
        eventRV.setAdapter(adapter);
    }
}