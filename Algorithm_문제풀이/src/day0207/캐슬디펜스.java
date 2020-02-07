package day0207;

import java.util.Arrays;
import java.util.Scanner;

public class 캐슬디펜스 {
	static int[][] position = {{2,2,2,0,0},{2,2,0,2,0},{2,2,0,0,2},{2,0,2,0,2},{2,0,2,2,0},{2,0,0,2,2},{0,2,2,2,0},{0,2,2,0,2},{0,2,0,2,2},{0,0,2,2,2}};
	static int[][] position2 = {{0,1,2},{0,1,3},{0,1,4},{0,2,4},{0,2,3},{0,3,4},{1,2,3},{1,2,4},{1,3,4},{2,3,4}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ans = new int[10];

		int I =scan.nextInt();
		int J =scan.nextInt();
		int attackDistance = scan.nextInt();

		int[][] map = new int [I+1][J];
		int[][] notChangeMap = new int[I+1][J];
		for(int i =0; i<I; ++i)
		{
			for(int j =0; j<J; ++j)
			{
				map[i][j] = scan.nextInt();
				notChangeMap[i][j] = map[i][j];
			}
		}


		for(int i=0; i<10; ++i)
		{
			//처음시작할땐 다시 원래대로 맵을 만들어 놓음.
			for(int l=0; l<I; ++l)
				for(int k=0; k<J; ++k)	
					map[l][k] = notChangeMap[l][k];
			
			//궁수채워넣음.
			for(int l=0; l<J; ++l)
				map[I][l] = position[i][l];
			
			//한턴. 즉, 전진을 의미. 밑에 코드들 전부 이 안에 들어가야함.
			for(int term = 0; term<I; ++term)
			{
				//궁수공격
				//일단 세 명의 궁수 위치에서 한명씩 적쏠 수 있는색히 쏘기
				for(int l =0; l<3; ++l)
				{
					int cury = I;
					int curx = position2[i][l];
					
					//2중포문으로 거리안에 있는 색히들 다 죽임. for문은 왼쪽부터 위에서 아래로 진행하면서 오른쪽으로~~
					out : for(int z=0; z<I; ++z)
					{
						for(int j =0; j<J; ++j)
						{
							if(map[j][z] == 1)
							{
								//이 안으로 진입하면 공격에 성공한거임
								if(Math.abs(z-curx) + Math.abs(j-cury) <= attackDistance)
								{
									ans[i]++;
									map[j][z] = -2;
									break out;
								}
							}
						}
					}
				}
				
				//적 내리기.
				for(int l =I-1; l>=1; --l)
				{
					for(int j=0; j<J; ++j)
					{
						map[l][j] = map[l-1][j];
					}
					
					for(int j=0; j<J; ++j)
					{
						map[l-1][j] = -1;
					}
				}
				
				//출력코드
				for(int l = 0; l<I+1; ++l)
				{
					for(int j =0; j<J; ++j)
					{
						System.out.print(map[l][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
				
			}
		}
		
		Arrays.sort(ans);
		for(int i=0; i<ans.length; ++i)
			System.out.print(ans[i]+" ");
	}

}