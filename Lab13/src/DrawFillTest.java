import javax.swing.*;
import java.awt.*;
public class DrawFillTest extends JFrame{

	public DrawFillTest(){
		setTitle("Draw Fill 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(0,3));
		
		MyPanel mp1 = new MyPanel();
		c.add(mp1);
		MyPanel2 mp2 = new MyPanel2();
		c.add(mp2);
		MyPanel3 mp3 = new MyPanel3();
		c.add(mp3);
	
		
		setSize(800,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawRoundRect(10, 10, 200, 200, 10, 10);
			g.setColor(Color.red);
			g.fillRect(40, 45, 25, 145);
			g.setColor(Color.BLUE);
			g.fillRect(80, 70, 25, 120);
			g.setColor(Color.YELLOW);
			g.fillRect(120, 115, 25, 75);
			g.setColor(Color.GREEN);
			g.fillRect(160, 70, 25, 120);
			
		}
	}
	class MyPanel2 extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawRoundRect(10, 10, 200, 200, 10, 10);
			g.setColor(Color.red);
			g.fillArc(50, 50,130, 130, 80, 110);
			g.setColor(Color.BLUE);
			g.fillArc(50, 50,130, 130, 190, 30);
			g.setColor(Color.YELLOW);
			g.fillArc(50, 50,130, 130, 220, 100);
			g.setColor(Color.GREEN);
			g.fillArc(50, 50,130, 130, 320, 120);
		}
	}
	class MyPanel3 extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawRoundRect(10, 10, 200, 200, 10, 10);
			g.setColor(Color.MAGENTA);
			int i=60;
			int []x={50+i,65+i,115+i,77+i,87+i,50+i,15+i,23+i,i-13,35+i};
			int []y={0+i-20,25+i,30+i,60+i,105+i,80+i,105+i,60+i,30+i,25+i};
			g.fillPolygon(x, y, 10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawFillTest();
	}

}
