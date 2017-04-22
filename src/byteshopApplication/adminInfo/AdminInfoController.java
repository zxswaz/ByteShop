package byteshopApplication.adminInfo;

import java.io.IOException;

import byteshopApplication.ByteshopMain;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AdminInfoController {

	private ByteshopMain main;
	
	@FXML
	private TextField PC1add;
	
	@FXML
	private TextField PC1rm;
        
        @FXML
	private TextField PC1Total;
	
	@FXML
	private TextField PC2add;
	
	@FXML
	private TextField PC2rm;
        
        @FXML
	private TextField PC2Total;
	
	@FXML
	private TextField laptop1add;
	
	@FXML
	private TextField laptop1rm;
        
        @FXML
	private TextField laptop1Total;
	
	@FXML
	private TextField laptop2add;
	
	@FXML
	private TextField laptop2rm;
        
        @FXML
	private TextField laptop2Totals;
	
	@FXML
	private TextField pod1add;
	
	@FXML
	private TextField pod1rm;
        
        @FXML
	private TextField pod1Total;
	
	@FXML
	private TextField pod2rm;
        
        @FXML
	private TextField pod2add;
        
        @FXML
	private TextField pod2Total;
	
	@FXML
	private TextField headphone1rm;
        
        @FXML
	private TextField headphone1add;

        @FXML
	private TextField headphone1Total;
        
	@FXML
	private TextField headphone2rm;
        
        @FXML
	private TextField headphone2add;
        
        @FXML
	private TextField headphone2Total;
	
	@FXML
	private TextField phone1rm;
        
        @FXML
	private TextField phone1add;
        
        @FXML
	private TextField phone1Total;
	
	@FXML
	private TextField phone2rm;
        
        @FXML
	private TextField phone2add;
        
        @FXML
	private TextField phone2rmTotal;
	
	@FXML
	private void goMain() throws IOException{
		main.showInventoryScene();
	}
}
