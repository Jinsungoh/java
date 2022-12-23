package ch03.ex03;

public class C03BitWise {
	public static void main(String[]args) {
		int x = 10;
		System.out.printf("%s,%d\n",
			"00000000000000000000000000"+ Integer.toBinaryString(x),x);
		
		x =~x;
		System.out.printf("%S,%d\n",Integer.toBinaryString(x),x);
	}
}
