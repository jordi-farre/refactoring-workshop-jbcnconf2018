package pl.refactoring.interpreter.spec;

import pl.refactoring.interpreter.Product;
import pl.refactoring.interpreter.ProductColor;
import pl.refactoring.interpreter.Spec;

public class ColorSpec implements Spec {

    private final ProductColor color;

    public ColorSpec(final ProductColor color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfiedBy(final Product product) {
        return product.getColor().equals(color);
    }
}
