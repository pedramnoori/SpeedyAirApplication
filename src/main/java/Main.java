import model.FlightSchedule;
import model.Order;
import service.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        final String JSON_PATH = "src/main/resources/json/coding-assigment-orders.json";

//      User story #1 - Display flight schedules

        FlightScheduleLoader flightScheduleLoader = new FlightScheduleLoader();
        List<FlightSchedule> flightSchedules = flightScheduleLoader.loadFlightSchedule();

        FlightSchedulePrinter flightSchedulePrinter = new FlightSchedulePrinter();
        flightSchedulePrinter.printFlightSchedule(flightSchedules);

        System.out.println("-------------------------------");

//      User story #2 - Generate flight itineraries based on orders

        OrderLoader orderLoader = new OrderLoader();
        List<Order> orders = orderLoader.loadOrderBatch(JSON_PATH);

        OrderScheduler orderScheduler = new OrderScheduler();
        List<String> itineraryList = orderScheduler.scheduleOrders(orders, flightSchedules);

        OrderSchedulePrinter orderSchedulePrinter = new OrderSchedulePrinter();
        orderSchedulePrinter.printItinerary(itineraryList);
    }
}
