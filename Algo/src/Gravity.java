import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] input = new int[N];
		
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		
		
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			int cnt= 0;
			for (int j = i+1; j < N; j++) {
				if(input[i] > input[j])
					cnt++;
			}
			
			if(max < cnt)
				max = cnt;
		}
		System.out.println(max);
		
		
		
		
		
		
		
	}
}
