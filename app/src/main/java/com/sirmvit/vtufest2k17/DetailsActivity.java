package com.sirmvit.vtufest2k17;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    String loc;
    String jsonLoc;
    List<EventItem> data;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    final List<MapsItem> mMapsItems = MapsContent.ITEMS;
    Bitmap image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        loc = MapsActivity.Data.getTitle();
        image = getImage(loc);
        ImageView imageView = (ImageView) findViewById(R.id.toolbarImage);
        imageView.setImageBitmap(image);
        ///// The arraylist in the end of this portion contains the list of all the events pertaining to the given block

        jsonLoc = MapsActivity.jsonData;

        try {
            JSONObject jObject = new JSONObject(jsonLoc);
            JSONArray jArray = jObject.getJSONArray(loc);
            data = new ArrayList<>();
            for (int i = 0; i < jArray.length(); i++) {
                EventItem mEventItem = new EventItem();
                mEventItem.name = jArray.getJSONObject(i).getString("eventName");
                mEventItem.day = jArray.getJSONObject(i).getString("eventDay");
                mEventItem.time = jArray.getJSONObject(i).getString("eventTime");
                Log.v("Event added: ", mEventItem.name);
                data.add(mEventItem);
            }
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        //////////////////////////////////////////////////////////////

        CollapsingToolbarLayout mActionBarToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        mActionBarToolbar.setTitle(loc);

        //recyclerView
        recyclerView = (RecyclerView)findViewById(R.id.event_list);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new EventListAdapter(DetailsActivity.this,data);
        recyclerView.setAdapter(mAdapter);


    }

    //get image
    Bitmap getImage(String str) {
        //default image
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.raw.demo);
        for (int i = 0; i < mMapsItems.size(); i++) {
            MapsItem current = mMapsItems.get(i);
            //get image for specific loc
            if (current.title.equals(str)) {
                switch(current.id) {
                    case 1 : bitmap = BitmapFactory.decodeResource(getResources(),R.raw.demo);
                        break;
                }
            }
        }
        return bitmap;
    }
}
