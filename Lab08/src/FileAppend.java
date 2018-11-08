import java.io.*;
import java.util.*;
public class FileAppend {
	public static void Append(File a,File b) throws Exception{
		int c;
		FileReader fr = new FileReader(a);
		FileWriter fw = new FileWriter(b);
		while((c=fr.read())!=-1)
			fw.write((char)c);
		fr.close(); fw.close();
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		FileReader fr=null; FileWriter fw=null;
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		File f = new File("a.txt");
		System.out.print("첫번째 파일 이름을 입력하세요>>"); String s = scanner.next();
		
		File f2 = new File("b.txt");
		System.out.print("두번째 파일 이름을 입력하세요>>"); String s2 = scanner.next();
		
		System.out.print("합치는 파일 이름을 입력하세요>>");
		String s3 = scanner.next();
		File append = new File(s3);
		fr = new FileReader(f); fw=new FileWriter(append);
		int c;
		while((c=fr.read())!=-1)
			fw.write((char)c);
		fw.write("\r\n");
		fr.close();
		fr = new FileReader(f2);
		while((c=fr.read())!=-1)
			fw.write((char)c);
		System.out.println("프로젝트 폴더 밑에 "+s3+" 파일에 저장하였습니다.");
		scanner.close();
		fr.close(); fw.close();
	}

}
