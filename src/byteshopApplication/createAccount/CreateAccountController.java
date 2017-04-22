package byteshopApplication.createAccount;

import java.io.IOException;

import byteshopApplication.ByteshopMain;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class CreateAccountController {
	
	private ByteshopMain main;
	
	@FXML
	private TextField firstName;
	
	@FXML
	private TextField lastName;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField email;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField passwordCheck;
	
	@FXML
	private TextField streetAddress;
	
	@FXML
	private TextField city;
	
	@FXML
	private TextField zipCode;

	ObservableList<String> stateList = FXCollections.observableArrayList("AL","AK",
			"AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS",
			"KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ",
			"NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT",
			"VT","VA","WA","WV","WI","WY");
	
	@FXML
    private ChoiceBox states;
	
	@FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	states.setItems(stateList);
    }
	
	@FXML
	private void goCreated() throws IOException{
		String state = states.getValue().toString();
		String fname = firstName.getText();
		String lname = lastName.getText();
		String uname = username.getText();
		String emailText = email.getText();
		String pass = password.getText();
		String passCheck = passwordCheck.getText();
		String sAddress = streetAddress.getText();
		String cityText = city.getText();
		String zcode = zipCode.getText();
		if(fname.isEmpty() == false && lname.isEmpty() == false && uname.isEmpty() == false && 
				emailText.isEmpty() == false && pass.isEmpty() == false && passCheck.isEmpty()
				== false && sAddress.isEmpty() == false && cityText.isEmpty() == false && 
				zcode.isEmpty()== false && state.isEmpty() == false){
			if(pass.equals(passCheck)){
				main.a(1);
				main.showInventoryScene();
			}
		}
	}
}
