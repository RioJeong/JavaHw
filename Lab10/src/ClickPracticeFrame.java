import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickPracticeFrame extends JFrame{
	public ClickPracticeFrame(){
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel l = new JLabel("C");
		l.setBounds(100, 100, 10, 10);
		l.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int x = (int)(Math.random()*(c.getWidth()-l.getWidth()));
				int y = (int)(Math.random()*(c.getHeight()-l.getHeight()));
				l.setLocation(x, y);
			}
		});
		c.add(l);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickPracticeFrame();
	}

}
