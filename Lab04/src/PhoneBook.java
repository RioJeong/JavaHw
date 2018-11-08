import java.util.Scanner;
class Phone{
	private String name,tel;
	public Phone(String name,String tel){
		this.name=name; this.tel=tel;
	}
	public String getname(){
		return name;
	}
	public String gettel(){
		return tel;
	}

}

public class PhoneBook {
	private String s;
	private int num;
	public PhoneBook(String s,int num){
		this.s=s; this.num=num;
	}

	public void check(Phone p[]){
		int i;
		for(i=0;i<num;i++){
			if(p[i].getname().equals(s)){
				System.out.println(s+"의 번호는 "+p[i].gettel()+"입니다.");
				break;
			}
		}
		if(i==num)
			System.out.println(s+"이 없습니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		Phone p[] = new Phone[n];
		for(int i=0;i<n;i++){
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String NAME = scanner.next();
			String TEL = scanner.nextLine();
			p[i]=new Phone(NAME,TEL);
		}
		System.out.println("저장되었습니다...");
		while(true){
			System.out.print("검색할 이름>>");
			String search = scanner.nextLine();
			if(search.equals("그만"))
				break;
			PhoneBook pb = new PhoneBook(search,n);
			pb.check(p);
		}
		scanner.close();
	}
}
