import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[]={"����","����","��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true){
			System.out.print("���� ���� ��!>>");
			String c = scanner.nextLine();
			int n = (int)(Math.random()*3);

			if(c.equals("�׸�"))
				break;
			else{
				System.out.print("����� = "+c+" , ��ǻ�� = "+str[n]+", ");
				if((str[n].equals("����")&&c.equals("����"))||(str[n].equals("��")&&c.equals("����"))||(str[n].equals("����")&&c.equals("��")))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				else if((str[n].equals("����")&&c.equals("��"))||(str[n].equals("��")&&c.equals("����"))||(str[n].equals("����")&&c.equals("����")))
					System.out.println("����ڰ� �̰���ϴ�");
				else
					System.out.println("�����ϴ�");
			}

		}
		scanner.close();

	}
}
