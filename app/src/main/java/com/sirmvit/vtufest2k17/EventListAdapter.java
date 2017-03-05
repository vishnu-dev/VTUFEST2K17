package com.sirmvit.vtufest2k17;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class EventListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private LayoutInflater mInflater;
    List<EventItem> data = Collections.emptyList();
    //EventItem current;
    int currentPosition = 0;

    // create constructor to init context and data sent from DetailActivity
    public  EventListAdapter(Context context, List<EventItem> data) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
        this.data = data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.event_card,parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder = (MyHolder) holder;
        EventItem current = data.get(position);
        myHolder.eventName.setText(current.name);
        myHolder.eventDay.setText("Day : " + current.day);
        myHolder.eventTime.setText("Time : "+current.time);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

class MyHolder extends RecyclerView.ViewHolder {
    TextView eventName;
    TextView eventDay;
    TextView eventTime;

    public MyHolder(View itemView) {
        super(itemView);
        eventName = (TextView) itemView.findViewById(R.id.EventTitle);
        eventDay = (TextView) itemView.findViewById(R.id.EventDay);
        eventTime = (TextView) itemView.findViewById(R.id.EventTime);
    }
}
