package com.refactoring.tutor.bridge.handler;

import com.refactoring.tutor.bridge.SortHandler;
import com.refactoring.tutor.bridge.SortHandlerFactory;

public class DoubleArraySortHandlerFactory implements SortHandlerFactory<double[]> {
   @Override
   public SortHandler<double[]> createSortHandler(double[] subject) {
      return new DoubleArraySortHandler(subject);
   }
}
