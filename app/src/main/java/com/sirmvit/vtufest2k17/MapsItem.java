package com.sirmvit.vtufest2k17;

import com.google.android.gms.maps.model.LatLng;

@SuppressWarnings("WeakerAccess")
class MapsItem {
    int id;
    String title;
    LatLng position;
    LatLng navi;

    MapsItem(int id, String title, LatLng position, LatLng navi) {
        this.id = id;
        this.title = title;
        this.position = position;
        this.navi = navi;
    }
}