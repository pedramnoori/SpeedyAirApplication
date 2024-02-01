package service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Order;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Class with the sole responsibility of parsing the JSON file and converting it to an object list

public class OrderLoader {

    public List<Order> loadOrderBatch(String filePath) {

        List<Order> orders = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
            Iterator<String> fieldNames = jsonNode.fieldNames();
            while (fieldNames.hasNext()) {
                String orderId = fieldNames.next();
                JsonNode orderNode = jsonNode.get(orderId);

                Order order = new Order();
                order.setOrderId(orderId);
                order.setDestination(orderNode.get("destination").asText());

                orders.add(order);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orders;
    }
}
