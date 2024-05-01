package com.SpringCore;

public class Student {
	private int studentId;
	private String studentAddress;
	private String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Student(int studentId, String studentAddress, String studentName) {
		super();
		this.studentId = studentId;
		this.studentAddress = studentAddress;
		this.studentName = studentName;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentAddress=" + studentAddress + ", studentName=" + studentName
				+ "]";
	}
	

}
