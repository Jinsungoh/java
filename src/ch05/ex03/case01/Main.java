package ch05.ex03.case01;

public class Main {
	public static void main(String[]args) {
		Tv mytv = new Tv();
		System.out.println(mytv);
	
		mytv.setColor("red");
		mytv.setPower(true);
		mytv.setChannel(7);
		
		System.out.printf("%s, %b, %d\n",
				mytv.getColor(),mytv.isPower(),mytv.getChannel());
	}
}
