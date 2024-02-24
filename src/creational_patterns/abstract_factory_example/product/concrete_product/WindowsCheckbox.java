package creational_patterns.abstract_factory_example.product.concrete_product;

import creational_patterns.abstract_factory_example.product.abstract_product.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Checked a Windows checkbox!");
    }
}