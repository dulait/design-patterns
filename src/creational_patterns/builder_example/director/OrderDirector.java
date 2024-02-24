package creational_patterns.builder_example.director;

import creational_patterns.builder_example.builder.OrderBuilder;
import creational_patterns.builder_example.product.Order;

public class OrderDirector {

    private final OrderBuilder orderBuilder;

    public OrderDirector(OrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public Order buildStandardOrder() {
        return orderBuilder.build();
    }

    public Order buildPremiumOrder() {
        return orderBuilder.build();
    }
}