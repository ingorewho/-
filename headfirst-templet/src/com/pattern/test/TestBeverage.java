/**
 * 
 */
package com.pattern.test;

import com.pattern.controller.CaffeineBeverageWithHook;
import com.pattern.controller.CoffeeWithHook;

/**
 * @author ignore1992
 *
 * 2018��9��16��
 */
public class TestBeverage
{
	public static void main(String[] args)
	{
		CaffeineBeverageWithHook coffHook = new CoffeeWithHook();
		coffHook.prepareRecipe();
	}
}
