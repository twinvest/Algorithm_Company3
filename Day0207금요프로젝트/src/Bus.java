
public class Bus extends Car {
	private int seat;
	Bus(String num, String model, int price, int seat) 
	{
		super(num, model, price);
		this.seat = seat;
	}
	
	public String toString(){
		String tmp = super.toString();
		tmp += "[버스라서 좌석이 추가됨 : " +seat+"]"; 
		return tmp;
	}
}
