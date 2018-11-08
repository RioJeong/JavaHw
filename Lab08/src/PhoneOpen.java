import java.io.*;
public class PhoneOpen {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader f = new FileReader("c:\\temp\\phone.txt");
		System.out.println("c:\\temp\\phone.txt를  출력합니다.");
		int c;
		while((c=f.read())!=-1){
			System.out.print((char)c);
		}
		f.close();
	}

}
