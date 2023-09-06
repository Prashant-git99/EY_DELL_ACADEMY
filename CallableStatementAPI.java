package Class_12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class CallableStatementAPI {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Connection conn = null;
		CallableStatement stmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Howitzer%231996";
			conn = DriverManager.getConnection(dbURL);
			if(conn != null) {
				System.out.println("Connection established using conn1");
			}
			
			System.out.println("Employee ID");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Employee Name");
			String empName = sc.nextLine();
			
			System.out.println("Enter Employee Role");
			String empRole = sc.nextLine();
			
			System.out.println("Enter Employee City");
			String empCity = sc.nextLine();
			
			System.out.println("Enter Employee Country");
			String empCountry = sc.nextLine();
			
			
			
			stmt = conn.prepareCall("{call insertEmployee(?,?,?,?,?,?)}");
			stmt.setInt(1, id);
			stmt.setString(2, empName);
			stmt.setString(3, empRole);
			stmt.setString(4, empCity);
			stmt.setString(5, empCountry);
			
			stmt.registerOutParameter(6, java.sql.Types.INTEGER);
			
			stmt.executeUpdate();
			
			String result = stmt.getString(6);
			
			System.out.println("Employee record Save Success : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
				sc.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
