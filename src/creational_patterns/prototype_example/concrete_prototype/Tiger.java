package creational_patterns.prototype_example.concrete_prototype;

import creational_patterns.prototype_example.prototype.Animal;

public class Tiger implements Animal {
    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Girly Hiss");
    }
}