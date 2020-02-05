package combination;
import java.util.Arrays;

public class combination {
	static int[] arr = {1,2,3};
	static int[] sel = new int[2];
	public static void main(String[] args) {
		combi(0,0);
	}

	static void combi(int idx, int s_idx) {
		if(s_idx == sel.length) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		if(idx == arr.length)
			return;
		sel[s_idx] = arr[idx];
		combi(idx+1,s_idx+1);
		combi(idx+1,s_idx);
	}
}
