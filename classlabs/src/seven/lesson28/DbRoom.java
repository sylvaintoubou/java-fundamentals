package seven.lesson28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;


public class DbRoom {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost/seven_db";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String username = "root";
		String password = "sEVEN_7A";
		
		try {
			conn = DriverManager.getConnection(DATABASE_URL, username, password);
			System.out.println(conn.getMetaData().getDriverName());
			statement = conn.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM employees");
			ResultSetMetaData meta  = (ResultSetMetaData) resultSet.getMetaData();
			
			boolean dropped = statement.execute("DROP DATABASE beers");
			System.out.println(dropped ? "Database dropped" : "Error");
			
			int columnCount = meta.getColumnCount();
			
		
			print("Number of results : " + columnCount + " \n");
			
			for(int j = 1; j <= columnCount; j++) {
				print(meta.getColumnName(j++));
			}
			print("\n");
			
			while(resultSet.next()) {
				for(int i = 1; i <= columnCount; i++) {
					print(resultSet.getObject(i).toString());
				}
				print("\n");
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void print(String str) {
		System.out.println(str);
	}
}
