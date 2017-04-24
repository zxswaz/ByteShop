package byteshopApplication.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import byteshopApplication.view.SqliteConnection;

public class LoginModel {
	
	Connection connection;
	
	public LoginModel() {
		
		connection = SqliteConnection.Connector();
		
		if (connection == null)
		{
			System.out.println("Connection not successful");
			System.exit(1);
		}
	}
	
	public boolean isDbConnected() {
		
		try {
				return !connection.isClosed(); // if closed will give true value
				
		} catch (SQLException e) {
			//  catch block
			e.printStackTrace();
			return false;
		}  
	}
	
	public boolean isLogin(String user, String pass) throws SQLException
	{
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from Customer where username = ? and password = ?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user); //username is 1
			preparedStatement.setString(2, pass); //password is 2
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next())
			{
				return true; // finding out if it will return a result
			}
			else
			{
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
		finally {
			
			preparedStatement.close();
			resultSet.close();
		}
		
	}
	
	public void insertCustomer(String firstname, String lastname, String username, String email, String password, String streetAddress, String city, String state, String zip)
	{
		String query = "INSERT INTO Customer(firstName, lastName, userName, email, password, streetAddress, city, state, zipCode) VALUES(?,?,?,?,?,?,?,?,?)";
		
		try (Connection conn = this.connection;
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3,  username);
			pstmt.setString(4,  email);
			pstmt.setString(5,  password);
			pstmt.setString(6,  streetAddress);
			pstmt.setString(7,  city);
			pstmt.setString(8,  state);
			pstmt.setString(9,  zip);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
			
		
	}

}