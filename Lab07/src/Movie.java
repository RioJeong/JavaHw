import java.util.ArrayList;

public class Movie {
	ArrayList<String> title = new ArrayList<String>();
	ArrayList<String> director = new ArrayList<String>();
	ArrayList<String> genre = new ArrayList<String>();
	ArrayList<Integer> year = new ArrayList<Integer>();
	
	public void print(int i){
		System.out.println("[����:"+title.get(i)+", ����:"+director.get(i)+", �帣:"+genre.get(i)+", �����⵵:"+year.get(i)+"]");
	}
	
}
