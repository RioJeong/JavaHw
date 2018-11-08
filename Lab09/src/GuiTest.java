import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame {
	public GuiTest(){
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout g = new GridLayout(4,1);
		g.setVgap(3);
		
		JPanel p = new JPanel();
		p.setLayout(g);
		p.add(new JLabel("�̸�"));
		p.add(new JLabel("�й�"));
		p.add(new JLabel("����"));
		p.add(new JLabel("����ó"));
		
		JPanel p2 = new JPanel();
		p2.setLayout(g);
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField("��ǻ�Ͱ��� ����"));
		p2.add(new JTextField(""));
		
		JPanel p3 = new JPanel();
		JButton bt = new JButton("Ȯ��");
		bt.setLocation(150, 280);
		bt.setSize(60,40);
		JButton bt2 = new JButton("���");
		bt2.setLocation(160, 280);
		bt2.setSize(60,40);
		p3.add(bt);
		p3.add(bt2);
		
		
		
		c.add(p,BorderLayout.WEST);
		c.add(p2,BorderLayout.CENTER);
		c.add(p3,BorderLayout.SOUTH);
		
		
		
		setSize(400,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiTest();
	}

}
