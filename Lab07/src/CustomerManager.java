import java.util.*;
public class CustomerManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<String,Integer> ();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true){
			System.out.print("이름과 포인트 입력>> ");
			String name = scanner.next();
			if(name.equals("그만"))
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
