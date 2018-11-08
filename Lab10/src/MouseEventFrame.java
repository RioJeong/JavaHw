import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventFrame extends JFrame{
	public MouseEventFrame(){
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel l = new JLabel("Love Java");
		l.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				l.setText("Love Java");
			}
			public void mouseExited(MouseEvent e){
				l.setText("�����");
			}
		});
		c.add(l);
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventFrame();
	}

}
