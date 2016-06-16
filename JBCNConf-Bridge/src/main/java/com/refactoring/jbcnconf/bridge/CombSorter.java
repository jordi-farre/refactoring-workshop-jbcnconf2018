package com.refactoring.jbcnconf.bridge;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class CombSorter<S> implements Sorter<S> {
    protected SortHandlerFactory<S> sortHandlerFactory;

    public CombSorter(SortHandlerFactory<S> sortHandlerFactory) {
        this.sortHandlerFactory = sortHandlerFactory;
    }

    // https://en.wikipedia.org/wiki/Comb_sort
    public void sort(S subject) {
        SortHandler<S> sortHandler = sortHandlerFactory.createSortHandler(subject);

        int length = sortHandler.getLength();

        if (length <= 1)
            return;

        int gap = length;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            gap = nextGap(gap);
            swapped = false;
            for (int i = 0; i + gap < length; i++) {
                if (sortHandler.compare(i, i + gap) > 0) {
                    sortHandler.swap(i, i + gap);
                    swapped = true;
                }
            }
        }
    }

    private int nextGap(int gap) {
        if (gap > 1) {
            gap = (int) (gap / 1.3);

            if (gap < 1)
                gap = 1;
        }
        return gap;
    }
}
