package jdbc;

import java.sql.*;

public class JdbcExample1 {

	private static Connection conn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/brahmaiah";
		String user = "root";
		String password = "root";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user, password);
			conn.setAutoCommit(false);
			String insertSQL = "insert into employees1 (id, name, salary) values (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(insertSQL);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "Brahmaiah");
			pstmt.setDouble(3, 50000);
			pstmt.addBatch();
			
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "Ajith");
			pstmt.setDouble(3, 55000);
			pstmt.addBatch();
			
			pstmt.setInt(1, 3);
			pstmt.setString(2, "Mahesh");
			pstmt.setDouble(3, 60000);
			pstmt.addBatch();
			
			pstmt.setInt(1, 4);
			pstmt.setString(2, "Hari");
			pstmt.setDouble(3, 40000);
			pstmt.addBatch();
			
			int[] results = pstmt.executeBatch();
			conn.commit();
			 System.out.println("Batch insert complted. Row inserted:"+results.length);
			 
			
		}catch (Exception e) {
			try {
				if (conn != null) {
					conn.rollback();
					System.out.println("Transaction rolled back due to error:");
				}
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (conn!= null)
					conn.close();
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		
		

	}

}
