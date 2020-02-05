import java.util.Arrays;

public class 카운팅소트 {
	public static void main(String[] args) {
		int[] arr = {3,1,0,4,5,2,3,7};
		//0. 자료들의 최소치부터 최대치까지를 인덱스로 담을 수 있는 넉넉한 크기의 카운트 배열을 준비
		
		int[] count = new int[8];
		//1. 각 자료들의 빈도수를 카운트배열에 작성
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		//2. 1번 카운트배열을 누적합으로 변경
		for (int i = 0; i < arr.length; i++) {
			count[i] += count[i-1];
		}
		//3. 원래 자료배열 크기의 배열을 하나 더 준비 < 정렬배열
		int[] sortedArr = new int[arr.length];
		//4. 원래 자료배열을 순회하며, 해당 인덱스의 카운트 배열의 값을 1 깎고 그 위치의 정렬배열에 준비
		for (int i = 0; i < sortedArr.length; i++) {
			count[arr[i]] -= 1;
			sortedArr[count[arr[i]]] = arr[i];
			//sortedArr[--count[arr[i]]] = arr[i];
		}
		System.out.println(Arrays.toString(sortedArr));
	}
}
