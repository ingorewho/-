/**
 *
 */
package com.ignore.combination.entity;

import com.ignore.combination.iterator.NullIterator;

import java.util.Iterator;

/**
 * @author ignore1992
 * <p>
 * 2018年9月9日
 */
public class MenuItem extends MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("menuitem name:" + name);
    }


    @Override
    public MenuComponent getChild(int index) {
        //页节点没有孩子节点
        return null;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
