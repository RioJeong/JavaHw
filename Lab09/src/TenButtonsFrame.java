import javax.swing.*;
import java.awt.*;
public class TenButtonsFrame extends JFrame{
	public TenButtonsFrame(){
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for(int i=0;i<10;i++)
			c.add(new JButton(Integer.toString(i)));
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenButtonsFrame();
	}

}
