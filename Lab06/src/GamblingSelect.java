import java.util.Scanner;
class PPerson{
	private String name;
	public PPerson(String name){this.name=name;}
	public int random(){ return (int)(Math.random()*3+1);}
	public boolean checker(int n[]){
		if((n[0]==n[1])&&(n[1]==n[2]))
			return true;
		else
			return false;
	}
	public String getter(){return name;}
}
public class GamblingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���ӿ� ������ ���� ����>>");
		int num=scanner.nextInt();
		scanner.nextLine();
		PPerson p[]=new PPerson[num];
		for(int i=0;i<num;i++){
			System.out.print((i+1)+"��° ���� �̸�>>");
			String name = scanner.nextLine();
			p[i] = new PPerson(name);
		}
		
		int i=0;
		while(true){
			System.out.println("["+p[i].getter()+"]:<Enter>");
			scanner.nextLine();
			int n[]=new int[3];
			System.out.print("\t");
			for(int j=0;j<3;j++){
				n[j]=p[i].random();
				System.out.print("\t");
				System.out.print(n[j] );
			}
			if(p[i].checker(n)){
				System.out.println("\t"+p[i].getter()+"���� �̰���ϴ�!");
				break;
			}else
				System.out.println("\t�ƽ�����!");
			i++;
			if(i==num)
				i=0;
		}
		scanner.close();
	}

}
