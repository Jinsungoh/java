package ch05.ex03.case03;

public class Main {
	public static void main(String[]args) {
		House house1 = new House();
		House house2 = null;
		
		house1.setAddress("서울 강남구 역삼동");
		
		house2 = house1;
		
		//과제: house1의 키를 house2 에 넘겨줬다.
	}
}
