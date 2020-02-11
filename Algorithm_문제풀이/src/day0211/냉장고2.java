package day0211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 냉장고2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] chems = new int[n][2];
		for (int i = 0; i < n; i++) {
			chems[i][0] = in.nextInt();
			chems[i][1] = in.nextInt();
		}
		in.close();
		
		//정렬을 하고감.
		Arrays.sort(chems, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[0] <= b[0] ? -1 : 1;
			}
		});

		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(chems[0]);
		outloop: for (int i = 1; i < chems.length; i++) 
		{
			//비교할 것들.
			int[] chem = chems[i];
			for (int j = 0; j < list.size(); j++) 
			{
				//제일 최근 갱신된 것.
				int[] ref = list.get(j);
				//현재의 최고온도가 다음의 최저온도 보다 크다면(높다면) ==>겹치는거임
				//여기 진입이 안되면 밑에 list.add를 실행하고 새로운 냉장고를 하나만드는 꼴임
				if (ref[1] >= chem[0]) 
				{
					ref[0] = ref[0] >= chem[0] ? ref[0] : chem[0];
					ref[1] = ref[1] <= chem[1] ? ref[1] : chem[1];
					continue outloop;
				}
			}
			list.add(chem);
		}
		System.out.println(list.size());
	}
}