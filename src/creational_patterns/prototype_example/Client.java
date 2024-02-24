package creational_patterns.prototype_example;

import creational_patterns.prototype_example.concrete_prototype.Lion;
import creational_patterns.prototype_example.concrete_prototype.Tiger;
import creational_patterns.prototype_example.prototype.Animal;

public class Client {

    public static void main(String[] args) {
        Animal tigerPrototype = new Tiger();

        Animal newTiger = tigerPrototype.clone();
        System.out.println("I'm the new Tiger in town!");
        newTiger.makeSound();

        Animal lionPrototype = new Lion();

        Animal newLion = lionPrototype.clone();
        System.out.println("I'm the new Lion in town!");
        newLion.makeSound();
    }
}