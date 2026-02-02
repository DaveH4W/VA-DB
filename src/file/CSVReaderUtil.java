package file;

// CSV Reader Operations
import model.Product;
import model.Electronics;
import model.Clothing;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderUtil {

    public static List<Product> readProducts(String path, String type) throws Exception {
        List<Product> products = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(path));

        for (String line : lines) {
            if (line.startsWith("id") || line.trim().isEmpty()) continue; // skip headers

            String[] parts = line.split(",");
            String id = parts[0];
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            int qty = Integer.parseInt(parts[3]);

            if ("Electronics".equalsIgnoreCase(type)) {
                products.add(new Electronics(id, name, price, qty));
            } else if ("Clothing".equalsIgnoreCase(type)) {
                products.add(new Clothing(id, name, price, qty));
            }
        }

        return products;
    }
}
