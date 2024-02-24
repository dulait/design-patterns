package creational_patterns.abstract_factory_example.factory.abstract_factory;

import creational_patterns.abstract_factory_example.product.abstract_product.Button;
import creational_patterns.abstract_factory_example.product.abstract_product.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}