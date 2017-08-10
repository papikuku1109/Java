package it.xuanphong.cau2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class KetNoiCSDL {
	public Connection con;
	public void KetNoiSQL(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String url="jdbc:sqlserver://DESKTOP-K5KUNN7:1433;databaseName=MaiXuanPhong;user=sa; password=11091996";
			con= DriverManager.getConnection(url);	
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Khong ket noi dc");
		}
	}
	public ResultSet GetTable(String nameTable){
		try {
			KetNoiSQL();
			String sql ="select * from "+nameTable;
			PreparedStatement cmd = con.prepareStatement(sql);
			
			return cmd.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
