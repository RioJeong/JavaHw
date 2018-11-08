import java.io.*;
import java.util.*;
public class FileLineNumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader f = new FileReader("c:\\windows\\system.ini");
		Scanner scanner  = new Scanner(f);
		System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
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
