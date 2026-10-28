package org.encap;

public class GettingMethods {

	private String username;
	private Object password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(username.equals("premkumar")) {
			this.username = "Thankyou for login prem";
		}
		else if(username.equals("harini")){
			this.username= "thankyou fro login harini";
		}
		
	}
	
	public Object getPassword() {
		return password;
	}
	public void setPassword(Object password) {
		if(password.equals("Pass12345")) {
			this.password= "the password is correct so the valuse are printed";
		}
			else if(password.equals("Pass54321")) 
			this.password="the password is correct so the valuse are printed";
	}

			
}
