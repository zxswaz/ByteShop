package byteshopApplication.view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import byteshopApplication.view.LoginModel;
import byteshopApplication.ByteshopMain;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController implements Initializable {
	
	public LoginModel loginModel = new LoginModel();
	
	private ByteshopMain main;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	private void goCreateAccount() throws IOException{
		main.showCreateAccountScene();
	}
	
	//
	@FXML
	private void goLogin() throws IOException {
		
		String admin = "admin";
		String adminPass = "admin12345";
		
		if (username.getText().equals(admin) && password.getText().equals(adminPass))
		{
			main.showAdminInfo();
		}
		else 
			
		try
		{
			if (loginModel.isLogin(username.getText(), password.getText())) 
			{
				//isConnected.setText("username and password is correct");
				main.a(0);
				main.showInventoryScene();
			}
			else
			{
				checkField("Username or password is incorrect");
			}
			
		} catch (SQLException e) {
			checkField("Username or password is incorrect");
			e.printStackTrace();
		}
	}
	//
	/*
	@FXML
	private void goLogin() throws IOException{
		String uname = username.getText();
		String pass = password.getText();
		String admin = "admin";
		String password = "password";
		String user = "tnook";
		String upass = "pass123";
		
		if (uname.isEmpty() || pass.isEmpty())
		{
			checkField("Username or password field is blank");
		}
		
		if (!uname.equals(user))
		{
			checkField("Invalid username");
		}
		
		
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
	*/
	private void checkField(String str)
	{
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Dialog");
		alert.setHeaderText("Blank Field");
		alert.setContentText(str);
		alert.showAndWait();
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
