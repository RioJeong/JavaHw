import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventTest extends JFrame{
	Container c = getContentPane();
	JLabel la = new JLabel("0");
	private int i=0;
	public EventTest(){
		setTitle("이벤트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton j = new JButton("Click");
		j.addActionListener(new MyActionListener());
		c.add(j); c.add(la);
		
		setSize(250,150);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			i++;
			la.setText(Integer.toString(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest();
	}

}
