package Task2;

import java.util.List;

public class PaymentLogic {
    public double paymentCost(Payment payment) {
        double sum = 0;

        for (Payment.Product product : payment.getProducts()) {
            sum += product.getPrice();
        }

        return sum;
    }
}
