package day01;

import java.util.*;
import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("점수를 입력하세요");
		Random r = new Random();
		int jumsu = r.nextInt(100)+1;
		
		char a = 'a';
		String s = "";
		
		switch (jumsu/10) {
		case 10:
			
			case 90:
				System.out.println("A");
				break;
			case 80:
				System.out.println("B");
				break;
			case 70:
				System.out.println("C");
				break;
			case 60:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
		}
		
	}
	
	
	
}
