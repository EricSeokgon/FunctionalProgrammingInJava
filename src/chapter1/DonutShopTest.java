package chapter1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class DonutShopTest {

    @Test
    public void testBuyDonuts() {
        CreditCard creditCard = new CreditCard();
        Tuple<List<Donut>, Payment> purchase = DonutShop.buyDonuts(5, creditCard);
        assertEquals(Donut.price * 5, purchase._2.amount);
        assertEquals(creditCard, purchase._2.creditCard);
    }

}
