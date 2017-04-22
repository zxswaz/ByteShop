package byteshopApplication.view;

import java.io.IOException;

import byteshopApplication.ByteshopMain;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
	
	private ByteshopMain main;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	private void goCreateAccount() throws IOException{
		main.showCreateAccountScene();
	}
	
	@FXML
	private void goLogin() throws IOException{
		String uname = username.getText();
		String pass = password.getText();
		String admin = "admin";
		String password = "password";
		String user = "tnook";
		String upass = "pass123";
		if(pass.isEmpty()==false && uname.isEmpty()==false){
			if(uname.equals(admin) && pass.equals(password)){
				main.a(0);
				main.showInventoryScene();
			}
			else if(uname.equals(user) && pass.equals(upass)){
				main.a(1);
				main.showInventoryScene();
			}
		}
	}
}
