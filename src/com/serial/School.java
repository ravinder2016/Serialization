package com.serial;

import java.io.Serializable;

public class School implements Serializable{
	private static final long serialVersionUID = 1L;
	String schoolName = "zphs";
	int registrationNumber = 1124;
	Teacher teach = new Teacher();
	String location = "tmlg";
	public School()
	{
		System.out.println("School Constructor");
	}
/*	public void setSchoolName(String sch)
	{
		this.schoolName = sch;
	}*/
/*	public String getSchoolName()
	{
		return this.schoolName;
	}*/
	public String toString() {
		return "School Name : " + this.schoolName+"Teacher Name : "+teach.teacherName;
	}
}
