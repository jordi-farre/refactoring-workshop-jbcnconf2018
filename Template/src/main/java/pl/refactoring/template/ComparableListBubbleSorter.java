package pl.refactoring.template;

import java.util.List;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class ComparableListBubbleSorter<T extends Comparable<T>> implements Sorter<List<T>> {

    public void sort(List<T> subject) {
        // set flag to true to begin first pass
        boolean flag = true;

        while (flag) {
            //set flag to false awaiting a possible swap
            flag = false;
            for (int j = 0; j < subject.size() - 1; j++) {
                if (subject.get(j).compareTo(subject.get(j + 1)) > 0) {
                    //swap elements
                    T swap = subject.get(j);
                    subject.set(j, subject.get(j + 1));
                    subject.set(j + 1, swap);
                    //shows a swap occurred
                    flag = true;
                }
            }
        }
    }
}
