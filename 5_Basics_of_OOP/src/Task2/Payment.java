package Task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<Product> products;

    {
        products = new ArrayList<Product>();
    }

    public Payment() {

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "products=" + products +
                '}';
    }

    public static class Product {

        private String name;
        private double price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
