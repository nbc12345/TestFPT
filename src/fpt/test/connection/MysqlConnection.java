package fpt.test.connection;

import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;

import java.sql.Connection;

public class MysqlConnection {

	public static Connection getMysqlConnection() throws ClassNotFoundException,SQLException{
		
		String hostName="localhost";
		String dbName="bookstore";
		String username="root";
		String pass="root";
		
		
		return getMysqlConnection(hostName,dbName,username,pass);
		
	
	}
	public static Connection getMysqlConnection(String hostname,String dbName,String username,String pass) throws ClassNotFoundException,SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		String con_url= "jdbc:mysql//"+hostname+"3306"+dbName;
		Connection con =DriverManager.getConnection(con_url, username, pass);
		
		return con;
		
	}
	
}
