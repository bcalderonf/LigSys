package model;

public class Log {
	
	String user;
	String password;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//Full Constructor
	public Log(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	//Empty Constructor
	public Log() {
		this.user = "";
		this.password = "";
	}
	
	

}
