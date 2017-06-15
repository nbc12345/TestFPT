package fpt.test.connection;

import java.sql.SQLException;

import java.sql.Connection;

public class ConnectionUtil {

	public Connection getConnection() throws ClassNotFoundException,SQLException{
		return MysqlConnection.getMysqlConnection();
	}
	
	  public static void closeQuietly(Connection con) {
	       try {
	           con.close();
	       } catch (Exception e) {
	       }
	   }
	 
	   public static void rollbackQuietly(Connection con) {
	       try {
	           con.rollback();
	       } catch (Exception e) {
	       }
	   }
}
