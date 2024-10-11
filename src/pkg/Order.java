package pkg;

import java.util.ArrayList;

public class Order {
	
	private static int orderNo = 0;
	private ArrayList<Item> order = new ArrayList<Item>();
	
	public Order() {};
	
	//get item from the order
	public Item getItem(int i) {
		return order.get(i);
	}
	
	// add item to order
	public void addItem(Item item) {
		order.add(item);
	}
	//remove an item from order
	public void removeItem(Item item) {
		order.remove(item);
	}
	//get order number
	public int getOrderNo() {
		return orderNo; 
	}
	public void incrementNo() {
		orderNo++; 
	}
}
