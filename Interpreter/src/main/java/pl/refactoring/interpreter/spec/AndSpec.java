package pl.refactoring.interpreter.spec;

import pl.refactoring.interpreter.Product;
import pl.refactoring.interpreter.Spec;

public class AndSpec implements Spec {

    private final Spec leftSpec;
    private final Spec rightSpec;

    public AndSpec(final Spec leftSpec, final Spec rightSpec) {
        this.leftSpec = leftSpec;
        this.rightSpec = rightSpec;
    }

    public boolean isSatisfiedBy(final Product product) {
        return leftSpec.isSatisfiedBy(product) && rightSpec.isSatisfiedBy(product);
    }
}
