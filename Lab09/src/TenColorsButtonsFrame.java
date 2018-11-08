import javax.swing.*;
import java.awt.*;
public class TenColorsButtonsFrame extends JFrame{
	public TenColorsButtonsFrame(){
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color [] color = { Color.RED, Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,
				Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		JButton [] j = new JButton[10];
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for(int i=0;i<10;i++){
			j[i] = new JButton(Integer.toString(i));
			j[i].setBackground(color[i]);
			c.add(j[i]);
			
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenColorsButtonsFrame();
	}

}
