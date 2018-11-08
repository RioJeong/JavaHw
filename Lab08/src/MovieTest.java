import java.util.*;
import java.io.*;

class Movie implements Serializable{
	ArrayList<String> title = new ArrayList<String>();
	ArrayList<String> director = new ArrayList<String>();
	ArrayList<String> genre = new ArrayList<String>();
	ArrayList<Integer> year = new ArrayList<Integer>();
	public int q = 0;
	public String toString(){
		return "[제목:"+title.get(q)+", 감독:"+director.get(q)+", 장르:"+genre.get(q)+", 개봉년도:"+year.get(q)+"]";
	}
	public void inside(int q){
		this.q=q;
	}
	public void plus(){
		q++;
	}
	public int printplus(){
		return q;
	}
}

public class MovieTest {
	public void menu(){
		System.out.println("1. 영화 정보 입력/2. 영화 정보 출력/3. 영화 정보 검색/4.파일 저장/5.파일 열기/6.종료");
	}
	
	public void input_information(Scanner sc,Movie mm){
		System.out.print("제목:"); String t = sc.nextLine(); mm.title.add(t); 
		System.out.print("감독:"); String d = sc.nextLine(); mm.director.add(d);
		System.out.print("장르:"); String g = sc.nextLine(); mm.genre.add(g);
		System.out.print("년도:"); int y = sc.nextInt(); mm.year.add(y);
		
	}
	public void output_information(Movie mm){
		mm.inside(0);
		for(int i=0;i<mm.title.size();i++){
			System.out.println(mm);
			mm.plus();
		}

	}
	public void search_information(Scanner sc,Movie mm){
		System.out.print("검색 제목 입력:");
		String search = sc.nextLine();
		int i=mm.title.indexOf(search);
		mm.inside(i);
		System.out.println(mm.toString());

	}
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		MovieTest m = new MovieTest();
		Movie mm = new Movie();
		
		while(true){
			m.menu();
			System.out.print("메뉴입력>>");
			int n = scanner.nextInt();
			scanner.nextLine();
			if(n==1){
				m.input_information(scanner,mm);
				ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("movie.dat"));
				o.writeObject(mm);
				o.close();
			}else if(n==2){
					m.output_information(mm);
			}else if(n==3)
				m.search_information(scanner,mm);
			else if(n==4){	
				System.out.println("movie.dat에 저장되었습니다.");
			}
			else if(n==5){
				ObjectInputStream i = new ObjectInputStream(new FileInputStream("movie.dat"));
				System.out.println("moive.dat로 부터 정보를 불러왔습니다.");	
				mm=(Movie)i.readObject();
				i.close();
			}
			else if(n==6)
				break;
			
		}
		
		
		scanner.close();
	}

}
