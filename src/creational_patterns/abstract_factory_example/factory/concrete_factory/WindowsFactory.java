package creational_patterns.abstract_factory_example.factory.concrete_factory;

import creational_patterns.abstract_factory_example.factory.abstract_factory.GUIFactory;
import creational_patterns.abstract_factory_example.product.abstract_product.Button;
import creational_patterns.abstract_factory_example.product.abstract_product.Checkbox;
import creational_patterns.abstract_factory_example.product.concrete_product.WindowsButton;
import creational_patterns.abstract_factory_example.product.concrete_product.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}