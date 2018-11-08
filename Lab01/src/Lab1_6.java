import java.util.Scanner;
public class Lab1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int n = scanner.nextInt();
		int a1=n/10; 
		int a2=n%10;
		System.out.print("박수");
		if(a1%3==0&&a2%3==0)
			System.out.println("짝짝");
		else if(a1%3==0||a2%3==0)
			System.out.println("짝");
		else
			System.out.println("없음");
		
		scanner.close();
			
	}

}
