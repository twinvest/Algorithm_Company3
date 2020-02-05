import java.util.Arrays;
import java.util.Scanner;

public class wonjae {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			
			
			for (int i = 1; i < T+1; i++) {
				
				int count=0; 
				
				Character status = '0';
				
				String arr = sc.next();
				int size = arr.length();
				char[] arr1 = new char[size+1];
				arr1[0] = '0';
				
				for(int k=1; k <= size;k++) {
					arr1[k] = arr.charAt(k - 1);
				}
				

				for(int j=0;j<size+1;j++) {
					
					
					if(status != arr1[j]) {
						count++;
						status = arr1[j];
					}
					
				
				}
				
			
				
				System.out.println("#" + i + " "+ count);
			}
			
	}
}