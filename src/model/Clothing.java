package model;

// Clothing Products subclass
import payment.PaymentMethods;

public class Clothing extends Product implements PaymentMethods {

    public Clothing(String id, String name, double price, int qty) {
        super(id, name, price, qty, "Clothing");
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
