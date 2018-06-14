package pl.refactoring.interpreter.spec;

import pl.refactoring.interpreter.Product;
import pl.refactoring.interpreter.ProductColor;

import java.util.function.Predicate;

public interface Specs {
    static Predicate<Product> color(ProductColor color) {
        return (Product product) -> product.getColor().equals(color);
    }
}
