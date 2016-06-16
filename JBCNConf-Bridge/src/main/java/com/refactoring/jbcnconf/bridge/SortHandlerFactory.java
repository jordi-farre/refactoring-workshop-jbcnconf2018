package com.refactoring.jbcnconf.bridge;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public interface SortHandlerFactory<S> {
    SortHandler<S> createSortHandler(S subject);
}
