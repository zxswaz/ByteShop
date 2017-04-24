package byteshopApplication.cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import byteshopApplication.ByteshopMain;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class CartController {
		
	private ByteshopMain main;
	private int Cart[] = new int[10];
	private int getCart[] = new int[10];
	private int clearCart[] = new int[10];
	private TableView<Item> table = new TableView<Item>();
	
		
	@FXML
	private void goMain() throws IOException{
		main.showInventoryScene();
	}
	
	private void loadCart(){
		Cart = main.item(getCart);
		for(int i = 0; i < 10; i++){
			clearCart[i] -= Cart[i];
		}
		main.item(clearCart);
		for(int j = 0; j < 10; j++){
			clearCart[j] = 0;
		}
		//table = new TableView();
		//data = getInitialTableData();
		//table.setItems(data);
		
		//Cartitem item = table.getSelectedItem();
	}
	
	private final ObservableList<Item> data = FXCollections.observableArrayList(
			new Item("PearMac i7", (700 * Cart[0]), Cart[0]),
			new Item("PearMac i5", (500 * Cart[1]), Cart[1]),
			new Item("PearPods", (50 * Cart[2]), Cart[2]),
			new Item("PearPods 2", (100 * Cart[3]), Cart[3]),
			new Item("PearPhone", (300 * Cart[4]), Cart[4]),
			new Item("PearPhoneZ", (400 * Cart[5]), Cart[5]),
			new Item("EarPears", (30 * Cart[6]), Cart[6]),
			new Item("AirEarPears", (70 * Cart[7]), Cart[7]),
			new Item("PearLaptop i7", (800 * Cart[8]), Cart[8]),
			new Item("PearLaptop i3", (400 * Cart[9]), Cart[9])
		);
	
	/*private ObservableList getInitialTableData(){
		List list = new ArrayList();
		list.add(new Item("PearMac i7", 700, 1));
		
		ObservableList data = FXCollections.observableList(list);
		return data;
	}*/
	
	//final ObservableList<String> cartTable = FXCollections.observableArrayList(
		//	new Table("PearMac i7", (700 * Cart[0]), Cart[0]),
			
			//);
}
