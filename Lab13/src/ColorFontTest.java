import javax.swing.*;
import java.awt.*;
public class ColorFontTest extends JFrame{
	private MyPanel p = new MyPanel();
	public ColorFontTest(){
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		setSize(700,400);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.setFont(new Font("궁서",Font.BOLD,20));
			g.drawString("국적: 대한민국(궁서 폰트)", 40, 30);
			
			g.setColor(Color.RED);
			g.setFont(new Font("양재깨비체B",Font.ITALIC,30));
			g.drawString("주소: 서울시 강남구(양재깨비체B 폰트)", 40, 90);
			
			g.setColor(Color.YELLOW);
			g.setFont(new Font("휴먼매직체",Font.ITALIC,40));
			g.drawString("성명: 정윤영(휴먼매직체 폰트)", 40, 150);
			
			g.setColor(Color.GRAY);
			g.setFont(new Font("HY나무B",Font.PLAIN,20));
			g.drawString("학번: 1613852(HY나무B 폰트)", 40, 200);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorFontTest();
	}

}
