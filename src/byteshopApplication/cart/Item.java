package byteshopApplication.cart;

import javafx.beans.property.SimpleStringProperty;

public class Item {
	private final SimpleStringProperty itemName;
	private final SimpleStringProperty itemCost;
	private final SimpleStringProperty itemQuantity;
	
	public Item(String iName, int cost, int quantity){
		String iCost = Integer.toString(cost);
		String iQuantity = Integer.toString(quantity);
		this.itemName = new SimpleStringProperty(iName);
		this.itemCost = new SimpleStringProperty(iCost);
		this.itemQuantity = new SimpleStringProperty(iQuantity);
	}
	
	public String getItemName(){
		return itemName.get();
	}
	
	public void setItemName(String iName){
		itemName.set(iName);
	}
	
	public String getItemCost(){
		return itemCost.get();
	}
	
	public void setItemCost(String iCost){
		itemCost.set(iCost);
	}
	
	public String getItemQuantity(){
		return itemQuantity.get();
	}
	
	public void setItemQuantity(String iQuantity){
		itemQuantity.set(iQuantity);
	}
}
