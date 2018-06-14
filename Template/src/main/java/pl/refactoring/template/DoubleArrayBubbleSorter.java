package pl.refactoring.template;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class DoubleArrayBubbleSorter extends AbstractBubbleSorter<double[]> {

    protected int getLength(final double[] array) {
        return array.length;
    }

    protected void swap(final double[] array, final int j) {
        double swap = array[j];
        array[j] = array[j + 1];
        array[j + 1] = swap;
    }

    protected boolean shouldSwap(final double[] array, final int j) {
        return array[j] > array[j + 1];
    }


}
