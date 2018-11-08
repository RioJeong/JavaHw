import java.util.*;
public class MovieTest {
	public void menu(){
		System.out.println("1. 영화 정보 입력");
		System.out.println("2. 영화 정보 출력");
		System.out.println("3. 영화 정보 검색");
		System.out.println("4. 종료");
	}
	
	public void input_information(Scanner sc,Movie mm){
		System.out.print("제목:"); String t = sc.nextLine(); mm.title.add(t);
		System.out.print("감독:"); String d = sc.nextLine(); mm.director.add(d);
		System.out.print("장르:"); String g = sc.nextLine(); mm.genre.add(g);
		System.out.print("년도:"); int y = sc.nextInt(); mm.year.add(y);
	}
	public void output_information(Movie mm){
		for(int i=0;i<mm.title.size();i++)
			mm.print(i);
	}
	public void search_information(Scanner sc,Movie mm){
		System.out.print("검색 제목 입력:");
		String search = sc.nextLine();
		int i=mm.title.indexOf(search);
		mm.print(i);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MovieTest m = new MovieTest();
		Movie mm = new Movie();
		while(true){
			m.menu();
			System.out.print("메뉴입력>>");
			int n = scanner.nextInt();
			scanner.nextLine();
			if(n==1)
				m.input_information(scanner,mm);
			else if(n==2)
				m.output_information(mm);
			else if(n==3)
				m.search_information(scanner,mm);
			else
				break;
			
		}
		scanner.close();
	}

}
