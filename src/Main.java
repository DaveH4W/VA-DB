import dao.MSSQLProductDAO;
import dao.ProductDAO;
import model.Product;
import service.StoreInventory;
import file.CSVReaderUtil;

import java.util.List;

// StoreInventory Main method
public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> electronics = CSVReaderUtil.readProducts("src/electronics.csv", "Electronics");
        List<Product> clothing = CSVReaderUtil.readProducts("src/clothing.csv", "Clothing");

        ProductDAO dao = new MSSQLProductDAO();
        StoreInventory inventory = new StoreInventory();

        inventory.importFromCSV(electronics);
        inventory.importFromCSV(clothing);

        System.out.println("---- INVENTORY ----");
        inventory.printAll();
    }
}
