package dao;

// Data Access Object (DAO) - Design pattern to abstract and encapsulate
// all database access operations into a separate layer.
import model.Product;
import java.util.List;

public interface ProductDAO {
    void saveAll(List<Product> products);
}
