import java.util.*;
public class MovieTest {
	public void menu(){
		System.out.println("1. ��ȭ ���� �Է�");
		System.out.println("2. ��ȭ ���� ���");
		System.out.println("3. ��ȭ ���� �˻�");
		System.out.println("4. ����");
	}
	
	public void input_information(Scanner sc,Movie mm){
		System.out.print("����:"); String t = sc.nextLine(); mm.title.add(t);
		System.out.print("����:"); String d = sc.nextLine(); mm.director.add(d);
		System.out.print("�帣:"); String g = sc.nextLine(); mm.genre.add(g);
		System.out.print("�⵵:"); int y = sc.nextInt(); mm.year.add(y);
	}
	public void output_information(Movie mm){
		for(int i=0;i<mm.title.size();i++)
			mm.print(i);
	}
	public void search_information(Scanner sc,Movie mm){
		System.out.print("�˻� ���� �Է�:");
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
			System.out.print("�޴��Է�>>");
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
