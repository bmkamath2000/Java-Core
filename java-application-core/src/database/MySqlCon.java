package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlCon {
	Connection conn;
	void initConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/website","root","");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void closeConnection()
	{
		try {
		conn.close();
		}
		catch(Exception e)
		{
			
		}
	}
	void signup()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
