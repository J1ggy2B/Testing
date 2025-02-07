
import java.sql.*;
public class MyDbConnection {

	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_db","watso","Pa55word");
		System.out.println("Connection Good!");
		
		PreparedStatement pstat = c.prepareStatement("insert into students values(?,?,?)");
		
		pstat.setNString(1, "2");
		pstat.setNString(2, "Jimmy");
		pstat.setNString(3, "Gordon");

		
		pstat.executeUpdate();
		System.out.println("successful Update");  
		
		}catch(Exception e) {System.out.println("Error connecting to Database" );e.printStackTrace();}
	}

}
