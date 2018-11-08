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
				System.out.println(s+"�� ��ȣ�� "+p[i].gettel()+"�Դϴ�.");
				break;
			}
		}
		if(i==num)
			System.out.println(s+"�� �����ϴ�.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ο���>>");
		int n = scanner.nextInt();
		Phone p[] = new Phone[n];
		for(int i=0;i<n;i++){
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
			String NAME = scanner.next();
			String TEL = scanner.nextLine();
			p[i]=new Phone(NAME,TEL);
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true){
			System.out.print("�˻��� �̸�>>");
			String search = scanner.nextLine();
			if(search.equals("�׸�"))
				break;
			PhoneBook pb = new PhoneBook(search,n);
			pb.check(p);
		}
		scanner.close();
	}
}
