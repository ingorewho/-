/**
 * 
 */
package com.pattern.service;

import java.util.Iterator;
import java.util.Stack;

import com.pattern.dto.Menu;
import com.pattern.dto.MenuComponent;

/**
 * @author ignore1992
 *
 * 2018Äê9ÔÂ9ÈÕ
 */
public class ComposieIterator implements Iterator
{
	private Stack<Iterator> stack = new Stack();
	
	public ComposieIterator(Iterator iterator)
	{
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext()
	{
		if(stack.isEmpty())
		{
			return false;
		}
		else
		{
			Iterator iterator = stack.peek();
			if(!iterator.hasNext())
			{
				stack.pop();
				return this.hasNext();
			}
			else
			{
				return true;
			}
		}
	}
	
	@Override
	public Object next()
	{
		if(this.hasNext())
		{
			Iterator iterator = stack.peek();
			MenuComponent component = (MenuComponent)iterator.next();
			if(component instanceof Menu)
			{
				stack.push(component.getComponents().iterator());
			}
			
			return component;
		}
		else
		{
			return null;
		}
	}
}
