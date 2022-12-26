package ch04.home;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result =0;
		String msg ="";
		do {
			System.out.print("a:");
			a = sc.nextInt();
			System.out.print("b:");
			b = sc.nextInt();
			System.out.printf("%d+%d=%d\n\n",a,b,result=a+b);
			
			
		}while(result !=0);
		
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