package com.example.nanoevents.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nanoevents.Event;
import com.example.nanoevents.R;

import java.util.ArrayList;

public class EventAdapterClass extends RecyclerView.Adapter<EventAdapterClass.Viewholder> {

    private Context context;
    private ArrayList<Event> courseModelArrayList;

    // Constructor
    public EventAdapterClass(Context context, ArrayList<Event> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public EventAdapterClass.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapterClass.Viewholder holder, int position) {
        Event model = courseModelArrayList.get(position);
        holder.eventTitle.setText(model.getTitle());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return courseModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView eventTitle, date;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.eventImage);
            eventTitle = itemView.findViewById(R.id.eventTitle);
            date = itemView.findViewById(R.id.eventDate);
        }
    }
}
