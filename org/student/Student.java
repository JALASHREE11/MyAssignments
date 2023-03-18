package org.student;

import org.department.Department;

public class Student extends Department{ 
	public void studentName()
	{
		System.out.println("Jalashree");
	}
	public void studentDept()
	{
		System.out.println("EEE"); 
	}
	public void studentId() 
	{ 
		System.out.println("7105005");
	} 
	public static void main(String[] args) {
		Student obj=new Student(); 
		obj.collegeName();
		obj.collegeCode(); 
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
		
	}

}
