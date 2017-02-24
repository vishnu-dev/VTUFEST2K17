package com.sirmvit.vtufest2k17;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayankmethad on 24/02/17.
 */

public class MapsContent {

    private static final LatLng LOC_MVIT = new LatLng(13.15103d, 77.610929d); //gate - 1
    private static final LatLng LOC_SCIENCE = new LatLng(13.150812d, 77.609026d); //sci block - 2
    private static final LatLng LOC_NB = new LatLng(13.150893d, 77.610195d); //new block - 3
    private static final LatLng LOC_NA = new LatLng(13.151428d, 77.607093d); // new audi - 4
    private static final LatLng LOC_OA = new LatLng(13.1513653d, 77.607215d); // old audi - 5
    private static final LatLng LOC_LIB = new LatLng(13.151283d, 77.608933d); // lib - 6
    private static final LatLng LOC_PL = new LatLng(13.150273d, 77.609734d); // parking ground - 7
    private static final LatLng LOC_CS = new LatLng(13.151042d, 77.608881d); //coffee - 8
    private static final LatLng LOC_RS = new LatLng(13.149867d, 77.610226d); //rolls & stationary - 9
    private static final LatLng LOC_ME = new LatLng(13.150604d, 77.6084d); //mech block - 10
    private static final LatLng LOC_CB = new LatLng(13.150856d, 77.60869d); //civil - 11
    private static final LatLng LOC_MBA = new LatLng(13.151316d, 77.609377d); //mba - 12
    private static final LatLng LOC_DEN = new LatLng(13.149771d, 77.608481d); //dental - 13
    private static final LatLng LOC_WORK = new LatLng(13.151112d, 77.607833d); //Workshop - 14
    private static final LatLng LOC_GROUND = new LatLng(13.14973d, 77.605473d); //Ground - 15
    private static final LatLng LOC_SUGAR = new LatLng(13.149946d,77.609871d); // Sugarcane - 16
    private static final LatLng LOC_ATM = new LatLng(13.149824d,77.610034d);//atm - 17
    private static final LatLng LOC_CANT = new LatLng(13.149910d,77.610383d); //canteen - 18
    public static List<MapsItem> ITEMS;

    static{
        ITEMS = new ArrayList();
        addItem(new MapsItem(1,"MVIT",LOC_MVIT));
        addItem(new MapsItem(2,"Science Block",LOC_SCIENCE));
        addItem(new MapsItem(3,"New Block",LOC_NB));
        addItem(new MapsItem(4,"New Auditorium",LOC_NA));
        addItem(new MapsItem(5,"Old Auditorium",LOC_OA));
        addItem(new MapsItem(6,"Library",LOC_LIB));
        addItem(new MapsItem(7,"Parking Lot",LOC_PL));
        addItem(new MapsItem(8,"Coffee Shop",LOC_CS));
        addItem(new MapsItem(9,"Rolls Corner & Stationary Shop",LOC_RS));
        addItem(new MapsItem(10,"Mechanical Block",LOC_ME));
        addItem(new MapsItem(11,"Civil Block",LOC_CB));
        addItem(new MapsItem(12,"MBA Block",LOC_MBA));
        addItem(new MapsItem(13,"Dental Block",LOC_DEN));
        addItem(new MapsItem(14,"Workshop Block",LOC_WORK));
        addItem(new MapsItem(15,"Grounds",LOC_GROUND));
        addItem(new MapsItem(16,"Sugarcane Juice Shop",LOC_SUGAR));
        addItem(new MapsItem(17,"ATM",LOC_ATM));
        addItem(new MapsItem(18,"Canteen",LOC_CANT));
    }

    private static void addItem(MapsItem item) {
        ITEMS.add(item);
    }
}
