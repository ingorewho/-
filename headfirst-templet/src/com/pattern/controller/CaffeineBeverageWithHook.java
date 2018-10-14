/**
 * 
 */
package com.pattern.controller;

/**
 * @author ignore1992
 *
 * 2018��9��16��
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
	 * ���Ǹ������㷨���ṩ��Ĭ��ʵ�֣�������Ը��������������Ҳ���Բ�����
	 * @return
	 */
	boolean customerWantsConidments()
	{
		return false;
	}
}
