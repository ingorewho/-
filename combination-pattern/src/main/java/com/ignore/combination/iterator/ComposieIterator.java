package com.ignore.combination.iterator;

import com.ignore.combination.entity.Menu;
import com.ignore.combination.entity.MenuComponent;

import java.util.Iterator;
import java.util.Stack;


/**
 * @author ignore1992
 * <p>
 * 2018年9月9日
 */
public class ComposieIterator implements Iterator {
    private Stack<Iterator> stack = new Stack();

    public ComposieIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        else {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return this.hasNext();
            }
            else {
                return true;
            }
        }
    }

    public Object next() {
        if (this.hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.getComponents().iterator());
            }

            return component;
        }
        else {
            return null;
        }
    }

    public void remove() {

    }
}
