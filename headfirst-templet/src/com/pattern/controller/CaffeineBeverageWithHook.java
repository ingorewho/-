/**
 * 
 */
package com.pattern.controller;

/**
 * @author ignore1992
 *
 * 2018年9月16日
 */
public abstract class CaffeineBeverageWithHook
{
	public final void prepareRecipe()
	{
		boilWater();
		brew();
		pourInCup();
		if(customerWantsConidments())
		{
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater()
	{
		System.out.println("boiling water");
	}
	
	void pourInCup()
	{
		System.out.println("pouring into cup");
	}
	
	/**
	 * 这是个钩子算法，提供了默认实现，子类可以覆盖这个方法，但也可以不覆盖
	 * @return
	 */
	boolean customerWantsConidments()
	{
		return false;
	}
}
