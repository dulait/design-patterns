package creational_patterns.builder_example;

import creational_patterns.builder_example.builder.OrderBuilder;
import creational_patterns.builder_example.builder.PremiumOrderBuilder;
import creational_patterns.builder_example.builder.StandardOrderBuilder;
import creational_patterns.builder_example.director.OrderDirector;
import creational_patterns.builder_example.product.Order;

import java.time.LocalDateTime;

public class BuilderExample {

    public static void main(String[] args) {
        OrderBuilder standardOrderBuilder = new StandardOrderBuilder("ProductA", 1)
                .withDeliveryTime(LocalDateTime.now().plusDays(2));

        OrderDirector standardOrderDirector = new OrderDirector(standardOrderBuilder);
        Order standardOrder = standardOrderDirector.buildStandardOrder();
        System.out.println("Standard Order: " + standardOrder);


        OrderBuilder premiumOrderBuilder = new PremiumOrderBuilder("ProductA", 1)
                .withDeliveryTime(LocalDateTime.now());

        OrderDirector premiumOrderDirector = new OrderDirector(premiumOrderBuilder);
        Order premiumOrder = premiumOrderDirector.buildPremiumOrder();
        System.out.println("Premium Order: " + premiumOrder);
    }
}