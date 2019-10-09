package com.dxc.pms.dbcon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {
	Properties properties=new Properties();
	String username=null;
	String password=null;
	String driver=null;
	String url=null;
	
	try {
		FileReader reader=new FileReader("C:\\Users\\ss607\\Documents\\training\\mydb.properties");
		properties.load(reader);
		username=properties.getProperty("username");
		password=properties.getProperty("password");
		driver=properties.getProperty("driver");
		url=properties.getProperty("url");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
			
	
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection=null;
		
		try {
			 connection=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
}
