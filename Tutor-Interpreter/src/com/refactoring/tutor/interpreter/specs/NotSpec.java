package com.refactoring.tutor.interpreter.specs;

import com.refactoring.tutor.interpreter.Product;
import com.refactoring.tutor.interpreter.Spec;

public class NotSpec implements Spec {
    private final Spec spec;

    public NotSpec(Spec spec) {
        super();
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return !spec.isSatisfiedBy(product);
    }
}
