package com.sirmvit.vtufest2k17;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    PackageInfo packageInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle(R.string.title_activity_about);

        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(),0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        String versionN = packageInfo.versionName;
        int versionC = packageInfo.versionCode;
        TextView versionText = (TextView) findViewById(R.id.verCode);
        versionText.setText(versionN+" ("+versionC+")");
    }
}
