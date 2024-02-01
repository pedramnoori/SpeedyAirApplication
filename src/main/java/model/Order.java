package model;

//Model for storing orders

public class Order {
    private String orderId;
    private String destination;

    public Order(String orderId, String destination) {
        this.orderId = orderId;
        this.destination = destination;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
