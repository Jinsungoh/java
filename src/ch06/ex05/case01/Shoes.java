package ch06.ex05.case01;

public class Shoes extends Product{
	public int price;
	
	public Shoes(int price) {
		super(price * 2);
		this.price = price;
	}
	
	//@Override
	//public int getPrice() {		
		//return this.price;//자식의 값이다.
		//return super.getPrice(); 부모의 값이다.
	
}
