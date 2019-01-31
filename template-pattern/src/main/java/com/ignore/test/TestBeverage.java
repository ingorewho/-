/**
 *
 */
package com.ignore.test;

import com.ignore.template.CaffeineBeverageWithHook;
import com.ignore.template.CoffeeWithHook;

/**
 * @author ignore1992
 * 2018年9月16日
 */
public class TestBeverage {
    public static void main(String[] args) {
        CaffeineBeverageWithHook coffHook = new CoffeeWithHook();
        coffHook.prepareRecipe();
    }
}

