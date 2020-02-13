package day0205;

public class 요세푸스순열_노큐 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k = 3;
		
		int pos = 0; //내가 지금 어디에 쿵쿵따 하는지
		int cnt = 0; //내가 지금 쿵을 몇번했는지?
		int outputCnt = 0;//내가 따를 몇번 했는지?
		while( outputCnt != arr.length ) {
			//쿵을 찍어도 되는 부분
			if( arr[pos] != -1 )
				cnt++;
			if(cnt == k) {
				System.out.println(arr[pos]);
				arr[pos] = -1;
				cnt = 0;
				outputCnt++;
			}
			pos = (pos+1) % arr.length;
		}
	}
}
