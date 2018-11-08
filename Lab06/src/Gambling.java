import java.util.Scanner;
class Person{
	private String name;
	public Person(String name){this.name=name;}
	public int random(){ return (int)(Math.random()*3+1);}
	public boolean checker(int n[]){
		if((n[0]==n[1])&&(n[1]==n[2]))
			return true;
		else
			return false;
	}
	public String getter(){return name;}
}
public class Gambling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Person p[]=new Person[2];
		System.out.print("1번째 선수 이름>>");
		String name = scanner.nextLine();
		p[0] = new Person(name);
		System.out.print("2번째 선수 이름>>");
		String name2 = scanner.nextLine();
		p[1] = new Person(name2);
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
				System.out.println("\t"+p[i].getter()+"님이 이겼습니다!");
				break;
			}else
				System.out.println("\t아쉽군요!");
			i++;
			if(i==2)
				i=0;
		}
		scanner.close();
	}

}
