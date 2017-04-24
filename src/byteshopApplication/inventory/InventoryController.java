package byteshopApplication.inventory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import byteshopApplication.ByteshopMain;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InventoryController {
	private ByteshopMain main;
	private int ID;
	private int[] items = new int[10];
	private int count1, count2, count3, count4, count5, count6, count7, count8, count9, count10;
	
	@FXML
	private TextField search;
	
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
	private void onSearch(){
		String[] test = {"PearMac i7", "PearMac i5", "PearPods", "PearPods2", "PearPhone", 
				"PearPhoneZ", "EarPears", "AirEarPears", "PearLaptop i7", "Pear Laptop i3"};
		String input = search.getText();
		String input2 = input.toLowerCase();
		String pattern = "";
		int l = 0;
		for(int k = 0; k < input.length();k++){
			switch (input2.charAt(k)){
			case 'a': pattern += input.charAt(k); l=0; break;
			case 'b': pattern += input.charAt(k); l=0; break;
			case 'c': pattern += input.charAt(k); l=0; break;
			case 'd': pattern += input.charAt(k); l=0; break;
			case 'e': pattern += input.charAt(k); l=0; break;
			case 'f': pattern += input.charAt(k); l=0; break;
			case 'g': pattern += input.charAt(k); l=0; break;
			case 'h': pattern += input.charAt(k); l=0; break;
			case 'i': pattern += input.charAt(k); l=0; break;
			case 'j': pattern += input.charAt(k); l=0; break;
			case 'k': pattern += input.charAt(k); l=0; break;
			case 'l': pattern += input.charAt(k); l=0; break;
			case 'm': pattern += input.charAt(k); l=0; break;
			case 'n': pattern += input.charAt(k); l=0; break;
			case 'o': pattern += input.charAt(k); l=0; break;
			case 'p': pattern += input.charAt(k); l=0; break;
			case 'q': pattern += input.charAt(k); l=0; break;
			case 'r': pattern += input.charAt(k); l=0; break;
			case 's': pattern += input.charAt(k); l=0; break;
			case 't': pattern += input.charAt(k); l=0; break;
			case 'u': pattern += input.charAt(k); l=0; break;
			case 'v': pattern += input.charAt(k); l=0; break;
			case 'w': pattern += input.charAt(k); l=0; break;
			case 'x': pattern += input.charAt(k); l=0; break;
			case 'y': pattern += input.charAt(k); l=0; break;
			case 'z': pattern += input.charAt(k); l=0; break;
			case ' ': {
					if(l == 0){
						pattern += '|'; 
						l++; 
					}
					break;
				}
			default: break;
			}
		}
		int i = 0;
		int j = 0;
		ArrayList<String> duplicate = new ArrayList<String>();
		if(input != null){
			while(i < test.length){
				Pattern pat = Pattern.compile(pattern);
				Matcher mat = pat.matcher(test[i].toLowerCase());
				while(mat.find()){
					duplicate.add(test[i]);
					j++;
				}
				i++;
			}
		}
		else{
			//System.out.println("Nothing was input, try again.");
		}
		if(j != 0){
			//System.out.println(duplicate.get(0));
			for(int m = 0;m < duplicate.size() - 1; m++){
				if(duplicate.get(m)!=duplicate.get(m+1)){
				//	System.out.println(duplicate.get(m+1));
				}
			}
		}
		else{
			//System.out.println("No results found.");
		}
	}
	
	@FXML
	private void onAdd1(){
		count1++;
	}
	
	@FXML
	private void onAdd2(){
		count2++;
	}
	
	@FXML
	private void onAdd3(){
		count3++;
	}
	
	@FXML
	private void onAdd4(){
		count4++;
	}
	
	@FXML
	private void onAdd5(){
		count5++;
	}
	
	@FXML
	private void onAdd6(){
		count6++;
	}
	
	@FXML
	private void onAdd7(){
		count7++;
	}
	
	@FXML
	private void onAdd8(){
		count8++;
	}
	
	@FXML
	private void onAdd9(){
		count9++;
	}
	
	@FXML
	private void onAdd10(){
		count10++;
	}
	
	@FXML
	private void goCart() throws IOException{
		items[0] = count1;
		items[1] = count2;
		items[2] = count3;
		items[3] = count4;
		items[4] = count5;
		items[5] = count6;
		items[6] = count7;
		items[7] = count8;
		items[8] = count9;
		items[9] = count10;
		main.item(items);
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
