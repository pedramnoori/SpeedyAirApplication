package service;

import model.FlightSchedule;

import java.util.ArrayList;
import java.util.List;

// Class containing the logic for loading the flight schedules (User story #1)

public class FlightScheduleLoader {

//    Building the required string pattern for showing the flight schedule
    public List<FlightSchedule> loadFlightSchedule() {
        List<FlightSchedule> flightSchedules = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            flightSchedules.add(new FlightSchedule(i, "YUL", getDestinationCity(i), 1, 20));
        }

        for (int i = 4; i <= 6; i++) {
            flightSchedules.add(new FlightSchedule(i, "YUL", getDestinationCity(i), 2, 20));
        }

        return flightSchedules;
    }

//    Finding the destination city based on the flight number
    public String getDestinationCity(int flightNumber) {
        switch (flightNumber % 3) {
            case 1:
                return "YYZ";
            case 2:
                return "YYC";
            case 0:
            default:
                return "YVR";
        }
    }
}
