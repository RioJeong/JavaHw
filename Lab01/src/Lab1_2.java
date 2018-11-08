import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scanner.nextInt();
		int a1=num%10;
		int a2=num/10;
		if(a1==a2)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");

		scanner.close();

	}

}
