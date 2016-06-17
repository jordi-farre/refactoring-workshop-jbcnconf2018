package com.refactoring.tutor.interpreter.specs;

import com.refactoring.tutor.interpreter.Product;
import com.refactoring.tutor.interpreter.Spec;

public class AbovePriceSpec implements Spec {
    private float price;

    public AbovePriceSpec(float price) {
        this.price = price;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getPrice() > price;
    }
}
