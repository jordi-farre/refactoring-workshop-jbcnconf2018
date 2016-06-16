package com.refactoring.tutor.bridge;


import com.refactoring.tutor.bridge.handler.DoubleArraySortHandlerFactory;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DoubleArrayInsertionSorterTest extends AbstractDoubleArraySorterTest {

    @Override
    protected Sorter<double[]> getDoubleArraySorter() {
        return new InsertionSorter<>(new DoubleArraySortHandlerFactory());
    }
}
