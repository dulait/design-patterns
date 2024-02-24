package creational_patterns.factory_example;

import creational_patterns.factory_example.client.ShoeStore;
import creational_patterns.factory_example.factory.concrete_factory.ShoeStoreFactory;
import creational_patterns.factory_example.product.abstract_product.Shoe;

public class FactoryExample {

    public static void main(String[] args) {
        ShoeStore store = new ShoeStore(new ShoeStoreFactory());
        Shoe shoe = store.orderShoe("Nike", 1000);
        shoe.showDetails();
    }
}