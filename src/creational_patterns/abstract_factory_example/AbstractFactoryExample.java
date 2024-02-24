package creational_patterns.abstract_factory_example;

import creational_patterns.abstract_factory_example.factory.abstract_factory.GUIFactory;
import creational_patterns.abstract_factory_example.factory.concrete_factory.MacFactory;
import creational_patterns.abstract_factory_example.factory.concrete_factory.WindowsFactory;
import creational_patterns.abstract_factory_example.product.abstract_product.Button;
import creational_patterns.abstract_factory_example.product.abstract_product.Checkbox;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        // Here we create a Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();

        // The Client does not know the implementation details of the windowsFactory.createButton() method
        Button windowsButton = windowsFactory.createButton();

        // The Client does not know the implementation details of the windowsFactory.createCheckbox() method
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsButton.click();
        windowsCheckbox.check();

        // Same process applies for creating the Mac GUI
        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        macButton.click();
        macCheckbox.check();

    }

}