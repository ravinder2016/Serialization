package com.serial;

import java.io.Serializable;

public class Student implements Serializable {

	transient static String collegeName = "nagarjuna";
		String studentName = "ravinder";
		transient final int studentId = 111;
		public Student() {
			System.out.println("Student constructor");
		}
		public String toString() {
			return "Student Name : " + this.studentName + " Student Id : "+this.studentId + " College Name : "+collegeName;
		}
}
