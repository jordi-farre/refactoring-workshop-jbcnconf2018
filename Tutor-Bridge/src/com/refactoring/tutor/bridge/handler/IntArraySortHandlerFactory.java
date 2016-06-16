package com.refactoring.tutor.bridge.handler;

import com.refactoring.tutor.bridge.SortHandler;
import com.refactoring.tutor.bridge.SortHandlerFactory;

public class IntArraySortHandlerFactory implements SortHandlerFactory<int[]> {
   @Override
   public SortHandler<int[]> createSortHandler(int[] subject) {
      return new IntArraySortHandler(subject);
   }
}
