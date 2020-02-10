package day0210;

import java.util.Scanner;

public class 사나운개 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] DogA = new boolean[1001];
		boolean[] DogB = new boolean[1001];
		int A,B,C,D,P,M,N;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		P = scan.nextInt();
		M = scan.nextInt();
		N = scan.nextInt();
		int[] human = new int[3];
		human[0] = P;
		human[1] = M;
		human[2] = N;
		
		int index = 1;
		while(true)
		{
			int fix = index;
			for(int i = fix; i<fix+A;++i)
			{
				DogA[i] = true;
				++index;
				if(index > 999)
					break;
			}
			fix=index;
			if(index > 999)
				break;
			for(int i = fix; i<fix+B;++i)
			{
				DogA[i] = false;
				++index;
				if(index > 999)
					break;
			}
			if(index > 999)
				break;
		}
		index =1;
		while(true)
		{
			int fix = index;
			for(int i = fix; i<fix+C;++i)
			{
				DogB[i] = true;
				++index;
				if(index > 999)
					break;
			}
			fix=index;
			if(index > 999)
				break;
			for(int i = fix; i<fix+D;++i)
			{
				DogB[i] = false;
				++index;
				if(index > 999)
					break;
			}
			if(index > 999)
				break;
		}
		for(int i =0; i<3; ++i)
		{
			int count = 0;
			if(DogA[human[i]] == true) count++;
			if(DogB[human[i]] == true) count++;
			System.out.println(count);
		}
	}
}
