/**
 * 
 */
package com.pattern.controller;



import com.pattern.dto.Menu;
import com.pattern.dto.MenuComponent;
import com.pattern.dto.MenuItem;
import com.pattern.service.WaitressService;

/**
 * @author ignore1992
 *
 * 2018��9��9��
 */
public class WaitressController
{
	public static void main(String[] args)
	{
		//��������˵�
		MenuComponent menu1 = new Menu("�����˵�");
		//��������˵��µĲ˵���
		MenuComponent menuItem1 = new MenuItem("�㽶");
		MenuComponent menuItem2 = new MenuItem("����");
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		
		//����ʳ�ò˵�
		MenuComponent menu2 = new Menu("ʳ�ò˵�");
		//����ʳ�ò˵��µĲ˵���
		MenuComponent menuItem3 = new MenuItem("�Ƿ�");
		MenuComponent menuItem4 = new MenuItem("���");
		menu2.add(menuItem3);
		menu2.add(menuItem4);
		
		//�����ܲ˵�
		MenuComponent menu = new Menu("��˵�");
		menu.add(menu1);
		menu.add(menu2);
		
		WaitressService waiter = new WaitressService(menu);
//		waiter.printMenu();
		waiter.printMenuByIterator();
	}
}
