package com.refactoring.jbcnconf.bridge.handler;

import com.refactoring.jbcnconf.bridge.SortHandler;
import com.refactoring.jbcnconf.bridge.SortHandlerFactory;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class ComparableArraySortHandlerFactory<T extends Comparable<T>> implements SortHandlerFactory<T[]> {
    public ComparableArraySortHandlerFactory() {
    }

    public SortHandler<T[]> createSortHandler(T[] subject) {
        return new SortHandler<T[]>() {
            @Override
            public int getLength() {
                return subject.length;
            }

            @Override
            public int compare(int i, int j) {
                return subject[i].compareTo(subject[j]);
            }

            @Override
            public void swap(int i, int j) {
                T temp = subject[i];
                subject[i] = subject[j];
                subject[j] = temp;
            }
        };
    }
}