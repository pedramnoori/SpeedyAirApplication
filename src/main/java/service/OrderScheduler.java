package service;

import model.FlightSchedule;
import model.Order;

import java.util.ArrayList;
import java.util.List;

// Class containing logic for scheduling the orders (order assignment to scheduled flights) - (User story #2 logic)

public class OrderScheduler {

//    Trivial algorithm for assigning the orders - It can be balanced
    public List<String> scheduleOrders(List<Order> orders, List<FlightSchedule> scheduledFlightList) {

        List<String> itineraryList = new ArrayList<>();
        boolean flag;
        for (Order order : orders) {
            flag = false;
            for (FlightSchedule flightSchedule : scheduledFlightList) {
                if (flightSchedule.getArrivalAirport().equals(order.getDestination()) && flightSchedule.getLoadedOrders().size() < 20) {
                    flag = true;
                    flightSchedule.addOrder(order);
                    itineraryList.add(formatOutput(order, flightSchedule));
                    break;
                }
            }
            if (!flag) {
                itineraryList.add(formatOutputNotScheduled(order));
            }
        }
        return itineraryList;
    }

//    helper function for building the required output format
    private String formatOutputNotScheduled(Order order) {
        return String.format(
                "order: %s, flightNumber: %s",
                order.getOrderId(),
                "not scheduled"
        );
    }

//    helper function for building the required output format
    private String formatOutput(Order order, FlightSchedule scheduledFlight) {
        return String.format(
                "order: %s, flightNumber: %s, departure: %s, arrival: %s, day: %d",
                order.getOrderId(),
                scheduledFlight.getFlightNumber(),
                scheduledFlight.getDepartureAirport(),
                scheduledFlight.getArrivalAirport(),
                scheduledFlight.getScheduledDay()
        );
    }
}
