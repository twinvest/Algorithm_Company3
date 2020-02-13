package project1;

public class Truck extends Car {
	private int ton;
	Truck(String num, String model, int price, int ton) {
		super(num, model, price);
		this.ton = ton;
	}
	
	public String toString(){
		String tmp = super.toString();
		tmp += "[트럭이라 톤이 추가됨 : " +ton+"]"; 
		return tmp;
	}
}
