import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		for(int i=0;i<unit.length;i++){
			int temp = money/unit[i];
			if(temp!=0)
				System.out.println(unit[i]+"�� ¥�� : "+temp+"��");
			money-=unit[i]*temp;
		}
		scanner.close();
	}

}
