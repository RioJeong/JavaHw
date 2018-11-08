import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for(int i=0;i<unit.length;i++){
			int temp = money/unit[i];
			if(temp!=0)
				System.out.println(unit[i]+"원 짜리 : "+temp+"개");
			money-=unit[i]*temp;
		}
		scanner.close();
	}

}
