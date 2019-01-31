package com.ignore.combination.controller;


import com.ignore.combination.entity.Menu;
import com.ignore.combination.entity.MenuComponent;
import com.ignore.combination.entity.MenuItem;
import com.ignore.combination.service.WaitressService;


/**
 * @author ignore1992
 * <p>
 * 2018年9月9日
 */
public class WaitressController {
    public static void main(String[] args) {
        //定义餐厅菜单
        MenuComponent menu1 = new Menu("餐厅菜单");
        //定义餐厅菜单下的菜单项
        MenuComponent menuItem1 = new MenuItem("香蕉");
        MenuComponent menuItem2 = new MenuItem("葡萄");
        menu1.add(menuItem1);
        menu1.add(menuItem2);

        //定义食堂菜单
        MenuComponent menu2 = new Menu("食堂菜单");
        //定义食堂菜单下的菜单项
        MenuComponent menuItem3 = new MenuItem("盖饭");
        MenuComponent menuItem4 = new MenuItem("馄饨");
        menu2.add(menuItem3);
        menu2.add(menuItem4);

        //定义总菜单
        MenuComponent menu = new Menu("大菜单");
        menu.add(menu1);
        menu.add(menu2);

        WaitressService waiter = new WaitressService(menu);
//		waiter.printMenu();
        waiter.printMenuByIterator();
    }
}

