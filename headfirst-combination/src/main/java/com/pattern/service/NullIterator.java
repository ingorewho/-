/**
 * 
 */
package com.pattern.service;

import java.util.Iterator;

/**
 * @author ignore1992
 *
 * 2018Äê9ÔÂ9ÈÕ
 */
public class NullIterator implements Iterator
{
	@Override
	public boolean hasNext()
	{
		return false;
	}
	
	@Override
	public Object next()
	{
		return null;
	}
}
