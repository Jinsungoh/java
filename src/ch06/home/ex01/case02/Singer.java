package ch06.home.ex01.case02;

import ch05.home.ex06.case03.Console;

public class Singer extends Entertainer{
	@Override
	public void play() {
		Console.info("노래하다.");
	}
}
