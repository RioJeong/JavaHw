import java.io.*;
import java.util.*;
public class FileLineNumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader f = new FileReader("c:\\windows\\system.ini");
		Scanner scanner  = new Scanner(f);
		System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
		int n=0;
		while(true){
			try{
				String s = scanner.nextLine();
				System.out.printf("%4d:",++n);
				System.out.println(s);
			}
			catch(Exception e){
				break;
			}
		}
		scanner.close();
		f.close();
		
	}

}
