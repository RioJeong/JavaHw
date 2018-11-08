import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseDraggingFrame extends JFrame{
	Container c = getContentPane();
	public MouseDraggingFrame(){
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setBackground(Color.GREEN);
		
		MyMouse listener = new MyMouse();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
	
		setSize(300,200);
		setVisible(true);
		
	}
	class MyMouse extends MouseAdapter{
		public void mouseDragged(MouseEvent e){c.setBackground(Color.YELLOW);}
		public void mouseReleased(MouseEvent e){c.setBackground(Color.GREEN);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseDraggingFrame();
	}

}
