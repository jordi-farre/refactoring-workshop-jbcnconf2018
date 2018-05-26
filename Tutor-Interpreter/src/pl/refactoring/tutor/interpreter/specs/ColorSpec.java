package pl.refactoring.tutor.interpreter.specs;

import pl.refactoring.tutor.interpreter.Product;
import pl.refactoring.tutor.interpreter.Spec;

import java.awt.*;

public class ColorSpec implements Spec {
    private Color color;

    public ColorSpec(Color color) {
        this.color = color;
    }

    public Color getColorOfProductToFind() {
        return color;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getColor().equals(getColorOfProductToFind());
    }
}
