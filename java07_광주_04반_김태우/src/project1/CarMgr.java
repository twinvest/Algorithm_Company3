package project1;
import java.util.ArrayList;

public class CarMgr {
	/** 차량정보를 저장하는 리스트 */
	ArrayList<Car> cars = new ArrayList<>();
	
	private static CarMgr CarMgr;
	private CarMgr() {};
	
	public static CarMgr CarMgrgetter() {
		if(CarMgr == null)
			CarMgr = new CarMgr();
		return CarMgr;
	}
	
	/** 파라메터로 전달된 차량 정보를 배열에 저장한다 */
	public void add( Car c) {
		cars.add(c);
	}
	/** 현재 저장된 모든 차량 정보를 리턴한다 */
	public ArrayList search() {
		return cars;
	}
	/** 파라메터로 전달된 번호와 같은 차량 정보를 리턴한다*/
	public Car search(String num) {
		for(Car c : cars)
		{
			if(c.getNum().equals(num))
				return c;
		}
		return null;
	}
	/** 파라메터로 전달된 가격보다 작은 차량 정보들을 리턴한다 */
	public ArrayList search(int price) {
		ArrayList<Car> prices = new ArrayList<>();
		for(Car c : cars)
		{
			if(c.getPrice() < price)
				prices.add(c);
		}
		return prices;
	}
	/** 파라메터로 전달된 번호의 차량을 검색하여 가격을 수정한다.*/
	public void update(String num, int price) {
		for(Car c : cars)
		{
			if(c.getNum().equals(num))
			{
				c.setPrice(price);
			}
		}
	}
	/** 파라메터로 전달된 번호의 차량을 삭제한다.*/
	public void delete(String num) { 
		int index = 0;
		for(Car c : cars)
		{
			if(c.getNum().equals(num))
			{
				cars.remove(index);
				break;
			}
			++index;
		}
	}
	/** 배열에 저장된 차량 대수를 리턴한다. */
	public int size() {
		return cars.size();
	}
	
	/** 배열에 저장된 차량의 금액 합계를 계산하여 리턴한다*/
	public int totalPrice() {
		int sum = 0;
		for(Car c : cars)
		{
			sum += c.getPrice();
		}
		return sum;
	}
}
