package pl.refactoring.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class will be re-vamped by introducing Interpreter Design Pattern
 */
public class ProductFinder {
    private List<Product> repository;

    public ProductFinder(List<Product> repository) {
        this.repository = repository;
    }

    public List<Product> byColorAndBelowPrice(ProductColor color, float price) {
        List<Product> foundProducts = new ArrayList<>();
        Iterator<Product> products = repository.iterator();
        while (products.hasNext()) {
            Product product = products.next();
            if (product.getPrice() < price && product.getColor().equals(color))
                foundProducts.add(product);
        }
        return foundProducts;
    }

    public List<Product> belowPriceAvoidingAColor(float price, ProductColor color) {
        List<Product> foundProducts = new ArrayList<Product>();
        Iterator<Product> products = repository.iterator();
        while (products.hasNext()) {
            Product product = products.next();
            if (product.getPrice() < price && product.getColor() != color)
                foundProducts.add(product);
        }
        return foundProducts;
    }


    public List<Product> byColor(ProductColor color) {

        List<Product> foundProducts = new ArrayList<>();
        Iterator<Product> products = repository.iterator();
        while (products.hasNext()) {
            Product product = products.next();
            if (product.getColor().equals(color))
                foundProducts.add(product);
        }
        return foundProducts;
    }

    public List<Product> byColorAndAbovePrice(ProductColor color, float price) {
        List<Product> foundProducts = new ArrayList<>();
        Iterator<Product> products = repository.iterator();
        while (products.hasNext()) {
            Product product = products.next();
            if (product.getPrice() > price && product.getColor().equals(color))
                foundProducts.add(product);
        }
        return foundProducts;
    }

    public List<Product> byColorSizeAndBelowPrice(ProductColor color, ProductSize size, float price) {
        List<Product> foundProducts = new ArrayList<>();
        Iterator<Product> products = repository.iterator();
        while (products.hasNext()) {
            Product product = products.next();
            if (product.getPrice() < price &&
                    product.size.equals(size) &&
                    product.getColor().equals(color))
                foundProducts.add(product);
        }
        return foundProducts;
    }

    public List<Product> byPrice(float price) {
        List<Product> foundProducts = new ArrayList<>();
        Iterator<Product> products = repository.iterator();
        while (products.hasNext()) {
            Product product = products.next();
            if (product.getPrice() == price) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }
}
