package com.refactoring.jbcnconf.bridge;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public interface SortHandler<S> {
    int getLength();
    int compare(int i, int j);
    void swap(int i, int j);
}
