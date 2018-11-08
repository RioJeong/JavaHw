
public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[4][4];
		
		for(int i=0;i<num.length;i++)
			for(int j=0;j<num[i].length;j++)
				num[i][j]=0;
		int p=0;
		while(p<10){
			int k= (int)(Math.random()*10 + 1); 
			int m= (int)(Math.random()*4); 
			int n= (int)(Math.random()*4);
			
			if(num[m][n]!=0)
				continue;
			else
				num[m][n]=k;
			p++;
		}
		
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
				if(num[i][j]!=10)
					System.out.print(" ");
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
