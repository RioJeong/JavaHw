import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiTest extends JFrame{
	public GuiTest(){
		setTitle("GUI Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		l1 = new JLabel("이름 "); t1=new JTextField(10);
		l2 = new JLabel("학번 "); t2=new JTextField(10);
		l3 = new JLabel("연락처 "); t3=new JTextField("컴퓨터과학 전공"); t3.setEnabled(false);
		t3.setEditable(false);
		//t3.setEnabled(false);
		GridLayout g = new GridLayout(4,1);
		g.setVgap(2);
		
		JPanel p = new JPanel();
		p.setLayout(g);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		
		JPanel p2 = new JPanel();
		p2.setLayout(g);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		
		JPanel p3 = new JPanel();
		JButton b1,b2;
		b1 = new JButton("확인");
		b2 = new JButton("취소");
		p3.setLayout(new FlowLayout());
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(t1.getText()+"\t"+t2.getText());
			}
		});
		p3.add(b1); 
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(""); t2.setText("");
			}
		});
		p3.add(b2);
		c.add(p,BorderLayout.WEST);
		c.add(p2);
		c.add(p3,BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiTest();
	}

}
