import java.util.*;
public class VectorRainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int n = scanner.nextInt();
			if(n==0)
				break;
			v.add(n);
			int sum=0;
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()){
				int t = it.next();
				sum+=t;
				System.out.print(t+" ");
			}
			System.out.println();
			System.out.print("현재 평균 ");
			System.out.println(sum/v.size());
		}
		scanner.close();
	}

}
