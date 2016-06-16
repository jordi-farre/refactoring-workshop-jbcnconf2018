package com.refactoring.tutor.bridge.handler;

import com.refactoring.tutor.bridge.SortHandler;

public abstract class AbstractSortHandler<S> implements SortHandler<S> {
   protected S subject;

   AbstractSortHandler(S subject)
   {
      this.subject = subject;
   }

}
