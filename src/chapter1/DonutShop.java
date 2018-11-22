package chapter1;

public class DonutShop {
    public static Donut buyDount(CreditCard creditCard) {
        Dount dount = new Dount();
        creditCard.charge(Donut.price);
        return dount;
    }
}
