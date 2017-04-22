package byteshopApplication.accountInfo;

import java.io.IOException;

import byteshopApplication.ByteshopMain;
import javafx.fxml.FXML;

public class AccountInfoController {
	
	private ByteshopMain main;
	
	@FXML
	private void goMain() throws IOException{
		main.showInventoryScene();
	}
}
