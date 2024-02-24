package creational_patterns.abstract_factory_example.product.concrete_product;

import creational_patterns.abstract_factory_example.product.abstract_product.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked a Windows button!");
    }
}