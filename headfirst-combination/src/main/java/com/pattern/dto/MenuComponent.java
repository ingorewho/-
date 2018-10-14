/**
 * 
 */
package com.pattern.dto;

import java.util.Iterator;
import java.util.List;

/**
 * @author ignore1992
 *
 * 2018Äê9ÔÂ9ÈÕ
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
