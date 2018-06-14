package pl.refactoring.interpreter;

import pl.refactoring.interpreter.spec.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class will be re-vamped by introducing Interpreter Design Pattern
 */
public class ProductFinder {
    private List<Product> repository;

    public ProductFinder(List<Product> repository) {
        this.repository = repository;
    }

    public List<Product> bySpec(final Spec spec) {
        return repository.stream()
                .filter(spec::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    @Deprecated
    public List<Product> byColor(ProductColor color) {
        ColorSpec spec = new ColorSpec(color);
        return bySpec(spec);
    }

    @Deprecated
    public List<Product> byColorAndBelowPrice(ProductColor color, float price) {
        return bySpec(new AndSpec(new BelowPriceSpec(price), new ColorSpec(color)));
    }

    @Deprecated
    public List<Product> belowPriceAvoidingAColor(float price, ProductColor color) {
        return bySpec(new AndSpec(new BelowPriceSpec(price), new NotSpec(new ColorSpec(color))));
    }

    @Deprecated
    public List<Product> byColorAndAbovePrice(ProductColor color, float price) {
        return bySpec(new AndSpec(new ColorSpec(color), new AbovePriceSpec(price)));
    }

    @Deprecated
    public List<Product> byColorSizeAndBelowPrice(ProductColor color, ProductSize size, float price) {
        return bySpec(
                new AndSpec(
                    new AndSpec(
                            new ColorSpec(color), new SizeSpec(size)), new BelowPriceSpec(price)));
    }

    @Deprecated
    public List<Product> byPrice(float price) {
        return bySpec(new PriceSpec(price));
    }

}
