package ex03;

public class C02Double {
	public static void main(String[]args) {
		double d = 1.92;
		int i = (int)d;
		System.out.println(i);//overflow 
		
		double f = Math.floor(d);//올림처리
		double r = Math.round(d);//내림처리
		System.out.printf("%.2f,%.2f\n",f,r);
		//과제:=오른편을 채워라.
		int f2 = (int)f;
		int r2 = (int)r;
		System.out.printf("%d,%d\n",f2,r2);
	}
}
