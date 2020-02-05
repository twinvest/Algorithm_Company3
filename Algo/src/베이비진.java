import java.util.Arrays;

public class 베이비진 {
	public static void main(String[] args) {
		int[] arr = {3,2,1,2,1,3};
		boolean isBabygin = isBabygin(arr);
		System.out.println(isBabygin? "베이비진입니다." : "베이비진이 아닙니다");
	}
	
	static boolean isBabygin(int[] arr) {
		//현재 arr배열의 카드 나열이 베이비진이라면 true
		//아니라면 false를 리턴하도록 작성
		int[] front = Arrays.copyOfRange(arr, 0, 3);
		int[] back = Arrays.copyOfRange(arr, 3, 6);
		// 앞쪽이 런이거나 트리플인지 검사 > 1
		boolean frontOk = isTriplet(front) || isRun(front);
		boolean backOk = isTriplet(back) || isRun(back);
		// 뒷쪾이 런이거나 트리플인지 검사 > 2
				
		return frontOk && backOk;
	}
	
	static boolean isTriplet(int[] arr) {
		if(arr[0] == arr[1] && arr[1] ==arr[2])
			return true;
		return false;
	}
	
	static boolean isRun(int[] arr) {
		if(arr[0] + 1 == arr[1] && arr[1] + 1 ==arr[2])
			return true;
		return false;
	}
	
	
	
}
