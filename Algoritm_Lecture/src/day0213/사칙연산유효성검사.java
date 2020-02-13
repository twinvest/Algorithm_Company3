package day0213;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class 사칙연산유효성검사 {
	static void inorder(int node, char[] nodelist) {
		if (node * 2 < nodelist.length && nodelist[node * 2] != '\0')
			inorder(node * 2, nodelist);
		q.add(nodelist[node]);
		if (node * 2 + 1 < nodelist.length && nodelist[node * 2 + 1] != '\0')
			inorder(node * 2 + 1, nodelist);
	}
	static Queue<Character> q;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int t = 1; t <= 10; ++t) {
			q = new LinkedList<>();
			int numOfnode = scan.nextInt();
			scan.nextLine();
			char[] nodelist = new char[numOfnode + 1];
			for (int i = 1; i <= numOfnode; ++i) {
				String s = scan.nextLine();
				String[] arr = s.split(" ");
				nodelist[Integer.parseInt(arr[0])] = arr[1].charAt(0);
			}
			System.out.print("#" + t + " ");
			inorder(1, nodelist);
			int ans = 1;
			char pre = q.peek();
			char cur;
			for (int i = 0; i < q.size(); ++i) {
				q.poll();
				cur = q.peek();
				if (pre == '*' || pre == '+' || pre == '-' || pre == '/') {
					if (cur == '*' || cur == '+' || cur == '-' || cur == '/') {
						ans = 0;
						break;
					} else pre = cur;
				} else pre = cur;
			}
			System.out.println(ans);
		}
	}
}