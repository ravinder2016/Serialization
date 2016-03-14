package com.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
 
	public static void main(String[] args) throws IOException {
		/*School sc = new School();
		FileOutputStream fos = new FileOutputStream("school.out");
		ObjectOutputStream oo = new ObjectOutputStream(fos);
		oo.writeObject(sc);
		System.out.println("Serialization Done");*/
		School sc = null;
		FileInputStream fis = new FileInputStream("school.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			sc = (School) ois.readObject();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		System.out.println("Location : "+ sc.location);
		System.out.println("Deserialization Done");
		System.out.println(sc);

	}

}
