package com.sirmvit.vtufest2k17;

import java.util.ArrayList;

public class EventFeed {
    ArrayList<OuterData> eventList = new ArrayList<>();

}

class OuterData {
    String loc;
    ArrayList<InnerData> innerData;
}

class InnerData {
    String eventName;
    int eventDay;
    String eventTime;
}
