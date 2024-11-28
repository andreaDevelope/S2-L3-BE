package entity;

public class Customer {
    private long Id;
    private String name;
    private int tier;

    public Customer(long id, String name, int tier) {
        Id = id;
        this.name = name;
        this.tier = tier;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
