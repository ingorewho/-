/**
 * 
 */
package com.pattern.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pattern.service.ComposieIterator;

/**
 * @author ignore1992
 *
 * 2018年9月9日
 */
public class Menu extends MenuComponent
{
	private List<MenuComponent> components = new ArrayList<>();
	private String name;
	
	public Menu(String name)
	{
		this.name = name;
	}
	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void print()
	{
		System.out.println("menu name:" + name);
		//使用递归打印该菜单包含的组合
//		Iterator iterator = components.iterator();
//		while(iterator.hasNext())
//		{
//			MenuComponent component = (MenuComponent) iterator.next();
//			component.print();
//		}
	}

	@Override
	public void add(MenuComponent component)
	{
		components.add(component);
	}

	@Override
	public void remove(MenuComponent component)
	{
		components.remove(component);
	}

	@Override
	public MenuComponent getChild(int index)
	{
		return components.get(index);
	}
	
	@Override
	public Iterator createIterator()
	{
		return new ComposieIterator(components.iterator());
	}
	
	@Override
	public List<MenuComponent> getComponents()
	{
		return components;
	}
}
