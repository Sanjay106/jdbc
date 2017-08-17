package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CRUD {
public static void main(String[] args) throws Exception
{
	String className="org.h2.Driver";
	String url="jdbc:h2:tcp://localhost/~/bookstore";
	String user="sa";
	String password="";
	Class.forName(className);
	Connection c=DriverManager.getConnection(url, user, password);
	Statement s=c.createStatement();
	//creation
	String sql="create  table bookstore(id number primary key,Title varchar,genre varchar,author varchar,parts int,price number)";
	s.execute(sql);
	sql="insert into bookstore values(1.1,'Lord of the Rings','fantasy','J.R.R Tolkien',3,630)";
	s.execute(sql);
	sql="insert into bookstore values(1.2,'A Song of Fire and Ice','fantasy','G.R.R Martin',7,1130)";
    s.execute(sql);
	sql="insert into bookstore values(2.1,'The Hunger Games','Science Fiction','Suzanne Collins',3,430)";
	s.execute(sql);
	//updating
	sql="update bookstore set price=840 where id =1.1";
	s.execute(sql);
	//deleting
	sql="delete from bookstore where id =2.1";
	s.execute(sql);
	sql="drop table bookstore";
	//s.execute(sql);

}

}
