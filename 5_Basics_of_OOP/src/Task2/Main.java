package Task2;

public class Main {

    public static void main(String[] args) {
        /*
          Создать класс Payment c внутренним классом, с помощью объектов кторого можно сформировать покупку
          из нескольких товаров.
         */
        Payment payment = new Payment();

        Payment.Product product1 = payment.new Product("A",100);
        Payment.Product product2 = payment.new Product("B",220);
        Payment.Product product3 = payment.new Product("C",300);
        Payment.Product product4 = payment.new Product("D",150);
        Payment.Product product5 = payment.new Product("E",10);

        System.out.println("полная цена товара: " + payment.bay(product1,product2,product3,product4,product5));
    }

}
