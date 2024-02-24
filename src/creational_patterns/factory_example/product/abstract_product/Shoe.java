package creational_patterns.factory_example.product.abstract_product;

public abstract class Shoe {
    protected double price;

    public Shoe(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void showDetails();

}