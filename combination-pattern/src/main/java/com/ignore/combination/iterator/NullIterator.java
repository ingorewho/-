package com.ignore.combination.iterator;

import java.util.Iterator;

/**
 * @author ignore1992
 * <p>
 * 2018年9月9日
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {

    }
}