package com.sirmvit.vtufest2k17;

import android.graphics.Bitmap;

import com.google.android.gms.maps.model.LatLng;

@SuppressWarnings("WeakerAccess")
class MapsItem {
    int id;
    String title;
    LatLng position;
    Bitmap image;


    MapsItem(int id, String title, LatLng position,Bitmap image) {
        this.id = id;
        this.title = title;
        this.position = position;
        this.image = image;
    }
}