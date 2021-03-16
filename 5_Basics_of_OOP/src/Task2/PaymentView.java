package Task2;

public class PaymentView {
    public void printPayment(Payment payment) {
        System.out.println("все покупки:");
        for (Payment.Product product : payment.getProducts()) {
            System.out.println(product.toString());
        }
    }

    public void printAllCost(double cost) {
        System.out.println("сумма всех покупок: " + cost);
    }
}

