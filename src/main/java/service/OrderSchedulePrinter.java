package service;

import java.util.List;

// Class with the sole purpose of printing the order schedule (itinerary)

public class OrderSchedulePrinter {

    public void printItinerary(List<String> itineraryList) {
        for (String itinerary : itineraryList) {
            System.out.println(itinerary);
        }
    }
}
