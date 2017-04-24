package byteshopApplication.createAccount;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import byteshopApplication.ByteshopMain;
import byteshopApplication.view.LoginModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class CreateAccountController {
	
	public LoginModel loginModel = new LoginModel();
	
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
		
		
		// Added start
		if (fname.isEmpty())
		{
			checkField("Please enter your first name");
		}
		
		if (lname.isEmpty())
		{
			checkField("Please enter your last name");
		}
		
		if (uname.isEmpty())
		{
			checkField("Please enter your username");
		}
		
		if (emailText.isEmpty())
		{
			checkField("Please enter your a your email address");
		}
		
		if (!emailText.isEmpty())
		{
			if (validateEmail(emailText) == false)
			{
				checkField("Please enter a valid email address");
			}
		}
		
		if (pass.isEmpty())
		{
			checkField("Please create your user password");
		}
		
		if (passCheck.isEmpty())
		{
			checkField("Please re-enter your user password");
		}
		
		if (!pass.isEmpty() && !passCheck.isEmpty())
		{
			if (!passCheck.equals(pass))
			{
				checkField("Passwords do not match");
			}
			
			if (pass.length() < 8)
			{
				checkField("Password must be at least 8 characters");
			}
		}
		
		if (sAddress.isEmpty())
		{
			checkField("Please enter your street address");
		}
		
		if (cityText.isEmpty())
		{
			checkField("Please enter your city");
		}
		
		if (zcode.isEmpty())
		{
			checkField("Please enter your zip code");
		}
		
		if (!zcode.isEmpty())
		{
			if (checkZipCode(zcode) == false)
			{
				checkField("Please enter a 5 digit numeric zip code");
			}
		}
		
		loginModel.insertCustomer(fname, lname, uname, emailText, pass, sAddress, cityText, state, zcode);
		
		// Added end	
		if (fname.isEmpty() == false && lname.isEmpty() == false && uname.isEmpty() == false && 
				emailText.isEmpty() == false && pass.isEmpty() == false && passCheck.isEmpty()
				== false && sAddress.isEmpty() == false && cityText.isEmpty() == false && 
				zcode.isEmpty()== false && state.isEmpty() == false){
			if(pass.equals(passCheck)){
				main.a(1);
				main.showInventoryScene();
			}
		}
		
		/*if
		(fname.isEmpty() == false && lname.isEmpty() == false && uname.isEmpty() == false && 
				emailText.isEmpty() == false && pass.isEmpty() == false && passCheck.isEmpty()
				== false && sAddress.isEmpty() == false && cityText.isEmpty() == false && 
				zcode.isEmpty()== false && state.isEmpty() == false){
			if(pass.equals(passCheck)){
				main.a(1);
				main.showInventoryScene();
			}
		}*/
	}
	// Helper method to check the text fields that need input //private
	private void checkField(String str)
	{
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Dialog");
		alert.setHeaderText("Blank Field");
		alert.setContentText(str);
		alert.showAndWait();
		
	}
	
	// This method will check the validity of an email address that is entered
		public static boolean validateEmail(String email)
		{
			boolean status = false;
			String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			Pattern pattern = Pattern.compile(emailPattern);
			Matcher matcher = pattern.matcher(email);
			
			if (matcher.matches())
			{
				status = true;	
			}
			else 
			{
				status = false;
				
			}
			return status;
		}
		
		// This method will check the validity of the zip code
		public static boolean checkZipCode(String zip)
		{
			boolean status = false;
			
			if (zip.length() != 5 || !zip.matches("[0-9]+"))
			{
				status = false;
			}
			else 
			{
				status = true;
			}
			return status;
			
		}
		// Sets zip code and checks length and if digits
		/*public void checkZipCode(String zip)	
		{
			if (zip.length() != 5)
			{
				checkField("Please enter a five digit zip code");
			}
			if (!zip.matches("[0-9]+"))
			{
				System.out.println("Please enter a numeric zip code");
			}
			else 
				userZipCode = zip;
		}*/
}
