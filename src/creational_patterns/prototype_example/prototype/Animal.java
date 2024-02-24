package creational_patterns.prototype_example.prototype;

public interface Animal extends Cloneable {

    Animal clone();

    void makeSound();
}