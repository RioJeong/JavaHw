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
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		File f = new File("a.txt");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>"); String s = scanner.next();
		
		File f2 = new File("b.txt");
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>"); String s2 = scanner.next();
		
		System.out.print("��ġ�� ���� �̸��� �Է��ϼ���>>");
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
		System.out.println("������Ʈ ���� �ؿ� "+s3+" ���Ͽ� �����Ͽ����ϴ�.");
		scanner.close();
		fr.close(); fw.close();
	}

}
