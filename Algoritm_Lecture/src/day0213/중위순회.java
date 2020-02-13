package day0213;

import java.util.Scanner;

public class 중위순회 {

	static void inorder(int node, char[] nodelist) {
		if( node * 2 < nodelist.length && nodelist[node * 2] != '\0')
			inorder(node * 2, nodelist);
		System.out.print(nodelist[node]);
		if( node * 2 + 1 < nodelist.length && nodelist[node * 2 + 1] != '\0')
			inorder(node * 2 + 1, nodelist);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int t=1; t<=10; ++t)
		{
			int numOfnode = scan.nextInt();
			String a = scan.nextLine();
			char[] nodelist = new char[numOfnode+1];
			
			for(int i = 1; i<=numOfnode; ++i)
			{
				String s = scan.nextLine();
				String[] arr = s.split(" ");
				nodelist[Integer.parseInt(arr[0])] = arr[1].charAt(0);
			}
			System.out.print("#"+t+" ");
			inorder(1, nodelist);
			System.out.println();
		}
	}
}
