package com.serial;

import java.io.Serializable;

public class Teacher implements Serializable{

	String teacherName = "Ravinder";
	int teacherId = 124;
	public String toString() {
		return "Teacher Naeme : " + this.teacherName;
	}
}
