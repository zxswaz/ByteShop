package byteshopApplication;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class ByteshopMain extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Byteshop");
		showMain();
		showLogin();
	}
	
	private void showMain() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ByteshopMain.class.getResource("view/Main.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showLogin() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ByteshopMain.class.getResource("view/Login.fxml"));
		BorderPane loginPage = loader.load();
		mainLayout.setCenter(loginPage);
	}
	
	public static void showCreateAccountScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ByteshopMain.class.getResource("createAccount/CreateAccount.fxml"));
		BorderPane createaccountPage = loader.load();
		mainLayout.setCenter(createaccountPage);
	}
	
	public static void showInventoryScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ByteshopMain.class.getResource("inventory/Inventory.fxml"));
		BorderPane inventoryPage = loader.load();
		mainLayout.setCenter(inventoryPage);
	}
	
	public static void showCart() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ByteshopMain.class.getResource("cart/Cart.fxml"));
		BorderPane cartPage = loader.load();
		mainLayout.setCenter(cartPage);
	}
	
	public static void showAccountInfo() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ByteshopMain.class.getResource("accountInfo/AccInfo.fxml"));
		BorderPane accountPage = loader.load();
		mainLayout.setCenter(accountPage);
	}
	
	public static void showAdminInfo() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ByteshopMain.class.getResource("adminInfo/AdminInfo.fxml"));
		BorderPane adminPage = loader.load();
		mainLayout.setCenter(adminPage);
	}
	
	private static int c = 0;
	
	public static int a(int b){
		c += b;
		return c;
	}
	
	private static int cartItems[] = new int[10];
	
	public static int[] item(int[] items){
		for(int i = 0; i < 10; i++){
			cartItems[i] += items[i];
		}
		return cartItems;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
