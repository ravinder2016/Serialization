package com.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationWithModifiersDemo {


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	/*	Student student = new Student();
		FileOutputStream fos = new FileOutputStream("student.out");
		ObjectOutputStream oo = new ObjectOutputStream(fos);
		oo.writeObject(student);
		System.out.println("Serialization Done");*/
		
		FileInputStream fis = new FileInputStream("student.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
	Student	student = (Student) ois.readObject();
		System.out.println(student);
	}

}
