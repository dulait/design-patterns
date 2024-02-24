package creational_patterns.builder_example.builder;

import creational_patterns.builder_example.product.Order;

import java.time.LocalDateTime;

public interface OrderBuilder {

    Order build();

    OrderBuilder withRushDelivery();

    OrderBuilder withGiftWrapping();

    OrderBuilder withDeliveryTime(LocalDateTime deliveryTime);


}