import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = scanner.nextInt();
		int a1=num%10;
		int a2=num/10;
		if(a1==a2)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");

		scanner.close();

	}

}
