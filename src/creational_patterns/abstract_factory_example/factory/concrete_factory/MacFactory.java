package creational_patterns.abstract_factory_example.factory.concrete_factory;

import creational_patterns.abstract_factory_example.factory.abstract_factory.GUIFactory;
import creational_patterns.abstract_factory_example.product.abstract_product.Button;
import creational_patterns.abstract_factory_example.product.abstract_product.Checkbox;
import creational_patterns.abstract_factory_example.product.concrete_product.MacButton;
import creational_patterns.abstract_factory_example.product.concrete_product.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}