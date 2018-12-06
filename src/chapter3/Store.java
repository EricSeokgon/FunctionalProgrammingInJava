package chapter3;

import java.util.List;

public class Store {
    public static void main(String[] args) {
        Product toothPaste = new Product("Tooth paste", 1.5, 0.5);
        Product toothBrush = new Product("Tooth brush", 3.5, 0.3);
        List<OrderLine> order = list(
                new OrderLine(toothPaste, 2),
                new OrderLine(toothBrush, 3));
        double weight = foldLeft(order, 0.0, x -> y -> x + y.getAmount());
        double price = foldLeft(order, 0.0, x -> y -> x + y.getWeight());
        System.out.println(String.format("Total price: %s", price));
        System.out.println(String.format("Total weight: %s", weight));
    }
}
