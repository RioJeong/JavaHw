import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcFrame extends JFrame{
	JTextField t1 = new JTextField(5);
	JTextField t2 = new JTextField(5);
	JTextField result = new JTextField(10);
	public CalcFrame(){
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel l = new JLabel("x");
		JButton b = new JButton("=");
		b.addActionListener(new MyActionListener());
		result.setBounds(250, 10, 100, 30);
		c.add(t1);c.add(l); c.add(t2); c.add(b); c.add(result);
		setSize(400,150);
		setVisible(true);
	}
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int t = Integer.parseInt(t1.getText());
			int tt  = Integer.parseInt(t2.getText());
			result.setText(Integer.toString(t*tt));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalcFrame();
	}

}
