package byteshopApplication.view;

import java.sql.Connection;
import java.sql.DriverManager;

//can also do jdbc:sqlite:Byteshop.sqlite and take the file and drag into the LoginApp folder
//or /Users/derekmalikian/Desktop/Database/Byteshop.sqlite

public class SqliteConnection {
	
	public static Connection Connector() {
		try {
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/derekmalikian/Desktop/Byteshop.sqlite");
				return conn;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
			
		}
	}

}
