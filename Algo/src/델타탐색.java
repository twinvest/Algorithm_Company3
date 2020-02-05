
public class 델타탐색 {

	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3}, {3,2,1}, {2,1,3}};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int sum = 0;
				for(int d=0;d<4;d++) {
					int nr = i + dr[d];
					int nc = j + dc[d];
					
					if(nr >= 0 && nc >= 0 && nr < arr.length && nc < arr[nr].length) {
						sum += Math.abs(arr[i][j] - arr[nr][nc]);
					}
				}
				System.out.printf("%2d",sum);
			}
			System.out.println();
		}
	}

}
