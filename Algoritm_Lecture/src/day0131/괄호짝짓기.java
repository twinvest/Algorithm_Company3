package day0131;

import java.util.Scanner;
import java.util.Stack;

public class 괄호짝짓기 {
	static char[] gwal = { '(', ')', '[', ']', '{', '}', '<', '>' };
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int t = 1; t <= 10; ++t) {
			int len = scan.nextInt();
			String str = scan.next();
			boolean result = true;
			int ans = 0;
			Stack<Character> s = new Stack<>();
			for (int i = 0; i < str.length(); ++i) {
				char ch = str.charAt(i);
				if (ch == gwal[0] || ch == gwal[2] || ch == gwal[4] || ch == gwal[6]) {
					s.push(ch);
				} else {
					int check = -1;
					for (int j = 0; j < 8; ++j) {
						if (ch == gwal[j]) {
							check = j - 1;
							break;
						}
					}
					if (!s.isEmpty() && s.pop() == gwal[check]) {
						result = true;
					} else {
						// 잘못됐음. 더이상 검사할 필요도 없어.
						result = false;
						break;
					}
				}
			}
			if (result) {
				if (s.isEmpty())
					ans = 1;
				else
					ans = 0;
			} else {
				ans = 0;
			}
			System.out.println("#" + t + " " + ans);
		}

	}
}
