package com.refactoring.jbcnconf.template;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public abstract class AbstractBubbleSorter<T> implements Sorter<T>{
    public final void sort(T array) {
        // set flag to true to begin first pass
        boolean swapHappened = true;

        while (swapHappened) {
            //set flag to false awaiting a possible swap
            swapHappened = false;
            for (int j = 0; j < getLength(array); j++) {
                if (shouldSwap(array, j)) {
                    //swap elements
                    swap(array, j);
                    //shows a swap occurred
                    swapHappened = true;
                }
            }
        }
    }

    protected abstract void swap(T array, int j);

    protected abstract boolean shouldSwap(T array, int j);

    protected abstract int getLength(T array);
}
