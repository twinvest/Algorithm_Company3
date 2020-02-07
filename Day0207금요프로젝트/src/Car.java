
public class Car {
	private String num;
	private String model;
	private int price;
	
	Car(String num, String model, int price){
		this.num = num;
		this.model = model;
		this.price = price;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
		String tmp="[차량번호 : "+num+" 차량모델 : "+model+" 가격 : "+price+"]";
		return tmp;
	}
	
}
