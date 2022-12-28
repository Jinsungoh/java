package ch04.home.ex05;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = "";
		int result = 0;
		
		String tmp = "";
		boolean isGood = false;
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isGood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+"); // * 은 0글자 이상 +는 한글자이상.
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]"); // regular expression \\는 정규식, 를 넣은
				if(!isGood) System.out.println("input one of them(+, -, *, /).");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+"); // * 은 0글자 이상 +는 한글자이상.
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/n)? ");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}
/*
과제:계산기를 만들어라.
연산자는 +,-,*,/ 이다.
/는 몫만을 구한다.
 continue(Y/n)?에서y또는Y를 입력하면 계산 작업을 재수행한다.
 a,b:값은 0또는 자연수이다.
 a:1
 op:+
 b:2
 1+2=3
 continue(y/n)?y
 a:2
 op:*
 b:2
 2 *2=4
 continue(y/n)?n
 end.
*/