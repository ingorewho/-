/**
 * 
 */
package com.ignore.combination.entity;

import java.util.Iterator;
import java.util.List;

/**
 * @author ignore1992
 *
 * 2018年9月9日
 */
public abstract class MenuComponent
{
	public String getName()
	{
		throw new UnsupportedOperationException();
	}

	public List<MenuComponent> getComponents()
	{
		throw new UnsupportedOperationException();
	}

	public void print()
	{
		throw new UnsupportedOperationException();
	}

	public void add(MenuComponent component)
	{
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent component)
	{
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int index)
	{
		throw new UnsupportedOperationException();
	}

	public Iterator createIterator()
	{
		throw new UnsupportedOperationException();
	}
}
