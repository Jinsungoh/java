package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int playerChoice=0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위,2.바위,3.보\n");
		playerChoice = sc.nextInt();
		appChoice =(int)(Math.random()*3)+1;
		
		if(1 <= playerChoice && playerChoice <=3) {
			result = switch(playerChoice - appChoice) {
			case -2, 1 ->"you win";
			case -1,2  ->"you lose";
			default -> "fair";
			};
			
			choice = switch(playerChoice) {
			case 1 ->"가위";
			case 2 ->"바위";
			default ->"보";
			};
			System.out.println("you:"+choice);
			
			choice = switch(appChoice){
			case 1 ->"가위";
			case 2 ->"바위";
			default ->"보";
			};
			System.out.println("me:"+choice);
		}else result = "ERROR] 1,2,3중에서 입력하세요.";
		
		System.out.println("\n"+result);
		
		
	}
}
/*
과제: 앱과 가위바위보를 하라.게임 결과를 출력하라.
you win.
you lose.
fair.
중 하나이다.
--

1.가위,2.바위,3.보
>1
you:가위
me:보

you win
*/