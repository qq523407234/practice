import java.sql.*;

public class Example {

	public static void main(String[] args) {
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		// String URL = "jdbc:odbc:Students";
		String URL = "jdbc:odbc={Microsoft Access Driver (*.mdb,*.accdb)};DBQ=Students.mdb";
		Connection con = null;
		try {
			Class.forName(driver);
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("Can't load Driver");
		}
		try {
			con = DriverManager.getConnection(URL);
			System.out.println("Connect Successful.");
		} catch (SQLException ex) {
			System.out.println("Connect fail:" + ex.getMessage());
		}

		System.out.println("hello");
		System.out.println("dddd");

	}
}