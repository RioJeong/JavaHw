import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FontTest extends JFrame implements ActionListener{
	JRadioButton font[] = new JRadioButton[3];
	String fontString[] = {"����","����","�ü�"};
	JCheckBox style[]  = new JCheckBox[2];
	String styleString[] = {"BOLD","ITALIC"};
	JComboBox <Integer> comboSize;
	JTextField text;
	JLabel l[] = new JLabel[4];
	String label[]={"Font����","Style����","Size����","Text����"};
	JLabel result;
	JPanel p1,p2,p3;
	String t = fontString[0];
	public FontTest(){
		setTitle("Font ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel setP = new JPanel();
		setP.setLayout(new GridLayout(0,1,5,5));
		JPanel setP2 = new JPanel();
		setP2.setLayout(new GridLayout(0,1,5,5));
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p3.setBorder(BorderFactory.createTitledBorder("Font���� ���"));
		
		//���� ��ư_��Ʈ ����
		ButtonGroup bg = new ButtonGroup();
		for(int i=0;i<3;i++){
			font[i] = new JRadioButton(fontString[i]);
			font[i].addActionListener(this);
			p1.add(font[i]);
			bg.add(font[i]);
		}
		
		//üũ�ڽ�_��Ÿ�� ����
		for(int i=0;i<2;i++){
			style[i] = new JCheckBox(styleString[i]);
			style[i].addActionListener(this);
			p2.add(style[i]);
		}
		
		//�޺��ڽ�
		comboSize = new JComboBox<Integer>();
		for(int i=15;i<35;i++)
			comboSize.addItem(i);
		comboSize.addActionListener(this);
		
		//�ؽ�Ʈ �Է�
		text = new JTextField("Hello Java");
		text.addActionListener(this);
		
		//���
		result = new JLabel(text.getText());
		p3.add(result);
		
		for(int i=0;i<label.length;i++){
			l[i] = new JLabel(label[i]);
			setP2.add(l[i]);
		}
		
		setP.add(p1);
		setP.add(p2);
		setP.add(comboSize); 
		setP.add(text);
		c.add(setP2,BorderLayout.WEST);
		c.add(setP, BorderLayout.CENTER);
		c.add(p3, BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		int s,size;
		//�۲�
		for(int i=0;i<3;i++){
			if(e.getSource()==font[i])
				t = fontString[i];
		}
		//��Ÿ��
		s = Font.PLAIN; //Font.BOLD, Font.ITALIC
		if(style[0].isSelected())
			s =Font.BOLD;
		if(style[1].isSelected())
			s += Font.ITALIC;
		//ũ��
		size = Integer.parseInt(comboSize.getSelectedItem().toString());
		
		result.setFont(new Font(t,s,size));
		result.setText(text.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontTest();
	}

}
