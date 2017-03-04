package com.sirmvit.vtufest2k17;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    String loc;
    String jsonLoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        loc = MapsActivity.Data.getTitle();

        ///// The arraylist in the end of this portion contains the list of all the events pertaining to the given block

        jsonLoc = MapsActivity.jsonData;

        try {
            JSONObject jObject = new JSONObject(jsonLoc);
            JSONArray jArray = jObject.getJSONArray(loc);
            String name = "";
            String time = "";
            ArrayList<String[]> data = new ArrayList<String[]>();
            for (int i = 0; i < jArray.length(); i++) {
                name = jArray.getJSONObject(i).getString("eventName");
                time = jArray.getJSONObject(i).getString("eventTime");
                Log.v("Event Name", name);
                Log.v("Event Time", time);
                data.add(new String[]{name, time});
            }
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        //////////////////////////////////////////////////////////////

        CollapsingToolbarLayout mActionBarToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        mActionBarToolbar.setTitle(loc);

    }
}
