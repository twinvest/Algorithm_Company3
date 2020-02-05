package day0203;

public class ProfileMain {

	public static void main(String[] args) 
	{
		Profile p = new Profile();
		p.age = 23;
		p.name = "홍길동";
		p.gender = false;
		p.print();
		
		Profile p2 = new Profile();
		p2.name = "팽수";
		p2.age = 10;
		p2.gender = true;
		p2.print();
		
		Profile p3 = new Profile();
		p3.print();
		
		Profile p4 = new Profile("또치", 31, true);
		p4.print();
	}
}
