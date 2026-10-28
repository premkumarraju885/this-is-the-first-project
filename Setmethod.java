package org.encap;


import java.util.ArrayList;
import java.util.List;

public class Setmethod {
public static void main(String[] args) {
	GettingMethods set=new GettingMethods();
	set.setUsername("premkumar");
	set.setPassword("Pass12345");
	
	String username = set.getUsername();
	System.out.println(username);
	Object password = set.getPassword();
	System.out.println(password);
	
	
	GettingMethods a=new GettingMethods();
	a.setUsername("harini");
	a.setPassword("Pass54321");
	
	List<GettingMethods> b=new ArrayList();
	b.add(a);
	b.add(a);
	for(int i=0;i<b.size();i++){
		GettingMethods mi = b.get(i);
		System.out.println(mi.getUsername());
		System.out.println(mi.getPassword());
	}
	
	
}
}
