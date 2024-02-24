package creational_patterns.factory_example.product.concrete_product;

import creational_patterns.factory_example.product.abstract_product.Shoe;

public class Nike extends Shoe {
    public Nike(double price) {
        super(price);
    }

    @Override
    public void showDetails() {
        System.out.println("The price of the Nike shoe is: " + getPrice());
    }
}