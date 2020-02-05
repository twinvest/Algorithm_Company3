package day01;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class ifTest {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
	//	System.out.println("점수를 입력하세요");
		
		Random r = new Random();
		int jumsu = r.nextInt(100)+1;
		
		
		
		if(jumsu >= 90) {
			System.out.println("A");
		} else if(jumsu >= 80) {
			System.out.println("B");
		} else if(jumsu >= 70) {
			System.out.println("C");
		} else if(jumsu >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
}
