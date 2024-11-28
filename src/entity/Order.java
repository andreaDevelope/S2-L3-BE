package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private long Id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products = new ArrayList<>();
    private Customer customer;

    public Order(LocalDate deliveryDate, long id, LocalDate orderDate, String status, List<Product> products) {
        this.deliveryDate = deliveryDate;
        Id = id;
        this.orderDate = orderDate;
        this.status = status;
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return Id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    public Order(Customer customer) {
        this.customer = customer;
    }


}
