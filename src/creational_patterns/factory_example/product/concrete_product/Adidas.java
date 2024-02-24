package creational_patterns.factory_example.product.concrete_product;

import creational_patterns.factory_example.product.abstract_product.Shoe;

public class Adidas extends Shoe {
    public Adidas(double price) {
        super(price);
    }

    @Override
    public void showDetails() {
        System.out.println("The price of the Adidas shoe is: " + getPrice());
    }
}