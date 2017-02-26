package com.sirmvit.vtufest2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //This is done to change the title of the activity depending on the marker selected.
        setTitle(MapsActivity.Data.getTitle());
    }
}
