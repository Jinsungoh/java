package ex02;

public class C03Str {
	public static void main(String[]args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;//class타입의 변수는 4byte이다.
		System.out.println(sumStr);
		
		int i = Integer.parseInt(sumStr);
		
		String s = a + b + "";//"은 붙히기로 문자로 인식된다.
		System.out.println(s);
		
		s = "" + a + b;
		System.out.println(s);
				
		String dialog = "John said, \"hello\".";
		System.out.println(dialog);
	}
}
