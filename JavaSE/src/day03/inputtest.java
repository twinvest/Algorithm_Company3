package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inputtest {
		
		// scanner 이용
		// 숫자 : nextInt()
		// 문자 : next();
		// 공백이 나오기 전까지 읽는다
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("res/inputtest.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input);
		
		int input2 = sc.nextInt();
		System.out.println(input2);
		
		String next = sc.next();
		System.out.println(sc.next());
	}

}
