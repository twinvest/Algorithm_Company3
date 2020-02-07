import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		
		ArrayList<Car> prices = new ArrayList<>();
		//싱글톤패턴을 위해 carmgr을 사용
		CarMgr carmgr = CarMgr.CarMgrgetter();
		
		//자동차 추가기능
		carmgr.add(new Car("1", "Benz",25000));
		carmgr.add(new Car("2", "BMW",35000));
		carmgr.add(new Car("3", "Genisis",45000));
		carmgr.add(new Car("4", "아반떼",25000));
		carmgr.add(new Bus("5", "태화버스",25000,30));
		carmgr.add(new Truck("6", "포터",25000,1));
		
		//자동차 num으로 검색
		Car car = carmgr.search("1");
		System.out.println(car);
		
		//55000이하 서치
		System.out.println();
		prices = carmgr.search(55000);
		for(Car c : prices)
		{
			System.out.println(c);
		}
		
		//수정 후 55000이하 서치
		System.out.println();
		carmgr.update("1", 60000);
		prices = carmgr.search(55000);
		for(Car c : prices)
		{
			System.out.println(c);
		}
		
		//가격반환
		System.out.println();
		int price = carmgr.totalPrice();
		System.out.println(price);
		System.out.println();
		
		//6번자동차 삭제 후 55000이하 서치
		carmgr.delete("6");
		prices = carmgr.search(55000);
		for(Car c : prices)
		{
			System.out.println(c);
		}
	}

}
