import javax.swing.*;
import java.awt.*;
public class ColorFontTest extends JFrame{
	private MyPanel p = new MyPanel();
	public ColorFontTest(){
		setTitle("Color, Font ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		setSize(700,400);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.setFont(new Font("�ü�",Font.BOLD,20));
			g.drawString("����: ���ѹα�(�ü� ��Ʈ)", 40, 30);
			
			g.setColor(Color.RED);
			g.setFont(new Font("�������üB",Font.ITALIC,30));
			g.drawString("�ּ�: ����� ������(�������üB ��Ʈ)", 40, 90);
			
			g.setColor(Color.YELLOW);
			g.setFont(new Font("�޸ո���ü",Font.ITALIC,40));
			g.drawString("����: ������(�޸ո���ü ��Ʈ)", 40, 150);
			
			g.setColor(Color.GRAY);
			g.setFont(new Font("HY����B",Font.PLAIN,20));
			g.drawString("�й�: 1613852(HY����B ��Ʈ)", 40, 200);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorFontTest();
	}

}
