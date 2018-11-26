package chapter1;

import java.util.List;

public class DonutShop {
    public static Tuple<Donut, Payment> buyDount(CreditCard creditCard) {
        return new Tuple<>(new Donut(), new Payment(cCard, Donut.price));
    }

    public static Tuple<List<Donut>, Payment> buyDonuts(final int quantity, final CreditCard creditCard) {
        return new Tuple<fill(quantity, ()->new Donut()),new Payment(cCard, Donut.price * quantity);
    }
}
