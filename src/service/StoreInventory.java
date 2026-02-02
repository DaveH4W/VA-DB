package service;

// Main Product Handler
import model.Product;
import java.util.ArrayList;
import java.util.List;

public class StoreInventory {

    private final List<Product> products = new ArrayList<>();

    public void importFromCSV(List<Product> list) {
        products.addAll(list);
    }

    public void printAll() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
