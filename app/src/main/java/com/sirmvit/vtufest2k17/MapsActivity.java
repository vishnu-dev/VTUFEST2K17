package com.sirmvit.vtufest2k17;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public static final String TAG = MapsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near College.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //style Map
        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.style_json));

            if (!success) {
                Log.e(TAG, "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Can't find style. Error: ", e);
        }

        // Add a marker
        LatLng LOC_MVIT = new LatLng(13.15103d, 77.610929d); //gate
        LatLng LOC_SCIENCE = new LatLng(13.150812d, 77.609026d); //sci block
        LatLng LOC_NB = new LatLng(13.150893d, 77.610195d); //new block
        LatLng LOC_NA = new LatLng(13.151428d, 77.607093d); // new audi
        LatLng LOC_OA = new LatLng(13.1513653d, 77.607215d); // old audi
        LatLng LOC_LIB = new LatLng(13.151283d, 77.608933d); // lib
        LatLng LOC_PL = new LatLng(13.150273d, 77.609734d); // parking ground
        LatLng LOC_CS = new LatLng(13.151042d, 77.608881d); //coffee
        LatLng LOC_RS = new LatLng(13.149867d, 77.610226d); //atm
        LatLng LOC_ME = new LatLng(13.150604d, 77.6084d); //mech block
        LatLng LOC_CB = new LatLng(13.150856d, 77.60869d); //civil
        LatLng LOC_MBA = new LatLng(13.151316d, 77.609377d); //mba
        LatLng LOC_DEN = new LatLng(13.149771d, 77.608481d); //dental
        LatLng LOC_WORK = new LatLng(13.151112d, 77.607833d); //Workshop
        LatLng LOC_GROUND = new LatLng(13.14973d, 77.605473d); //Ground
        LatLng LOC_SUGAR = new LatLng(13.149946d,77.609871d); // Sugarcane
        LatLng LOC_ATM = new LatLng(13.149824d,77.610034d);//Rolls & Stationary
        LatLng LOC_CANT = new LatLng(13.149910d,77.610383d); //canteen
        mMap.addMarker(new MarkerOptions().position(LOC_MVIT).title("MVIT"));
        mMap.addMarker(new MarkerOptions().position(LOC_SCIENCE).title("Science Block"));
        mMap.addMarker(new MarkerOptions().position(LOC_NB).title("New Block"));
        mMap.addMarker(new MarkerOptions().position(LOC_NA).title("New Auditorium"));
        mMap.addMarker(new MarkerOptions().position(LOC_OA).title("Old Auditorium"));
        mMap.addMarker(new MarkerOptions().position(LOC_LIB).title("Library"));
        mMap.addMarker(new MarkerOptions().position(LOC_PL).title("Parking Lot"));
        mMap.addMarker(new MarkerOptions().position(LOC_CS).title("Coffee Shop"));
        mMap.addMarker(new MarkerOptions().position(LOC_RS).title("Rolls Corner & Stationary Shop"));
        mMap.addMarker(new MarkerOptions().position(LOC_ME).title("Mechanical Block"));
        mMap.addMarker(new MarkerOptions().position(LOC_CB).title("Civil Block"));
        mMap.addMarker(new MarkerOptions().position(LOC_MBA).title("MBA Block"));
        mMap.addMarker(new MarkerOptions().position(LOC_DEN).title("Dental Block"));
        mMap.addMarker(new MarkerOptions().position(LOC_WORK).title("WorkShop"));
        mMap.addMarker(new MarkerOptions().position(LOC_GROUND).title("Grounds"));
        mMap.addMarker(new MarkerOptions().position(LOC_SUGAR).title("Sugarcane Juice Shop"));
        mMap.addMarker(new MarkerOptions().position(LOC_ATM).title("ATM"));
        mMap.addMarker(new MarkerOptions().position(LOC_CANT).title("Canteen"));
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(LOC_MVIT)
                .zoom(18)
                .bearing(270)
                .tilt(60)
                .build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }

}
