import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[]={"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true){
			System.out.print("가위 바위 보!>>");
			String c = scanner.nextLine();
			int n = (int)(Math.random()*3);

			if(c.equals("그만"))
				break;
			else{
				System.out.print("사용자 = "+c+" , 컴퓨터 = "+str[n]+", ");
				if((str[n].equals("바위")&&c.equals("가위"))||(str[n].equals("보")&&c.equals("바위"))||(str[n].equals("가위")&&c.equals("보")))
					System.out.println("컴퓨터가 이겼습니다");
				else if((str[n].equals("바위")&&c.equals("보"))||(str[n].equals("보")&&c.equals("가위"))||(str[n].equals("가위")&&c.equals("바위")))
					System.out.println("사용자가 이겼습니다");
				else
					System.out.println("비겼습니다");
			}

		}
		scanner.close();

	}
}
