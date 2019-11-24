package com.alhussad.web.dao;

import java.sql.*;

public class CreateAccountDao 
{
	public void createAccount(int student_id, String fn, String ln, String dob, 
			String nation, String dep, String tel, String email, String pass1)
	{
		String query = "insert into student values(?,?,?,?,?,?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecords?serverTimezone=UTC", "root", "alhussad");
			PreparedStatement pt = con.prepareStatement(query);
			pt.setInt(1, student_id); pt.setString(2, fn); pt.setString(3, ln); pt.setString(4, dob);; pt.setString(5, nation);
			pt.setString(6, dep); pt.setString(7, tel); pt.setString(8, email); pt.setString(9, pass1);
			pt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
