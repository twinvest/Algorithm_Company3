package day01;

public class Example01 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		
		for(int j=0; j < 6; j++) {
			int num = (int)(Math.random()*100)+1;
			int tmp = num%45 + 1;
			
			for(int i=0; i<=j; i++) {
				if(lotto[i] == tmp) {
					j--;
					break;
				}
				else if(i == j) {
					lotto[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
		
	}
}
