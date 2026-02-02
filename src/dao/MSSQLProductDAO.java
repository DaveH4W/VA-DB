package dao;
// JDBC - MS SQL DAO Methods
import model.Product;
import java.util.List;

public class MSSQLProductDAO implements ProductDAO {

    @Override
    public void saveAll(List<Product> products) {
        // TODO: Add real database logic
        System.out.println("Saved " + products.size() + " products to the database (placeholder).");
    }
}
