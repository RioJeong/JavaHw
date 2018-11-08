import java.util.Scanner;
public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int n = scanner.nextInt();
	
		int num[] = new int[n];
	
		for(int i=0;i<num.length;i++){
			int check=0;
			int r = (int)(Math.random()*100+1);
			for(int j=0;j<i;j++){
				if(num[j]==r){
					check=1;
					break;
				}
			}
			if(check==0)
				num[i]=r;
			else if(check==1)
				i--;
		}
		
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
			if(i%10==9)
				System.out.println();
		}
		scanner.close();
	}

}
