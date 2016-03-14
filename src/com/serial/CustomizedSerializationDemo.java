package com.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerializationDemo {
 
	public static void main(String[] args) throws Exception{
		//Account ac =(Account) Class.forName("com.serial.Account").newInstance();
		/*Account ac = new Account();
		FileOutputStream fos = new FileOutputStream("account.out");
		ObjectOutputStream oo = new ObjectOutputStream(fos);
		oo.writeObject(ac);
		System.out.println("Serialization Done");*/
		
		FileInputStream fis = new FileInputStream("account.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account ac = (Account) ois.readObject();
		System.out.println(ac);
	}

}
