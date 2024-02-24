package creational_patterns.abstract_factory_example.product.concrete_product;

import creational_patterns.abstract_factory_example.product.abstract_product.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked a Mac button!");
    }
}