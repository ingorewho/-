/**
 * 
 */
package com.pattern.controller;

/**
 * @author ignore1992
 *
 * 2018Äê9ÔÂ16ÈÕ
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
