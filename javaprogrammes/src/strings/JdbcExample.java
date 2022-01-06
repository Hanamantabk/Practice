package strings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) {
		String db = "mydb";
		String username = "root";
		String password = "root";
		String sql = "select * from sports";
		String url = ("jdbc:mysql://localhost:3306/" + db);

		try {
			// register-is depricated step
			// Class.forName("com.mysql.jdbc.Driver");

			// establishing connection
			Connection con = DriverManager.getConnection(url, username, password);

			// creating statement obj
			Statement stmt = con.createStatement();

			// get resultSet by passing query
			ResultSet rst = stmt.executeQuery(sql);

			while (rst.next()) {
				System.out.println("results are id" + rst.getInt(1) + " name " + rst.getString(2));
			}

		} catch (Exception e) {
			System.out.println("exception is " + e);
		}

	}

}
