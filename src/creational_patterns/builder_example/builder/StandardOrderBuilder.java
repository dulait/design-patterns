package creational_patterns.builder_example.builder;

import creational_patterns.builder_example.product.Order;

import java.time.LocalDateTime;

public class StandardOrderBuilder implements OrderBuilder {

    private final Order order = new Order();

    public StandardOrderBuilder(String itemName, int quantity) {
        order.setItemName(itemName);
        order.setQuantity(quantity);
    }

    @Override
    public Order build() {
        return order;
    }

    @Override
    public OrderBuilder withRushDelivery() {
        order.setRushDelivery(false);
        return this;
    }

    @Override
    public OrderBuilder withGiftWrapping() {
        order.setGiftWrapping(false);
        return this;
    }

    @Override
    public OrderBuilder withDeliveryTime(LocalDateTime deliveryTime) {
        order.setDeliveryTime(deliveryTime);
        return this;
    }
}