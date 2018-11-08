import java.util.Scanner;
public class PrintAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(int i=c-'a';i>=0;i--){
			for(int j=0;j<=i;j++)
				System.out.print((char)('a'+j));
			System.out.println();
		}
		
		scanner.close();
	}

}
