package creational_patterns.builder_example.builder;

import creational_patterns.builder_example.product.Order;

import java.time.LocalDateTime;

public class PremiumOrderBuilder implements OrderBuilder {

    private final Order order = new Order();

    public PremiumOrderBuilder(String itemName, int quantity) {
        order.setItemName(itemName);
        order.setQuantity(quantity);
    }


    @Override
    public Order build() {
        order.setRushDelivery(true);
        order.setGiftWrapping(true);
        return order;
    }

    @Override
    public OrderBuilder withRushDelivery() {
        return this;
    }

    @Override
    public OrderBuilder withGiftWrapping() {
        return this;
    }

    @Override
    public OrderBuilder withDeliveryTime(LocalDateTime deliveryTime) {
        order.setDeliveryTime(deliveryTime.plusDays(1));
        return this;
    }
}