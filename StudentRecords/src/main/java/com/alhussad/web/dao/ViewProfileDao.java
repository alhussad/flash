package com.alhussad.web.dao;
import java.sql.*;

import com.alhussad.web.student.Student;
public class ViewProfileDao 
{
	public Student viewProfile(String email, String pass)
	{
		Student s = new Student(0, "", "", "", "", "", "", "", "");
		String query = "select * from student where email=? and password=?";
		String url = "jdbc:mysql://localhost:3306/studentrecords?serverTimezone=UTC";
		String uname = "root";
		String password = "alhussad";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, password);
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, email);
			pt.setString(2, pass);
			ResultSet rs = pt.executeQuery();
			while(rs.next())
			{
				s.setStudent_id(rs.getInt(1));
				s.setFirst_name(rs.getString(2));
				s.setLast_name(rs.getString(3));
				s.setDob(rs.getString(4));
				s.setNationality(rs.getString(5));
				s.setDepartment(rs.getString(6));
				s.setTelephone(rs.getString(7));
				s.setEmail(rs.getString(8));
				s.setPassword(rs.getString(9));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return s;
	}
}
