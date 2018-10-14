/**
 * 
 */
package com.pattern.service;

import java.util.Iterator;

import com.pattern.dto.MenuComponent;

/**
 * @author ignore1992
 *
 * 2018��9��9��
 */
public class WaitressService
{
	private MenuComponent allMenus;
	
	public WaitressService(MenuComponent allMenus)
	{
		this.allMenus = allMenus;
	}
	
	public void printMenu()
	{
		allMenus.print();
	}
	
	/**
	 * �ⲿ������
	 */
	public void printMenuByIterator()
	{
		System.out.println("menu name:" + allMenus.getName());
		Iterator iterator = allMenus.createIterator();
		while(iterator.hasNext())
		{
			MenuComponent component = (MenuComponent) iterator.next();
			component.print();
		}
	}
}
