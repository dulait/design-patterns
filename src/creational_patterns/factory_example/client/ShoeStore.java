package creational_patterns.factory_example.client;

import creational_patterns.factory_example.factory.abstract_factory.ShoeFactory;
import creational_patterns.factory_example.product.abstract_product.Shoe;

public class ShoeStore {

    private ShoeFactory factory;

    public ShoeStore(ShoeFactory factory) {
        this.factory = factory;
    }

    public Shoe orderShoe(String brand, double price) {
        return factory.orderShoe(brand, price);
    }
}