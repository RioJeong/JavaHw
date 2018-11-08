import java.util.Scanner;
public class Lab1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("x1, y1 입력>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.print("x2, y2 입력>>");
		int x2  = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(x1>x2){
			x = x1-x2; 
		}
		else{
			x = x2-x1; 
		}
		if(y1>y2){
			y = y1-y2; 
		}else{
			y = y2-y1;
		}
		if(((100-x)<=x1&&(100-y)<=y1)&&((200+x)>=x2&&(200+y)>=y2))
			System.out.println("충돌 발생");
		else
			System.out.println("충돌 없음");

		scanner.close();
		
		
	}

}
