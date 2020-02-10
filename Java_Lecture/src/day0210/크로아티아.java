package day0210;
import java.util.Scanner;
public class 크로아티아 {
	static String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	static public void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String tmp = scan.next();
		for(int i=0; i<arr.length; ++i)
			if(tmp.contains(arr[i]))
				tmp = tmp.replace(arr[i], "1");
		System.out.println(tmp.length());
	}
}