import java.util.Scanner;
public class Lab1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int n = scanner.nextInt();
		int a1=n/10; 
		int a2=n%10;
		System.out.print("�ڼ�");
		if(a1%3==0&&a2%3==0)
			System.out.println("¦¦");
		else if(a1%3==0||a2%3==0)
			System.out.println("¦");
		else
			System.out.println("����");
		
		scanner.close();
			
	}

}
