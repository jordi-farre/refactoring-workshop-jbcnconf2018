package com.refactoring.tutor.interpreter.specs;

import com.refactoring.tutor.interpreter.Product;
import com.refactoring.tutor.interpreter.ProductSize;
import com.refactoring.tutor.interpreter.Spec;

public class SizeSpec implements Spec {
    private final ProductSize size;

    public SizeSpec(ProductSize size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getSize().equals(size);
    }
}
