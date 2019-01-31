/**
 *
 */
package com.ignore.combination.service;

import com.ignore.combination.entity.MenuComponent;

import java.util.Iterator;

/**
 * @author ignore1992
 * <p>
 * 2018年9月9日
 */
public class WaitressService {
    private MenuComponent allMenus;

    public WaitressService(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    /**
     * 外部迭代器
     */
    public void printMenuByIterator() {
        System.out.println("menu name:" + allMenus.getName());
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            component.print();
        }
    }
}
