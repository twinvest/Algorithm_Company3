import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		MovieMgr manager = MovieMgr.MovieMgrgetter();
		Movie[] movies = new Movie[100];
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			System.out.println("====================");
			System.out.println("<<영화관리프로그램>>");
			System.out.println("1. 영화정보입력");
			System.out.println("2. 영화정보 전체검색");
			System.out.println("3. 영화명검색");
			System.out.println("4. 영화장르별검색");
			System.out.println("5. 영화정보삭제");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 선택하세요._");
			int choice = scan.nextInt();
			switch(choice) 
			{
				case 0:
				{
					flag = false;
			        break;
				}
			    case 1:
			    {
			    	//영화삽입
			    	String title = scan.next();
			    	String director = scan.next();
			    	int grade = scan.nextInt();
			    	String genre = scan.next();
			    	manager.add(new Movie(title, director, grade, genre));
			    	break;
			    }
			    case 2:
			    {
			    	System.out.println();
			    	//현재 등록된 영화 출력
			    	movies = manager.search();
					for(int i=0; i<manager.getSize(); ++i)
						System.out.println(movies[i]);  	
			    	break;
			    }
			    case 3:
			    {
			    	Movie[] titles = new Movie[100];
			    	System.out.println();
			    	//제목으로검색
			    	
			    	String title = scan.next();
					titles = manager.search(title);
					for(int i=0; titles[i] != null; ++i)
					{
						System.out.println(titles[i]);
					}
			    	break;
			    }
			    case 4:
			    {
			    	Movie[] genres = new Movie[100];
			    	System.out.println();
					//장르로 검색
			    	String genre = scan.next();
			    	genres = manager.searchGenre(genre);
					for(int i=0; genres[i] != null; ++i)
					{
						System.out.println(genres[i]);
					}
					break;
			    }
			    case 5:
			    {
			    	String title = scan.next();	
			    	manager.delete(title);
			    	break;
			    }
			}
		}
	}
}