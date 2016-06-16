package com.refactoring.jbcnconf.bridge;


import com.refactoring.jbcnconf.bridge.handler.ComparableArraySortHandlerFactory;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

/**
 * Refactoring idea by Wlodek Krakowski
 */
@RunWith(JUnitParamsRunner.class)
public class StringArrayCombSorterTest extends AbstractStringArraySorterTest{
    @Override
    protected Sorter<String[]> getStringComparableArraySorter() {
        return new CombSorter<String[]>(new ComparableArraySortHandlerFactory<>());
    }
}
