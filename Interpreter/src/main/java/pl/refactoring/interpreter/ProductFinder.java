package pl.refactoring.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.refactoring.interpreter.Specs.*;

/**
 * This class will be re-vamped by introducing Interpreter Design Pattern
 */
public class ProductFinder {
    private List<Product> repository;

    public ProductFinder(List<Product> repository) {
        this.repository = repository;
    }

    private List<Product> bySpec(final Predicate<Product> colorSpec) {
        return repository.stream()
                .filter(colorSpec::test)
                .collect(Collectors.toList());
    }

    public List<Product> byColor(ProductColor color) {
        return bySpec(color(color));
    }

    public List<Product> byColorAndBelowPrice(ProductColor color, float price) {
        return bySpec(color(color)
                .and(belowPrice(price)));
    }

    public List<Product> belowPriceAvoidingAColor(float price, ProductColor color) {
        return bySpec(belowPrice(price)
                .and(color(color).negate()));
    }


    public List<Product> byColorAndAbovePrice(ProductColor color, float price) {
        return bySpec(color(color)
                .and(abovePrice(price)));
    }

    public List<Product> byColorSizeAndBelowPrice(ProductColor color, ProductSize size, float price) {
        return bySpec(color(color)
                .and(size(size))
                .and(belowPrice(price)));
    }

    public List<Product> byPrice(float price) {
        return bySpec(price(price));
    }
}
