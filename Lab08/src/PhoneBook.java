import java.io.*;
import java.util.*;
public class PhoneBook {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File f = new File("c:\\temp\\phone.txt");
		Scanner scan = new Scanner(f);
		HashMap<String,String> h = new HashMap<String,String> ();
		
		for(int i=0;i<3;i++){
			String s = scan.nextLine();
			//System.out.println(s);
			StringTokenizer st = new StringTokenizer(s," ");
			String Name = st.nextToken();
			String Num = st.nextToken();
			h.put(Name, Num);
		}
		System.out.println("�� 3���� ��ȭ��ȣ�� �о����ϴ�.");
		while(true){
			System.out.print("�̸�>> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			
			if(h.containsKey(name))
				System.out.println(h.get(name));
			else
				System.out.println("ã�� �̸��� �����ϴ�");
		}
		scan.close();
		scanner.close();

	}

}
