package pl.refactoring.template;

import java.util.List;

/**
 * Refactoring idea by Wlodek Krakowski
 */
public class ComparableListBubbleSorter<T extends Comparable<T>> extends AbstractBubbleSorter<List<T>> {

    protected void swap(final List<T> subject, final int j) {
        T swap = subject.get(j);
        subject.set(j, subject.get(j + 1));
        subject.set(j + 1, swap);
    }

    protected boolean shouldSwap(final List<T> subject, final int j) {
        return subject.get(j).compareTo(subject.get(j + 1)) > 0;
    }

    protected int getLength(final List<T> subject) {
        return subject.size();
    }
}
