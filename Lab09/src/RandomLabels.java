import javax.swing.*;
import java.awt.*;
public class RandomLabels extends JFrame{
	public RandomLabels(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel [] jl = new JLabel[20];
		Container c = getContentPane();
		c.setLayout(null);
		for(int i=0;i<jl.length;i++){
			jl[i] = new JLabel();
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			jl[i].setLocation(x, y);
			jl[i].setSize(10,10);
			jl[i].setBackground(Color.BLUE);
			jl[i].setOpaque(true);
			c.add(jl[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomLabels();
	}

}
