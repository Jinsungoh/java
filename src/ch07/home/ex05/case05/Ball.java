package ch07.home.ex05.case05;

public class Ball {
	private int ballnum;
	
	public Ball(int ballnum) {
		this.ballnum = ballnum;
	}
	
	@Override
	public String toString() {
		return this.ballnum + " ";
	}
}
