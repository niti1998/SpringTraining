package com.zensar;

public class Login {

	private String userName;
	private String password;
	
	public Login()
	{
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}
	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
	
}
