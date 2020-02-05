package com.ssafy.java;
import java.util.*;
import java.util.Random;

public class GameTest {
	public static void main(String[] args) {
		
		int d;
		Scanner sc = new Scanner(System.in);
		d = sc.nextInt();
		String input = sc.nextLine();
		
		char 가위 = 1;
		char 주먹 = 2;
		char 보 = 3;
		
		int num = (int)(Math.random()*3) + 1 ;
		
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		
		System.out.println("번호를 입력하세요." + d);
		
	}
}
