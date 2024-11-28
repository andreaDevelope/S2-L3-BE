package entity;


public class Product {
    private long Id;
    private String name;
    private double price;
    private String category;

    public Product(String category, String name, double price, long id) {
        this.category = category;
        this.name = name;
        this.price = price;
        Id = id;
    }

    public String getCategory() {
        return category;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
