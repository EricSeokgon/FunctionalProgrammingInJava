package chapter1;

public class DonutShop {
    public static Donut buyDount(CreditCard creditCard) {
        Donut dount = new Donut();
        creditCard.charge(Donut.price);
        return dount;
    }
}
