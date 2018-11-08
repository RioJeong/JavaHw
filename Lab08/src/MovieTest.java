import java.util.*;
import java.io.*;

class Movie implements Serializable{
	ArrayList<String> title = new ArrayList<String>();
	ArrayList<String> director = new ArrayList<String>();
	ArrayList<String> genre = new ArrayList<String>();
	ArrayList<Integer> year = new ArrayList<Integer>();
	public int q = 0;
	public String toString(){
		return "[����:"+title.get(q)+", ����:"+director.get(q)+", �帣:"+genre.get(q)+", �����⵵:"+year.get(q)+"]";
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
		System.out.println("1. ��ȭ ���� �Է�/2. ��ȭ ���� ���/3. ��ȭ ���� �˻�/4.���� ����/5.���� ����/6.����");
	}
	
	public void input_information(Scanner sc,Movie mm){
		System.out.print("����:"); String t = sc.nextLine(); mm.title.add(t); 
		System.out.print("����:"); String d = sc.nextLine(); mm.director.add(d);
		System.out.print("�帣:"); String g = sc.nextLine(); mm.genre.add(g);
		System.out.print("�⵵:"); int y = sc.nextInt(); mm.year.add(y);
		
	}
	public void output_information(Movie mm){
		mm.inside(0);
		for(int i=0;i<mm.title.size();i++){
			System.out.println(mm);
			mm.plus();
		}

	}
	public void search_information(Scanner sc,Movie mm){
		System.out.print("�˻� ���� �Է�:");
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
			System.out.print("�޴��Է�>>");
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
				System.out.println("movie.dat�� ����Ǿ����ϴ�.");
			}
			else if(n==5){
				ObjectInputStream i = new ObjectInputStream(new FileInputStream("movie.dat"));
				System.out.println("moive.dat�� ���� ������ �ҷ��Խ��ϴ�.");	
				mm=(Movie)i.readObject();
				i.close();
			}
			else if(n==6)
				break;
			
		}
		
		
		scanner.close();
	}

}
