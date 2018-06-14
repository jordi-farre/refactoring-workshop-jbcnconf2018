package pl.refactoring.interpreter.spec;

import pl.refactoring.interpreter.Product;
import pl.refactoring.interpreter.Spec;

public class AbovePriceSpec implements Spec {
    private final float price;

    public AbovePriceSpec(final float price) {
        this.price = price;
    }

    public boolean isSatisfiedBy(final Product product) {
        return product.getPrice() > price;
    }
}
