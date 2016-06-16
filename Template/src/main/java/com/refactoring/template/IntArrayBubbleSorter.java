package com.refactoring.template;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class IntArrayBubbleSorter implements Sorter<int[]> {

    public void sort(int[] array) {
        // set flag to true to begin first pass
        boolean flag = true;

        while (flag) {
            //set flag to false awaiting a possible swap
            flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //swap elements
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    //shows a swap occurred
                    flag = true;
                }
            }
        }
    }

}