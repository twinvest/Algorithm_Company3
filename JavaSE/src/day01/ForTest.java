package day01;

public class ForTest {
	public static void main(String[] args) {
		for(int i =1 ; i <= 9; i++) {
			if(i==3) continue;
			System.out.println("2 * "+ i + "=" +2*i);
			if(i == 5)
				break;
		}
		System.out.println("--------------------------");
		
		for(int i=2; i<= 9; i++) {
			if(i==9) break;
			for(int j=1; j<=9; j++) {
				if(j==5) continue; 
				System.out.println(i + "*" + j + " = " + i*j);
			}
		}
		
	}
}
