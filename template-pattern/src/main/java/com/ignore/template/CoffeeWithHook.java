package com.ignore.template;

/**
 * @author ignore1992
 * <p>
 * 2018年9月16日
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    boolean customerWantsConidments() {
        return true;
    }
}
