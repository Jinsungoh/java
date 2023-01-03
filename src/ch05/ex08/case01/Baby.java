package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {//new로 호출한다.
		this.babyName = babyName;
	}
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}
}
