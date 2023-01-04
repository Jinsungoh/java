package ch07.ex01.case01;

public class Main {
	public static void main(String[]args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
	    
		//String s = (String)c;
	}
}
//polymorphism 다양성
//내가 가진 타입중에서만 변환이 가능하다.