package ch06.home.ex04;

public class Circle {
	private Point point;
	private int r;		
	//과제:생성자를 기술하라.
	public Circle(Point point, int r) {
		this.point=point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d ,%d), %d",point,r);
	}
	
}
