import java.awt.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import javax.swing.*;
public class menuTest extends JFrame{
	private FontDialog dialog;
	JLabel l;
	public menuTest(){
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		l = new JLabel("Text ");
		l.setToolTipText("������ ���� ����� �����Դϴ�.");
		c.add(l);

		setSize(400,300);
		setVisible(true);
	}
	private void createMenu(){
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu,editMenu,helpMenu;
		JMenuItem open,store,close;
		fileMenu = new JMenu("����");
		open = new JMenuItem("����");
		store = new JMenuItem("����");
		close = new JMenuItem("����");
		fileMenu.add(open);
		open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser chooser = new JFileChooser();
				int ret = chooser.showOpenDialog(null);
				if(ret!=JFileChooser.APPROVE_OPTION){
					JOptionPane.showMessageDialog(null, 
							"������ �������� �ʾҽ��ϴ�","���",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				String pathName = chooser.getSelectedFile().getPath();
				l.setText(pathName+"������ ���õǾ����ϴ�.");
				
			}
		});
		fileMenu.add(store);
		store.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser chooser = new JFileChooser();
				int ret = chooser.showSaveDialog(null);
				if(ret!=JFileChooser.APPROVE_OPTION){
					JOptionPane.showMessageDialog(null, 
							"������ �������� �ʾҽ��ϴ�","���",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				String pathName = chooser.getSelectedFile().getPath();
				l.setText(pathName+"���Ͽ� ����Ǿ����ϴ�.");
				
			}
		});
		fileMenu.addSeparator();
		fileMenu.add(close);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int rs=JOptionPane.showConfirmDialog(null, 
						"�����Ͻðڽ��ϱ�?", "����Ȯ��", 
						JOptionPane.YES_NO_OPTION);
				if(rs==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		
		JMenuItem colorSelect,font,textChange;
		editMenu = new JMenu("����");
		colorSelect = new JMenuItem("�� ����");
		font = new JMenuItem("��Ʈ");
		textChange =  new JMenuItem("�ؽ�Ʈ ����");
		editMenu.add(colorSelect);
		colorSelect.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Color color = JColorChooser.showDialog(null, "���� ����", Color.RED);
				if(color!=null)
					l.setForeground(color);
			}
		});
		dialog = new FontDialog(this,"");
		editMenu.add(font);
		font.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dialog.setVisible(true);
			}
		});
		editMenu.add(textChange);
		textChange.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String text = JOptionPane.showInputDialog("������ �ؽ�Ʈ�� �Է��ϼ���");
				if(text.length()!=0)
					l.setText(text);
			}
		});
		
		JMenuItem aboutVersion = new JMenuItem("���� ����");
		helpMenu = new JMenu("����");
		helpMenu.add(aboutVersion);
		aboutVersion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, 
						"�׽�Ʈ v1.0", "���� ����", 
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(helpMenu);
		
		setJMenuBar(mb);
		
	}
	class FontDialog extends JDialog{
		public FontDialog(JFrame frame,String title){
			super(frame,title,true);
			setLayout(new BorderLayout());
			JPanel p = new JPanel();
			p.setLayout(new GridLayout(0,1));
			p.add(new JLabel("��Ʈ����"));
			p.add(new JLabel("��Ʈ��Ÿ��"));
			p.add(new JLabel("��Ʈũ��"));
			
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(0,1));
			String font[] = {"����","����","���","����"};
			JComboBox <String> comboSize = new JComboBox<String>();
			for(int i=0;i<font.length;i++)
				comboSize.addItem(font[i]);
			p2.add(comboSize);
			
			JPanel pp = new JPanel();
			String style[] = {"bold","italic"};
			JCheckBox s[]  = new JCheckBox[2];
			for(int i=0;i<style.length;i++){
				s[i] = new JCheckBox(style[i]);
				pp.add(s[i]);
			}
			p2.add(pp);
			JTextField tf = new JTextField("");
			p2.add(tf);
			add(p,BorderLayout.WEST);
			add(p2);
			JPanel p3 = new JPanel();
			p3.setLayout(new FlowLayout());
			JButton b = new JButton("����");
			b.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int st,size;
					//��Ÿ��
					st = Font.PLAIN; //Font.BOLD, Font.ITALIC
					if(s[0].isSelected())
						st =Font.BOLD;
					if(s[1].isSelected())
						st += Font.ITALIC;
					//ũ��
					size = Integer.parseInt(tf.getText());
					
					l.setFont(new Font(comboSize.getSelectedItem().toString(),st,size));

				}
			});
			p3.add(b);
			add(p3,BorderLayout.SOUTH);
			setSize(250,200);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new menuTest();
	}

}
