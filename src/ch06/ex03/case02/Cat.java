package ch06.ex03.case02;

public class Cat extends Animal{
	@Override  //annotation-주석,메타데이터를 나타낼떄사용
	public void shout() {
		System.out.println("야옹야옹");
	}
}
