package com.sirmvit.vtufest2k17.Maps;

import com.google.android.gms.maps.model.LatLng;

public class MapsItem {
    public LatLng position;
    public int title;
    public LatLng titlePosition;

    public MapsItem(LatLng position, int title, LatLng titlePosition) {
        this.title = title;
        this.position = position;
        this.titlePosition = titlePosition;
    }
}
