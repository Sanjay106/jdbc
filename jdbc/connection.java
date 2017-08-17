package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	public static void main(String[] args) throws Exception {
		String Driver="org.h2.Driver";
		String URL="jdbc:h2:tcp://localhost/~/db";
		String username="sa";
		String password="";
		Class.forName(Driver);
		Connection c = DriverManager.getConnection(URL,username,password);
		if (!c.isClosed()) {
			System.out.println("connection successfull");

		} else
			System.out.println("connection failed");
	}
}
