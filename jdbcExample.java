package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcExample {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/brahmaiah", "root","root");
		//System.out.println("Connection created");
		String url = "jdbc:mysql://localhost:3306/brahmaiah";
		String user = "root";
		String password = "root";
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			 System.out.println("Inserting new student....");
			 String insert = "insert into students(id, name, age) values(1, 'Brahmaiah', 22)";
			 stmt.executeUpdate(insert);
			 System.out.println("Insert Done");
			 
			 System.out.println("\n Reading all students....");
			 String read = "select * from students";
			 ResultSet rs = stmt.executeQuery(read);
			 while(rs.next()) {
				 System.out.println(rs.getInt("id") + " " +rs.getString("name") + " " +rs.getInt("age"));
			 }
			 System.out.println("\nUpdating student age...");
			 String update = "Update students set age = 21 where id =1";
			 stmt.execute(update);
			 System.out.println("Update done");
			 
			 System.out.println("\nDeleting students...");
//			 String delete = "delete from students where id =1";
//			 stmt.execute(delete);
//			 System.out.println("Delete Done");
			 con.close();
			 
			 
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
