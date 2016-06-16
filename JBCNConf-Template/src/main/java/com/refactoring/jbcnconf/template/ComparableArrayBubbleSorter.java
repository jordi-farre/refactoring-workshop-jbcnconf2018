package com.refactoring.jbcnconf.template;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class ComparableArrayBubbleSorter<T extends Comparable<T>> extends AbstractBubbleSorter<T[]> {

    public boolean shouldSwap(T[] array, int j) {
        return array[j].compareTo(array[j + 1]) > 0;
    }

    public int getLength(T[] array) {
        return array.length - 1;
    }

    public void swap(T[] array, int j) {
        T swap = array[j];
        array[j] = array[j + 1];
        array[j + 1] = swap;
    }
}
