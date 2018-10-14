/**
 * 
 */
package com.pattern.controller;

/**
 * @author ignore1992
 *
 * 2018��9��16��
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook
{
	@Override
	void brew()
	{
		System.out.println("dripping coffee through filter");
	}
	@Override
	void addCondiments()
	{
		System.out.println("adding sugar and milk");
	}
	
	@Override
	boolean customerWantsConidments()
	{
		return true;
	}
}
