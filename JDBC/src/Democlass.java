import java.sql.*;



// Java Database Connectivity
/*
 * 1. Import ----> java.sql
 * 2. load and register the driver ---> com.mysql.jdbc.Driver (need to download mysql connector jar
 * 3. Create connection---> connection
 * 4. Create a statement-----> statement
 * 5. execute the query
 * 6. process the results
 * 7. close
 */
public class Democlass {

	public static void main(String[] args) throws Exception {
		// Creating connection for Connection cone:
		String url ="jdbc:mysql://localhost:3306/?user=root://Hospital";
		String uname = "root";
		String pass = "computerscience";
		String query = "Select* FROM Speciality"; // for creating statement should be imported from Mysql DML
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // load and register
		
   Connection con =DriverManager.getConnection(url,uname,pass); // Creating connection
  
   Statement st = con.createStatement(); // Creation a statement
   st.executeUpdate("Use Hospital;");
   ResultSet rs = st.executeQuery(query); // Executing the statement
   
   rs.next();
   String name = rs.getString("Supervisor"); //fetching
   System.out.println(name);
   st.close();
   con.close(); // Closing
   
	}

}
