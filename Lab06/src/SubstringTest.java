import java.util.Scanner;
import java.lang.String;
public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String s = scanner.nextLine();
		String k = s;
		do{
			String t1 = k.substring(0, 1);
			String t2 = k.substring(1, s.length());
			k=t2+t1;
			System.out.println(k);
		}while(!k.equals(s));
		scanner.close();
	}

}
