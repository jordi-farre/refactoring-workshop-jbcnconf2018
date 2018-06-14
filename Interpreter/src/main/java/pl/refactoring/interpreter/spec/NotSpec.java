package pl.refactoring.interpreter.spec;

import pl.refactoring.interpreter.Product;
import pl.refactoring.interpreter.Spec;

public class NotSpec implements Spec {

    private final Spec spec;

    public NotSpec(final Spec spec) {
        this.spec = spec;
    }

    public boolean isSatisfiedBy(final Product product) {
        return !spec.isSatisfiedBy(product);
    }
}
