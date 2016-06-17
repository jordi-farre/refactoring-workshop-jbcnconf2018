package com.refactoring.tutor.interpreter.specs;

import com.refactoring.tutor.interpreter.Product;
import com.refactoring.tutor.interpreter.Spec;

public class AndSpec implements Spec {
    private final Spec[] specs;

    public AndSpec(Spec... specs){
        super();
        this.specs = specs;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        for(Spec spec : specs)
            if(spec.isSatisfiedBy(product) == false)
                return false;
        return true;
    }
}
