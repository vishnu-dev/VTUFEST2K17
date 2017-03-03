package com.sirmvit.vtufest2k17;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    String loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        loc = MapsActivity.Data.getTitle();

        CollapsingToolbarLayout mActionBarToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        mActionBarToolbar.setTitle(loc);

        }
}
