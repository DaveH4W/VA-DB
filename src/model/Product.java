package model;

// Generic product abstract class
public abstract class Product {
    private final String id;
    private final String name;
    private final double price;
    private final int qty;
    private final String category;

    public Product(String id, String name, double price, int qty, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getCategory() {
        return category;
    }

    public String toCSV() {
        return id + "," + name + "," + price + "," + qty;
    }

    @Override
    public String toString() {
        return "[" + category + "] " + id + " | " + name + " | $" + price + " | qty=" + qty;
    }
}
