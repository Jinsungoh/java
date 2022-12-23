package ch04.ex01;

public class C03if {
	public static void main(String[]args) {
		int hour = 22;
		
		if(hour <12) {
			System.out.println("Good Morning.");
		}else if (hour < 18) {
			System.out.println("Good Afternoon");
		}else if (hour < 21 ) {
			System.out.println("Good evening");
		}else {
			System.out.println("Good night");
		}
		String bow="";
		if(hour <12) bow="Good morning";
		else if(hour <18) bow ="Good Afternoon";
		else if(hour <21)bow="good Evening";
		else bow = "Good night";
		System.out.println(bow);
		//과제:~println()을 한번만 사용하라.
	}
}
