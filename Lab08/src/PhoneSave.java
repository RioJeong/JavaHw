import java.util.*;
import java.io.*;
public class PhoneSave {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter f = new FileWriter("c:\\temp\\phone.txt");
		System.out.println("전화번호 입력 프로그램입니다.");
		while(true){
			System.out.print("이름 전화번호 >> ");
			String phone = scanner.nextLine();
			if(phone.equals("그만"))
				break;
			f.write(phone+"\r\n");
		}
		System.out.println("c:\\temp\\phone.txt에 저장하였습니다.");
		scanner.close();
		f.close();
	}

}
