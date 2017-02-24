package com.sirmvit.vtufest2k17.Maps;

import com.google.android.gms.maps.model.LatLng;
import com.sirmvit.vtufest2k17.R;

import java.util.ArrayList;
import java.util.List;

public class MapsContent {
    public static List<MapsItem> ITEMS;
    private static final LatLng LOCATION_CA;
    private static final LatLng LOCATION_CA_OFF;
    private static final LatLng LOCATION_CB;
    private static final LatLng LOCATION_CB_OFF;
    private static final LatLng LOCATION_CS;
    private static final LatLng LOCATION_CS_OFF;
    private static final LatLng LOCATION_DEN;
    private static final LatLng LOCATION_DEN_OFF;
    private static final LatLng LOCATION_GROUND;
    private static final LatLng LOCATION_GROUND_OFF;
    private static final LatLng LOCATION_LIB;
    private static final LatLng LOCATION_LIB_OFF;
    private static final LatLng LOCATION_MBA;
    private static final LatLng LOCATION_MBA_OFF;
    private static final LatLng LOCATION_ME;
    private static final LatLng LOCATION_ME_OFF;
    private static final LatLng LOCATION_MVIT;
    private static final LatLng LOCATION_MVIT_OFF;
    private static final LatLng LOCATION_NA;
    private static final LatLng LOCATION_NA_OFF;
    private static final LatLng LOCATION_NB;
    private static final LatLng LOCATION_NB_OFF;
    private static final LatLng LOCATION_OA;
    private static final LatLng LOCATION_OA_OFF;
    private static final LatLng LOCATION_PL;
    private static final LatLng LOCATION_PL_OFF;
    private static final LatLng LOCATION_SCIENCE;
    private static final LatLng LOCATION_SCIENCE_OFF;
    private static final LatLng LOCATION_WORK;
    private static final LatLng LOCATION_WORK_OFF;

    static {
        LOCATION_MVIT = new LatLng(13.15103d, 77.610929d);
        LOCATION_MVIT_OFF = new LatLng(13.151031d, 77.610961d);
        LOCATION_SCIENCE = new LatLng(13.150812d, 77.609026d);
        LOCATION_SCIENCE_OFF = new LatLng(13.150813d, 77.609058d);
        LOCATION_NB = new LatLng(13.150893d, 77.610195d);
        LOCATION_NB_OFF = new LatLng(13.150894d, 77.610227d);
        LOCATION_NA = new LatLng(13.151428d, 77.607093d);
        LOCATION_NA_OFF = new LatLng(13.151429d, 77.607125d);
        LOCATION_OA = new LatLng(13.1513653d, 77.607215d);
        LOCATION_OA_OFF = new LatLng(13.1513654d, 77.6072182d);
        LOCATION_LIB = new LatLng(13.151283d, 77.608933d);
        LOCATION_LIB_OFF = new LatLng(13.151284d, 77.608965d);
        LOCATION_PL = new LatLng(13.150273d, 77.609734d);
        LOCATION_PL_OFF = new LatLng(13.150274d, 77.609766d);
        LOCATION_CS = new LatLng(13.151042d, 77.608881d);
        LOCATION_CS_OFF = new LatLng(13.151043d, 77.608913d);
        LOCATION_CA = new LatLng(13.149867d, 77.610226d);
        LOCATION_CA_OFF = new LatLng(13.149868d, 77.610258d);
        LOCATION_ME = new LatLng(13.150604d, 77.6084d);
        LOCATION_ME_OFF = new LatLng(13.150605d, 77.608432d);
        LOCATION_CB = new LatLng(13.150856d, 77.60869d);
        LOCATION_CB_OFF = new LatLng(13.150857d, 77.608722d);
        LOCATION_MBA = new LatLng(13.151316d, 77.609377d);
        LOCATION_MBA_OFF = new LatLng(13.151317d, 77.609409d);
        LOCATION_DEN = new LatLng(13.149771d, 77.608481d);
        LOCATION_DEN_OFF = new LatLng(13.149772d, 77.608513d);
        LOCATION_WORK = new LatLng(13.151112d, 77.607833d);
        LOCATION_WORK_OFF = new LatLng(13.151113d, 77.607865d);
        LOCATION_GROUND = new LatLng(13.14973d, 77.605473d);
        LOCATION_GROUND_OFF = new LatLng(13.149731d, 77.605505d);
        ITEMS = new ArrayList();
        addItem(new MapsItem(LOCATION_MVIT, R.string.title_mvit, LOCATION_MVIT_OFF));
        addItem(new MapsItem(LOCATION_SCIENCE, R.string.title_science, LOCATION_SCIENCE_OFF));
        addItem(new MapsItem(LOCATION_NB, R.string.title_newblock, LOCATION_NB_OFF));
        addItem(new MapsItem(LOCATION_NA, R.string.title_audi, LOCATION_NA_OFF));
        addItem(new MapsItem(LOCATION_OA, R.string.title_oldaudi, LOCATION_OA_OFF));
        addItem(new MapsItem(LOCATION_LIB, R.string.title_library, LOCATION_LIB_OFF));
        addItem(new MapsItem(LOCATION_PL, R.string.title_parking, LOCATION_PL_OFF));
        addItem(new MapsItem(LOCATION_CS, R.string.title_coffee, LOCATION_CS_OFF));
        addItem(new MapsItem(LOCATION_CA, R.string.title_canteen, LOCATION_CA_OFF));
        addItem(new MapsItem(LOCATION_ME, R.string.title_mech, LOCATION_ME_OFF));
        addItem(new MapsItem(LOCATION_CB, R.string.title_civil, LOCATION_CB_OFF));
        addItem(new MapsItem(LOCATION_MBA, R.string.title_mba, LOCATION_MBA_OFF));
        addItem(new MapsItem(LOCATION_DEN, R.string.title_den, LOCATION_DEN_OFF));
        addItem(new MapsItem(LOCATION_WORK, R.string.title_work, LOCATION_WORK_OFF));
        addItem(new MapsItem(LOCATION_GROUND, R.string.title_ground, LOCATION_GROUND_OFF));
    }

    private static void addItem(MapsItem item) {
        ITEMS.add(item);
    }
}
