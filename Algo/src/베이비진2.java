
public class 베이비진2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3};
		int[] cnt = new int[10];
	
		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i]] ++;
		}
		
		int result = 0;
		for (int i = 0; i < cnt.length; i++) {
			//트리플릿인지 검사
			
			if(cnt[i] >= 3) {
				cnt[i] -= 3;
				result++;
				i--; // i를 하나 줄이고 반복문을 통과함으로써 해당 카드번호를 다시 검사
				continue;	// 왜냐하면 해당 카드에 두개의 트리플릿이 겹쳐있을 수도 있으니깐.
			}
			if(i<=7 &&cnt[i]>= 1 && cnt[i+1]>=1 && cnt[i+2]>=1 ) {
				cnt[i]--;
				cnt[i+1]--;
				cnt[i+2]--;
				result++;
				i--;
				continue;
			}
		}
		System.out.println(result ==2? "베이비진" : "아님");
		
	
	}
	
	
	
}
