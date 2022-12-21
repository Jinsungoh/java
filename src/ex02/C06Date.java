package ex02;

import java.time.LocalTime;
import java.time.LocalDate;

public class C06Date {
	public static void main(String[]args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		System.out.println(date);
		System.out.println(time);
	}
}
