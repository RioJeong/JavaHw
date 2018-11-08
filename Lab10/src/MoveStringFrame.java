import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MoveStringFrame extends JFrame{
	JLabel la = new JLabel("Love Java");
	public MoveStringFrame(){
		setTitle("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Mykey k = new Mykey();
		la.addKeyListener(k);
		c.add(la);
		setSize(300,200);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
	}
	class Mykey extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			String s = la.getText();
			String t = s.substring(0, 1);
			String t2 = s.substring(1);
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
				la.setText(t2.concat(t));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveStringFrame();
	}

}
