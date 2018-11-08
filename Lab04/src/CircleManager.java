import java.util.Scanner;
class Circle{
	private double x,y;
	private int radius;
	public Circle(double X, double Y, int R){
		x=X; y=Y; radius = R;
	}
	public void show(){
		System.out.println("("+x+","+y+")"+radius);
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle c[]=new Circle[3];
		for(int i=0;i<c.length;i++){
			System.out.print("x,y,radius>>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i]=new Circle(x,y,radius);
		}
		for(int i=0;i<c.length;i++)
			c[i].show();
		int biggestIndex=0;
		for(int i=1;i<c.length;i++){
			if(c[i].getArea()>c[biggestIndex].getArea())
				biggestIndex=i;
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[biggestIndex].show();
		scanner.close();
	}

}
