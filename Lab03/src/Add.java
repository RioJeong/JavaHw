
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<args.length;i++){
			try{
				double a = Double.parseDouble(args[i]);
				if(a==(int)a)
					sum+=a;
			}
			catch(NumberFormatException e){

			}
		}
		System.out.println(sum);
	}

}
