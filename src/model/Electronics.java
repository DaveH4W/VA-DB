package model;

// Electronics Products subclass
import payment.PaymentMethods;

public class Electronics extends Product implements PaymentMethods {

    public Electronics(String id, String name, double price, int qty) {
        super(id, name, price, qty, "Electronics");
    }

    @Override
    public void payWithCreditCard() {
        System.out.println(getName() + " paid with credit card.");
    }

    @Override
    public void payWithCash() {
        System.out.println(getName() + " paid with cash.");
    }
}
