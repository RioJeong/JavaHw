import java.util.*;
import java.io.*;
public class PhoneSave {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter f = new FileWriter("c:\\temp\\phone.txt");
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		while(true){
			System.out.print("�̸� ��ȭ��ȣ >> ");
			String phone = scanner.nextLine();
			if(phone.equals("�׸�"))
				break;
			f.write(phone+"\r\n");
		}
		System.out.println("c:\\temp\\phone.txt�� �����Ͽ����ϴ�.");
		scanner.close();
		f.close();
	}

}
