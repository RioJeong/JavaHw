
public class Rectangle {
	private int x,y,width,height;
	
	public Rectangle(int X, int Y, int W, int H){
		x=X; y=Y; width=W; height=H;
	}
	public int square(){
		return width*height;
	}
	public void show(){
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	public boolean contains(Rectangle r){
		if((r.x+r.width<x+width) && (r.y+r.height<y+height))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다");
	}

}
