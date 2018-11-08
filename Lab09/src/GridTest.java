import javax.swing.*;
import java.awt.*;
public class GridTest extends JFrame{
	public GridTest(){
		setTitle("Grid TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p1 = new JPanel();
		p1.add(new JLabel("학생 정보 입력"));
		
		JPanel P = new JPanel();
		GridLayout g = new GridLayout(1,4);
		g.setHgap(5);
		P.setLayout(g);
		JPanel []p = new JPanel[4];
		String [] text = {"이 름","학 번","학 과","연락처"};
		GridLayout gg = new GridLayout(5,1);
		gg.setVgap(3);
		for(int i=0;i<text.length;i++){
			p[i] = new JPanel();
			p[i].setLayout(gg);
			p[i].add(new JLabel(text[i]));
			for(int j=0;j<4;j++)
				p[i].add(new JTextField(""));
			P.add(p[i]);
		}
		
		JPanel p2 = new JPanel();
		JButton bt = new JButton("추가");
		bt.setLocation(150, 280);
		bt.setSize(60,40);
		JButton bt2 = new JButton("취소");
		bt2.setLocation(160, 280);
		bt2.setSize(60,40);
		p2.add(bt);
		p2.add(bt2);
		
		c.add(p1, BorderLayout.NORTH);
		c.add(P);
		c.add(p2,BorderLayout.SOUTH);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridTest();
	}

}
