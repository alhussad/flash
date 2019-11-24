package com.alhussad.web.dao;
import java.sql.*;

public class LoginDao
{
	public boolean validateLogin(String email1, String pass1)
	{
		String query = "select * from student where email=? and password=?";
		String url = "jdbc:mysql://localhost:3306/studentrecords?serverTimezone=UTC";
		String uname = "root";
		String pass = "alhussad";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, email1);
			pt.setString(2, pass1);
			ResultSet rs = pt.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
