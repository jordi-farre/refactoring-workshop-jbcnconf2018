package com.refactoring.jbcnconf.template;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class DoubleArrayBubbleSorter extends AbstractBubbleSorter<double[]> {

    protected int getLength(double[] array) {
        return array.length - 1;
    }

    protected void swap(double[] array, int j) {
        double swap = array[j];
        array[j] = array[j + 1];
        array[j + 1] = swap;
    }

    protected boolean shouldSwap(double[] array, int j) {
        return array[j] > array[j + 1];
    }


}
