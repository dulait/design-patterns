package creational_patterns.builder_example.product;

import java.time.LocalDateTime;

public class Order {

    private String itemName;
    private int quantity;
    private boolean rushDelivery;
    private boolean giftWrapping;
    private LocalDateTime deliveryTime;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isRushDelivery() {
        return rushDelivery;
    }

    public void setRushDelivery(boolean rushDelivery) {
        this.rushDelivery = rushDelivery;
    }

    public boolean isGiftWrapping() {
        return giftWrapping;
    }

    public void setGiftWrapping(boolean giftWrapping) {
        this.giftWrapping = giftWrapping;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return itemName + ", " + quantity + ", " + rushDelivery + ", " + giftWrapping + ", " + deliveryTime;
    }
}