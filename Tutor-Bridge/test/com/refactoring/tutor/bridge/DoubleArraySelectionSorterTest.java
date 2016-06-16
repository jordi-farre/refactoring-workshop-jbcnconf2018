package com.refactoring.tutor.bridge;


import com.refactoring.tutor.bridge.handler.DoubleArraySortHandlerFactory;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DoubleArraySelectionSorterTest extends AbstractDoubleArraySorterTest{

    @Override
    protected Sorter<double[]> getDoubleArraySorter() {
        return new SelectionSorter<>(new DoubleArraySortHandlerFactory());
    }
}
