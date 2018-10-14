/**
 * 
 */
package com.pattern.dto;

import java.util.Iterator;

import com.pattern.service.NullIterator;

/**
 * @author ignore1992
 *
 * 2018��9��9��
 */
public class MenuItem extends MenuComponent
{
	private String name;
	
	public MenuItem(String name)
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
		System.out.println("menuitem name:" + name);
	}


	@Override
	public MenuComponent getChild(int index)
	{
		//ҳ�ڵ�û�к��ӽڵ�
		return null;
	}
	
	@Override
	public Iterator createIterator()
	{
		return new NullIterator();
	}
}
