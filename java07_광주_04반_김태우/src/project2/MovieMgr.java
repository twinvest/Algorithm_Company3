package project2;
import java.util.ArrayList;

public class MovieMgr {
	private ArrayList<Movie> movielist = new ArrayList<>();
	private Movie[] movies=new Movie[100];
	private int index;
	
	
	private static MovieMgr MovieMgr;
	private MovieMgr() {};
	
	public static MovieMgr MovieMgrgetter() {
		if(MovieMgr == null)
			MovieMgr = new MovieMgr();
		return MovieMgr;
	}
	
	/** 파라메터로 전달된 영화 정보를 전달받아 배열에 저장한다.*/
	public void add(Movie m) {
		movies[index++] = m;
		movielist.add(m);
	}
	/** 배열에 저장된 모든 영화정보를 리턴한다.*/
	public Movie[] search() {
		return movies;
	}
	/** 파라메터로 전달된 타이틀을 포함하고 있는 모든 영화 정보를 검색하여 리턴
	한다*/
	public Movie[] search(String title) {
		Movie[] titles = new Movie[100];
		int idx = 0;
		for(int i =0; i<index; ++i)
		{
			if(movies[i].getTitle().contains(title))
			{
				titles[idx++] = movies[i];
			}
		}
		return titles;
	}
	/** 파라메터로 전달된 감독명의 모든 영화 정보를 검색하여 리턴한다*/
	public Movie[] searchDirector(String name) {
		Movie[] names = new Movie[100];
		int idx = 0;
		for(int i=0; i<index; ++i)
		{
			if(movies[i].getDirector().equals(name))
			{
				names[idx++] = movies[i];
			}
		}
		return names;
	}
	/** 파라메터로 전달된 장르의 모든 영화 정보를 검색하여 리턴한다*/
	public Movie[] searchGenre(String genre) {
		Movie[] genres = new Movie[100];
		int idx = 0;
		for(int i=0; i<index; ++i)
		{
			if(movies[i].getGenre().equals(genre))
			{
				genres[idx++] = movies[i];
			}
		}
		return genres;
	}
	/** 파라메터로 전달된 제목의 영화를 삭제한다.*/
	public void delete(String title) {
		for(int i=0; i<index; ++i)
		{
			if(movies[i].getTitle().equals(title))
			{
				movies[i] = null;
				for(int j = i; j<index-1; ++j)
				{
					movies[j] = movies[j+1];
				}
				--index;
				break;
			}
		}
	}
	/** 저장된 영화 정보의 갯수를 리턴한다.*/
	public int getSize() {
		return index;
	}
}
