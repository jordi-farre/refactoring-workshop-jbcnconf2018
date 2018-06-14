package pl.refactoring.interpreter.spec;

import pl.refactoring.interpreter.Product;
import pl.refactoring.interpreter.Spec;

public class BelowPriceSpec implements Spec {

    private final float price;

    public BelowPriceSpec(final float price) {
        this.price = price;
    }

    public boolean isSatisfiedBy(final Product product) {
        return product.getPrice() < price;
    }
}
