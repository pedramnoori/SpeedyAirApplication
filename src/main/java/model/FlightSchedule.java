package model;

import java.util.ArrayList;
import java.util.List;

//Model for storing scheduled flights

public class FlightSchedule {

    private int flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private int scheduledDay;
    private int maxCapacity;
    private List<Order> loadedOrders;

    public FlightSchedule(int flightNumber, String departureAirport, String arrivalAirport, int scheduledDay, int maxCapacity) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.scheduledDay = scheduledDay;
        this.maxCapacity = maxCapacity;
        this.loadedOrders = new ArrayList<>();
    }

    public List<Order> getLoadedOrders() {
        return loadedOrders;
    }

    public void setLoadedOrders(List<Order> loadedOrders) {
        this.loadedOrders = loadedOrders;
    }

    public void addOrder(Order order) {
        this.loadedOrders.add(order);
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getScheduledDay() {
        return scheduledDay;
    }

    public void setScheduledDay(int scheduledDay) {
        this.scheduledDay = scheduledDay;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
