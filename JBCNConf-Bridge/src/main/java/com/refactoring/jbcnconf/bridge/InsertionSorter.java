package com.refactoring.jbcnconf.bridge;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class InsertionSorter<S> implements Sorter<S> {
    private SortHandlerFactory<S> sortHandlerFactory;

    public InsertionSorter(SortHandlerFactory<S> sortHandlerFactory) {
        this.sortHandlerFactory = sortHandlerFactory;
    }

    public void sort(S subject) {
        SortHandler<S> sortHandler = sortHandlerFactory.createSortHandler(subject);

        int length = sortHandler.getLength();

        if (length <= 1)
            return;

        for (int j = 1; j < length; j++) {
            for (int i = j; i > 0; i--) {
                if (sortHandler.compare(i - 1, i) <= 0) {
                    break;
                }

                sortHandler.swap(i - 1, i);
            }
        }
    }
}
