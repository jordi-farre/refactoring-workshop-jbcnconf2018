package com.refactoring.jbcnconf.bridge;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class SelectionSorter<S> implements Sorter<S> {
    private final SortHandlerFactory<S> sortHandlerFactory;

    protected SelectionSorter(SortHandlerFactory<S> sortHandlerFactory) {
        this.sortHandlerFactory = sortHandlerFactory;
    }

    @Override
    public void sort(S subject) {
        SortHandler<S> sortHandler = createSortHandler(subject);

        int length = sortHandler.getLength();
        if (length <= 1)
            return;

        for (int i = 0; i < length; i++) {
            // Find the minimum item from the remaining items
            int indexOfMin = i;

            for (int j = i + 1; j < length; j++) {
                if (sortHandler.compare(indexOfMin, j) > 0) {
                    indexOfMin = j;
                }
            }

            // Swap this minimum item with the first in the range
            if (indexOfMin != i) {
                sortHandler.swap(i, indexOfMin);
            }
        }
    }

    protected SortHandler<S> createSortHandler(S subject) {
        return sortHandlerFactory.createSortHandler(subject);
    }
}
