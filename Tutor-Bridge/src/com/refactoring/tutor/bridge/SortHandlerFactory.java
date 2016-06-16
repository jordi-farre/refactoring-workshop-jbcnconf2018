package com.refactoring.tutor.bridge;


public interface SortHandlerFactory<S> {
   public SortHandler<S> createSortHandler(S subject);
}
