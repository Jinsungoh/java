package ch05.ex01.case03;

public class User {
	private String userName;//비공개  encapsulation
	private int age;
	
	
	public void setUserName(String userName) {
		this.userName = userName;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getAge() {
		return age;
		
	}	
}
//get 읽기  domain을 디자인할떄는 캡슐화를 한다. 