import java.util.*;
public class CustomerManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<String,Integer> ();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true){
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			int point = scanner.nextInt();
			if(h.containsKey(name))
				h.put(name, h.get(name)+point);
			else
				h.put(name, point);
			
			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()){
				String key = it.next();
				int value = h.get(key);
				System.out.print("("+key+","+value+")");
			}
			System.out.println();
		}
		scanner.close();
	}

}
