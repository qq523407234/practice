import java.sql.*;

public class Examplejdbc {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/students";
		Connection con = null;
		try {
			Class.forName(driver);
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("Can't load Driver:");
		}
		try {
			con = DriverManager.getConnection(URL, "root", "123456");
			System.out.println("Connect Successful.");
		} catch (SQLException ex) {
			System.out.println("Connect fail:" + ex.getMessage());
		}
	}
}