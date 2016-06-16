package com.refactoring.jbcnconf.bridge.handler;

import com.refactoring.jbcnconf.bridge.SortHandler;
import com.refactoring.jbcnconf.bridge.SortHandlerFactory;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class IntArraySortHandlerFactory implements SortHandlerFactory<int[]> {
    public IntArraySortHandlerFactory() {
    }

    @Override
    public SortHandler<int[]> createSortHandler(int[] subject) {
        return new SortHandler<int[]>() {
            @Override
            public int getLength() {
                return subject.length;
            }

            @Override
            public int compare(int i, int j) {
                return subject[i] == subject[j] ? 0 : subject[i] < subject[j] ? -1 : 1;
            }

            @Override
            public void swap(int i, int j) {
                int temp = subject[i];
                subject[i] = subject[j];
                subject[j] = temp;
            }
        };
    }
}