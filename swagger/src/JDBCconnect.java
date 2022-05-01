
import java.sql.*;

public class JDBCconnect {

	public static void main(String[] args) {
		try {
			//  Class.forName("com.mysql.jdbc.Driver");  //old 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM student.city;");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
