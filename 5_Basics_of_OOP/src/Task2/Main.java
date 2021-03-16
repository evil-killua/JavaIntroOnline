package Task2;

public class Main {

    public static void main(String[] args) {
        /*
          Создать класс Payment c внутренним классом, с помощью объектов кторого можно сформировать покупку
          из нескольких товаров.
         */

        double allCost = 0;
        PaymentLogic paymentLogic = new PaymentLogic();
        PaymentView paymentView = new PaymentView();
        Payment payment = new Payment();

        payment.addProduct(new Payment.Product("A", 100));
        payment.addProduct(new Payment.Product("B", 200));
        payment.addProduct(new Payment.Product("C", 300));
        payment.addProduct(new Payment.Product("D", 400));

        paymentView.printPayment(payment);
        allCost = paymentLogic.paymentCost(payment);
        paymentView.printAllCost(allCost);


    }

}
