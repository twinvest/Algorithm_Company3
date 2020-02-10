package day0210;

import java.util.Scanner;

public class 상호의배틀필드 {
	static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
	static int H;
	static int W;
	static boolean inside(int y, int x)
	{
		return (y>=0 && y<H) && (x>=0 && x<W);  
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			int y=0, x=0;
			H = scan.nextInt();
			W = scan.nextInt();
			char[][] map = new char[H][W];
			for(int i = 0; i<H; ++i)
			{
				String tmp = scan.next();
				for(int j=0; j<W; ++j)
				{
					map[i][j] = tmp.charAt(j);
					if(map[i][j] == '<' || map[i][j] == '>' || map[i][j] == 'v' || map[i][j] == '^')
					{
						y=i;
						x=j;
					}
				}
			}
			
			int len = scan.nextInt();
			String str = scan.next();
			for(int i=0; i<str.length(); ++i)
			{
				char command = str.charAt(i);
				if(command == 'U')
				{
					map[y][x] = '^';
					if(inside(y-1, x) && map[y-1][x] == '.')
					{
						map[y][x] = '.';
						map[y-1][x] = '^';
						y = y-1;
					}
				}
				else if(command == 'D')
				{
					map[y][x] = 'v';
					if(inside(y+1, x) && map[y+1][x] == '.')
					{
						map[y][x] = '.';
						map[y+1][x] = 'v';
						y = y+1;
					}
				}
				else if(command == 'L')
				{
					map[y][x] = '<';
					if(inside(y, x-1) && map[y][x-1] == '.')
					{
						map[y][x] = '.';
						map[y][x-1] = '<';
						x = x-1;
					}
				}
				else if(command == 'R')
				{
					map[y][x] = '>';
					if(inside(y, x+1) && map[y][x+1] == '.')
					{
						map[y][x] = '.';
						map[y][x+1] = '>';
						x = x+1;
					}
				}
				else if(command == 'S')
				{
					int direction = -1;
					if(map[y][x] == '>') direction = 0;
					else if(map[y][x] == '<') direction = 1;
					else if(map[y][x] == 'v') direction = 2;
					else if(map[y][x] == '^') direction = 3;
					
					for(int j=1; j<20; ++j)
					{
						int nexty = y+dir[direction][0]*j;
						int nextx = x+dir[direction][1]*j;
						if(!inside(nexty, nextx) || map[nexty][nextx] == '#')
							break;
						if(map[nexty][nextx] == '*')
						{
							map[nexty][nextx] = '.';
							break;
						}
					}
				}
			}
			System.out.print("#"+t+" ");
			for(int i = 0; i<H; ++i)
			{
				for(int j =0; j<W; ++j)
				{
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
}