package org;

import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> MenuList= new ArrayList<MenuItem>();
	
	public void addItem(String itemName, Double price, String mainIngredient){
		MenuList.add(new MenuItem(itemName, price, mainIngredient));
	}
	
	
	


}
