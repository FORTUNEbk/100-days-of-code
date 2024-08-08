package Service;

import Model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {

    private List<Product> products = Arrays.asList(
            new Product(101, "iPhone", 50000),
            new Product(102, "Samsung Galaxy", 40000),
            new Product(103, "OnePlus", 30000)
    );

    public List<Product> getProducts() {
        return products;
    }
}
