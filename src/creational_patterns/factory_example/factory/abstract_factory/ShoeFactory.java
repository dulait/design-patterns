package creational_patterns.factory_example.factory.abstract_factory;

import creational_patterns.factory_example.product.abstract_product.Shoe;

public interface ShoeFactory {
    Shoe orderShoe(String brand, double price);

}