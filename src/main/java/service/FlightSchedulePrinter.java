package service;

import model.FlightSchedule;

import java.util.List;

// Class with the sole responsibility of printing the flight schedules

public class FlightSchedulePrinter {

    public void printFlightSchedule(List<FlightSchedule> flightSchedules) {
        for (FlightSchedule flight : flightSchedules) {
            System.out.println("Flight: " + flight.getFlightNumber() +
                    ", departure: " + flight.getDepartureAirport() +
                    ", arrival: " + flight.getArrivalAirport() +
                    ", day: " + flight.getScheduledDay());
        }
    }
}
