package com.refactoring.jbcnconf.bridge;

import com.refactoring.jbcnconf.bridge.handler.DoubleArraySortHandlerFactory;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

/**
 * Refactoring idea by Wlodek Krakowski
 */
@RunWith(JUnitParamsRunner.class)
public class DoubleArrayCombSorterTest extends AbstractDoubleArraySorterTest{

    @Override
    protected Sorter<double[]> getDoubleArraySorter() {
        return new CombSorter<double[]>(new DoubleArraySortHandlerFactory());
    }
}
