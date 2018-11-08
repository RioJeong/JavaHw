import java.util.Scanner;
public class Lab1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mid=0;
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		
		if(((a1>a2)&&(a1<a3))||(a1<a2)&&(a1>a3))
			mid = a1;
		else if(((a2>a1)&&(a2<a3))||(a2<a1)&&(a2>a3))
			mid = a2;
		else if(((a3>a2)&&(a1>a3))||(a3<a2)&&(a1<a3))
			mid = a3;
		
		System.out.println("중간 값은 "+mid);
		scanner.close();
	}

}
