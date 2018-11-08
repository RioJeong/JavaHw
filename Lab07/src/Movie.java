import java.util.ArrayList;

public class Movie {
	ArrayList<String> title = new ArrayList<String>();
	ArrayList<String> director = new ArrayList<String>();
	ArrayList<String> genre = new ArrayList<String>();
	ArrayList<Integer> year = new ArrayList<Integer>();
	
	public void print(int i){
		System.out.println("[제목:"+title.get(i)+", 감독:"+director.get(i)+", 장르:"+genre.get(i)+", 개봉년도:"+year.get(i)+"]");
	}
	
}
