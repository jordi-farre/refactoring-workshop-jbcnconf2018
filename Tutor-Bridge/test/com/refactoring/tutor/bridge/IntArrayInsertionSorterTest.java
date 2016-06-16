package com.refactoring.tutor.bridge;


import com.refactoring.tutor.bridge.handler.IntArraySortHandlerFactory;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class IntArrayInsertionSorterTest extends AbstractIntArraySorterTest {

    @Override
    protected Sorter<int[]> getIntArraySorter() {
        return new InsertionSorter<>(new IntArraySortHandlerFactory());
    }
}
