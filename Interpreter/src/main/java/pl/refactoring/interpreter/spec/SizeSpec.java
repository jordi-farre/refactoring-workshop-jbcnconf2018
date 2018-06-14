package pl.refactoring.interpreter.spec;

import pl.refactoring.interpreter.Product;
import pl.refactoring.interpreter.ProductSize;
import pl.refactoring.interpreter.Spec;

public class SizeSpec implements Spec {

    private final ProductSize size;

    public SizeSpec(final ProductSize size) {
        this.size = size;
    }

    public boolean isSatisfiedBy(final Product product) {
        return product.getSize().equals(size);
    }
}
