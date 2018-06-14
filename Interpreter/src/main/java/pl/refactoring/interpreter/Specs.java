package pl.refactoring.interpreter;

import java.util.function.Predicate;

public interface Specs {
    static Predicate<Product> color(ProductColor color) {
        return product -> product.getColor().equals(color);
    }

    static Predicate<Product> belowPrice(float price) {
        return product -> product.getPrice() < price;
    }

    static Predicate<Product> abovePrice(float price) {
        return product -> product.getPrice() > price;
    }

    static Predicate<Product> size(ProductSize size) {
        return product -> product.size.equals(size);
    }

    static Predicate<Product> price(float price) {
        return product -> product.getPrice() == price;
    }
}
