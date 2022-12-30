package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {//add는 값이2개있어야 실행한다.
	return  a + b;
	}
	
	/*
	public int add(int x, int y) {
		return x + y;
	}
	*/
	
	public int add(int a, int b, int c) {//overloading -매소드이름이 같고 파라미터n개를 정리하는것.
		return a + b + c;
	}
}
