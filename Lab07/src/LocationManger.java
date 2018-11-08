import java.util.*;
public class LocationManger {

	public static void main(String[] args) {
		HashMap<String,Location> h = new HashMap<String,Location>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("도시,위도,경도를 입력하세요");
		Location lo[] = new Location[4];
		for(int i=0;i<4;i++){
			System.out.print(">> ");
			String s = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(s,",");
			lo[i]=new Location();
			lo[i].setCityName(st.nextToken());
			lo[i].setWi(Double.parseDouble(st.nextToken()));
			lo[i].setGyeong((Double.parseDouble(st.nextToken())));
			h.put(lo[i].getCityName(), lo[i]);
		}
		System.out.println("----------------------------------------------");
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			Location value = h.get(key);
			System.out.println(key+"\t"+value.getWi()+"\t"+value.getGyeong());
		}
		System.out.println("----------------------------------------------");
		while(true){
			System.out.print("도시이름>> ");
			String search = scanner.nextLine();
			if(search.equals("그만"))
				break;
			if(h.containsKey(search))
				System.out.println(search+"\t"+h.get(search).getWi()+"\t"+h.get(search).getGyeong());
			else
				System.out.println(search+"는 없습니다.");
		}
		scanner.close();
	}

}
