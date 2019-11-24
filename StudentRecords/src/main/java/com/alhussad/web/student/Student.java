package com.alhussad.web.student;

public class Student 
{
	private int student_id;
	private String first_name;
	private String last_name;
	private String dob;
	private String nationality;
	private String department;
	private String telephone;
	private String email;
	private String password;
	public Student(int student_id, String first_name, String last_name, String dob, String nationality,
			String department, String telephone, String email, String password) {
		super();
		this.student_id = student_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.nationality = nationality;
		this.department = department;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("%d %s %s %s %s %s %s %s %s", getStudent_id(), getFirst_name(), getLast_name(), getDob(), getNationality(),
				getDepartment(), getTelephone(), getEmail(), getPassword());
	}
	
}
