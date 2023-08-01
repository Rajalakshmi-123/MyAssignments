package org.student;

import org.department.Department;

public class Student extends Department {
	
    //Methods   :studentName(),studentDept(),studentId()
	public void student() {
		
		System.out.println("Student name is Rajalakshmi");
		
	}

	public void studentDept() {
		
		System.out.println("Department is ECE");
	}
	
	
	public void studentId() {
		
		System.out.println("Id number is 201");
	}
	
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.department();
		stu.student();
		stu.studentDept();
		stu.studentId();
	}
}






