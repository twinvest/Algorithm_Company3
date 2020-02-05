package day01;

public class WhileTest {
	public static void main(String[] args) {
		/*
		int dit = 1;
		
		while(dit <= 9) {
			System.out.println("2 * "+ dit + "=" +2*dit);
			dit++;
		}
		*/
		
		
		
		int dan = 1;
		while(dan <= 9) {
			
			if(dan == 8) continue;
			int dit = 1;
			
			dan ++;
			
			while(dit <= 9) {
				if(dit==4) continue;
				System.out.println(dan + " * " + dit + "=" + dan *dit);
				dit ++;
				
			}
			
			
			
		}
	}
}
