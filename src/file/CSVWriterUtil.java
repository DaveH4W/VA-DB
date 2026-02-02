package file;
// CSV Writer Operations
import model.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class CSVWriterUtil {

    public static void writeProducts(List<Product> products, String filePath) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            for (Product p : products) {
                bw.write(p.toCSV());
                bw.newLine();
            }
        }
    }
}
