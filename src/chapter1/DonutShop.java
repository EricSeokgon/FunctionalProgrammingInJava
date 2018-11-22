package chapter1;

public class DonutShop {
    public static Tuple<Donut, Payment> buyDount(CreditCard creditCard) {
        Donut dount = new Donut();
        Payment payment = new Payment(creditCard, (Integer) Donut.price);
        return new Tuple<>(dount, payment);
    }
}
