/**
 * 
 */
package com.pattern.service;

import java.util.Iterator;

/**
 * @author ignore1992
 *
 * 2018��9��9��
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
