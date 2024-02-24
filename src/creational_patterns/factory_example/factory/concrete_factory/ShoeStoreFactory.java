package creational_patterns.factory_example.factory.concrete_factory;

import creational_patterns.factory_example.factory.abstract_factory.ShoeFactory;
import creational_patterns.factory_example.product.abstract_product.Shoe;
import creational_patterns.factory_example.product.concrete_product.Adidas;
import creational_patterns.factory_example.product.concrete_product.Nike;
import creational_patterns.factory_example.product.concrete_product.Rebook;

public class ShoeStoreFactory implements ShoeFactory {
    @Override
    public Shoe orderShoe(String brand, double price) {
        switch (brand) {
            case "Nike" -> {
                return new Nike(price);
            }
            case "Adidas" -> {
                return new Adidas(price);
            }
            case "Rebook" -> {
                return new Rebook(price);
            }
        }
        return null;
    }
}