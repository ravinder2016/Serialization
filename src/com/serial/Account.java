package com.serial;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	int amount = 10000;
	String userName = "ravinder";
	String typeOfAccount = "Single";
	transient String password = "chinny";
	transient String accountNumber = "ab1234";

	public Account() {
		 this.userName = "Raju";
		 this.accountNumber = "7hghh";
	}

	public String toString() {
		return "User Name : " + this.userName + " Password : " + this.password+ " Account Number : "+this.accountNumber+ " typeOfAccount : "+this.typeOfAccount;
	} 
	public void setAmount(int amt)
	{
		this.amount = amt;
	}
	private void writeObject(ObjectOutputStream oo) throws IOException
	{
		oo.defaultWriteObject();
		String passwd = "123" + this.password;
		oo.writeObject(passwd);
	}
	private void readObject(ObjectInputStream oi) throws ClassNotFoundException, IOException
	{
		oi.defaultReadObject();
		String passwd = (String) oi.readObject();
		this.password = passwd.substring(3);
	}
}
