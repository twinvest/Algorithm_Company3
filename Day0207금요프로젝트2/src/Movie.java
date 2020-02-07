
public class Movie {
	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;
	
	Movie(String title, String director, int grade, String genre){
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
	}
	Movie(String title, String director, int grade, String genre, String summary){
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String toString(){
		String tmp="[제목 : "+title+" 감독 : "+director+" 등급 : "+grade+" 장르 : "+genre+" 줄거리 : "+summary+"]";
		return tmp;
	}
	
}
