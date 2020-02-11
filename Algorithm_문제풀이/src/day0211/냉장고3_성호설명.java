package day0211;
import java.util.*;
public class 냉장고3_성호설명 {
	static class Ref{
		int low;
		int high;
		public Ref(int low, int high) {
			super();
			this.low = low;
			this.high = high;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Ref[] refArr = new Ref[N];
		for(int i = 0; i < N; i++) {
			refArr[i] = new Ref(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(refArr, new Comparator<Ref>() {
			@Override
			public int compare(Ref o1, Ref o2) {
				if(o1.high > o2.high) {
					return 1;
				} else if(o1.high == o2.high) {
					return 0;
				} else {				
					return -1;
				}
			}
		});
		/*
		for(Ref r : refArr) {
			System.out.println(r.low + " / " + r.high);
		}*/
		int answer = 0;
		int low = 0;
		int high = 0;
		for(int i = 0; i < refArr.length; i++) {
			if(i == 0) {
				low = refArr[i].low;
				high = refArr[i].high;
				answer++;
			}
			if(refArr[i].low > high) {
				low = refArr[i].low;
				high = refArr[i].high;
				answer++;
			}
		}
		System.out.println(answer);
	}
}