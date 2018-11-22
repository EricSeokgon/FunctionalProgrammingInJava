package chapter1;

public class DonutShop {
    public static Tuple<Donut, Payment> buyDount(CreditCard creditCard) {
        Donut dount = new Donut();
        creditCard.charge(Donut.price);
        return dount;
    }
}
