package com.sirmvit.vtufest2k17;

import com.google.android.gms.maps.model.LatLng;

public class MapsItem {
    public int id;
    public String title;
    public LatLng position;

    public MapsItem(int id,String title, LatLng position) {
        this.id = id;
        this.title = title;
        this.position = position;
    }
}