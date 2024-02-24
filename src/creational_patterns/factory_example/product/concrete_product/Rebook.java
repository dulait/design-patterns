package creational_patterns.factory_example.product.concrete_product;

import creational_patterns.factory_example.product.abstract_product.Shoe;

public class Rebook extends Shoe {
    public Rebook(double price) {
        super(price);
    }

    @Override
    public void showDetails() {
        System.out.println("The price of the Rebook shoe is: " + getPrice());
    }
}