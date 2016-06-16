package com.refactoring.jbcnconf.bridge;


import com.refactoring.jbcnconf.bridge.handler.ComparableArraySortHandlerFactory;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

/**
 * Refactoring idea by Wlodek Krakowski
 */
@RunWith(JUnitParamsRunner.class)
public class StringArrayInsertionSorterTest extends AbstractStringArraySorterTest{

    @Override
    protected Sorter<String[]> getStringComparableArraySorter() {
        return new InsertionSorter<String[]>(new ComparableArraySortHandlerFactory<>());
    }
}
