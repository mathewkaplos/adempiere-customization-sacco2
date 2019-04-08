package sacco.importing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.compiere.process.SvrProcess;

public class ImportMember extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		copy();
		return null;
	}

	private static void copy() {
		Connection conn = null;
		ResultSet rs = null;
		try {
			String url = "jdbc:sqlserver://MATHEW;databaseName=FOSAED Trimmed;integratedSecurity=true";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url);

			Statement statement = conn.createStatement();
			String queryString = "select COUNT(*) FROM m_member";
			rs = statement.executeQuery(queryString);
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

	try {
		if(conn!=null) {
			conn.close();
			conn=null;
		}if(rs!=null) {
			rs.close();
			rs=null;
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
		}
	}

	public static void main(String[] args) {
		copy();
	}

}
