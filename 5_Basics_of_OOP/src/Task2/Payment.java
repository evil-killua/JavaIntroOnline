package Task2;

public class Payment {

    class Product {

        String name;
        double price;

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
    }

    public double bay(Payment.Product... products){
        double fullPrice=0;

        for (Payment.Product product : products)
            fullPrice+=product.getPrice();

        return fullPrice;
    }

}
