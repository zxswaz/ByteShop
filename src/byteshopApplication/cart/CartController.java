package byteshopApplication.cart;

import java.io.IOException;

import byteshopApplication.ByteshopMain;
import javafx.fxml.FXML;

public class CartController {
		
	private ByteshopMain main;
		
	@FXML
	private void goMain() throws IOException{
		main.showInventoryScene();
	}
	
}
