package pl.refactoring.template;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class ComparableArrayBubbleSorter<T extends Comparable<T>> extends AbstractBubbleSorter<T[]> {


    protected void swap(final T[] array, final int j) {
        T swap = array[j];
        array[j] = array[j + 1];
        array[j + 1] = swap;
    }

    protected boolean shouldSwap(final T[] array, final int j) {
        return array[j].compareTo(array[j + 1]) > 0;
    }

    protected int getLength(final T[] array) {
        return array.length;
    }
}
