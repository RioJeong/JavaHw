import javax.swing.*;
import java.awt.*;
public class StoryTest extends JFrame{
	public StoryTest(){
		setTitle("SM Story");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		JLabel j = new JLabel("SM Story");
		j.setLocation(20, 20);
		j.setSize(70,20);
		c.add(j);
		JLabel j2 = new JLabel("가을은");
		j2.setLocation(100, 80);
		j2.setSize(50,20);
		c.add(j2);
		JLabel j3 = new JLabel("이다");
		j3.setLocation(280, 160);
		j3.setSize(50,20);
		c.add(j3);
		JTextField jt = new JTextField("");
		jt.setLocation(160,120);
		jt.setSize(90,30);
		c.add(jt);
		setSize(450,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StoryTest();
	}

}
