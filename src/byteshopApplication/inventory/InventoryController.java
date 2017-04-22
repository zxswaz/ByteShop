package byteshopApplication.inventory;

import java.io.IOException;

import byteshopApplication.ByteshopMain;
import javafx.fxml.FXML;

public class InventoryController {
	private ByteshopMain main;
	private int ID;
	
	@FXML
	private void goLogout() throws IOException{
		ID = main.a(0);
		if(ID == 0){
			main.showLogin();
		}
		else{
			main.a(-1);
			main.showLogin();
		}
	}
	
	@FXML
	private void goCart() throws IOException{
		main.showCart();
	}
	
	@FXML
	private void goAccount() throws IOException{
		ID = main.a(0);
		if(ID == 0){
			main.showAdminInfo();
		}
		else{
			main.showAccountInfo();
		}
	}
}
