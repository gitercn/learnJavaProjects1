package com.ti1;

public class NetUser {
	int id;
	String password;
	String email;
	
	NetUser(int id, String password, String email){
		this.id = id;
		this.password = password;
		this.email = email+"@gameschool.com";
		
	}
	
	public static void main(String args[]) {
		NetUser netuser1 = new NetUser(10, "123", "hello");
		System.out.println("id"+netuser1.id);
		System.out.println(netuser1.password);
		System.out.println(netuser1.email);
		
	}

}
