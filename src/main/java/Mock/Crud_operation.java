package Mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_operation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rootpassword");
		
		PreparedStatement p =connection. prepareStatement("create database Myshcoolmy");
		p.execute();
	     p.close();
    //	Class.forName("com.mysql.cj.jdbc.Driver");
				
   Connection connection2=DriverManager.getConnection("jdbc:mysql://localhost:3306/Myshcoolmy","root","rootpassword");

		
		

 		PreparedStatement p1=connection2.prepareStatement("create table student(id integer primary key,name varchar(20),Father varchar(20),Mother varchar(20),Phone bigint not null)");	
 		PreparedStatement p2 =connection2. prepareStatement("insert into student values(201,'ganesh','shivu','parvathi',9689696352)");
 		PreparedStatement p4 =connection2. prepareStatement("insert into student values(202,'lakshman','pretham','pallavi',968436352)");
 		PreparedStatement p5 =connection2. prepareStatement("insert into student values(203,'yogesh','manju','anusha',9689456352)");
 		PreparedStatement p3 =connection2. prepareStatement("delete from student where id=201");
 						
 						p1.execute();
 						p2.execute();
 						p3.execute();
 						p4.execute();
 						p5.execute();
 						System.out.println("successfull");
	}	

}
