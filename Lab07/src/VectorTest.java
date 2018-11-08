import java.util.*;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(-1�� �Էµ� ������)>> ");
		int n;
		while(true){
			n = scanner.nextInt();
			if(n==-1)
				break;
			v.add(n);
		}
		Iterator<Integer> it = v.iterator();
		System.out.print("������: [");
		while(true){
			int t = it.next();
			if(!it.hasNext()){
				System.out.println(t+"]");
				break;
			}else
				System.out.print(t+", ");
		}
		
		int max=0;
		for(int i=1;i<v.size();i++)
			if(v.get(max)<v.get(i))
				max=i;
		System.out.println("���� ū �� "+v.get(max)+" ����");
		v.remove(max);
		Iterator<Integer> it2 = v.iterator();
		System.out.print("[");
		while(true){
			int p = it2.next();
			if(!it2.hasNext()){
				System.out.println(p+"]");
				break;
			}else
				System.out.print(p+", ");
		}
		
		int min=0;
		for(int i=1;i<v.size();i++)
			if(v.get(min)>v.get(i))
				min=i;
		
		System.out.println("���� ���� �� "+v.get(min)+" ����");
		v.remove(min);
		Iterator<Integer> it3 = v.iterator();
		System.out.print("[");
		while(true){
			int x = it3.next();
			if(!it3.hasNext()){
				System.out.println(x+"]");
				break;
			}else
				System.out.print(x+", ");
		}
		scanner.close();
	}

}
