import java.util.Scanner;
public class Grade {
	private int M,S,E;
	
	public Grade(int m,int s,int e){
		M=m; S=s; E=e;
	}
	
	public int average(){
		return (M+S+E)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("����� "+me.average());
		scanner.close();
	}

}
