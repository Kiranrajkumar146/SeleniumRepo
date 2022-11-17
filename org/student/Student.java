package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Kiran raj kumar");
	}	
	public void studentID() {
		System.out.println("RA1611004010140");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentName();
		obj.studentID();
		obj.departmentName();	
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();	
	}
}