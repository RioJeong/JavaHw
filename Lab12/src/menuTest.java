import java.awt.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import javax.swing.*;
public class menuTest extends JFrame{
	private FontDialog dialog;
	JLabel l;
	public menuTest(){
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		l = new JLabel("Text ");
		l.setToolTipText("편집에 따라 변경될 영역입니다.");
		c.add(l);

		setSize(400,300);
		setVisible(true);
	}
	private void createMenu(){
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu,editMenu,helpMenu;
		JMenuItem open,store,close;
		fileMenu = new JMenu("파일");
		open = new JMenuItem("열기");
		store = new JMenuItem("저장");
		close = new JMenuItem("종료");
		fileMenu.add(open);
		open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser chooser = new JFileChooser();
				int ret = chooser.showOpenDialog(null);
				if(ret!=JFileChooser.APPROVE_OPTION){
					JOptionPane.showMessageDialog(null, 
							"파일을 선택하지 않았습니다","경고",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				String pathName = chooser.getSelectedFile().getPath();
				l.setText(pathName+"파일이 선택되었습니다.");
				
			}
		});
		fileMenu.add(store);
		store.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser chooser = new JFileChooser();
				int ret = chooser.showSaveDialog(null);
				if(ret!=JFileChooser.APPROVE_OPTION){
					JOptionPane.showMessageDialog(null, 
							"파일을 선택하지 않았습니다","경고",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				String pathName = chooser.getSelectedFile().getPath();
				l.setText(pathName+"파일에 저장되었습니다.");
				
			}
		});
		fileMenu.addSeparator();
		fileMenu.add(close);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int rs=JOptionPane.showConfirmDialog(null, 
						"종료하시겠습니까?", "종료확인", 
						JOptionPane.YES_NO_OPTION);
				if(rs==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		
		JMenuItem colorSelect,font,textChange;
		editMenu = new JMenu("편집");
		colorSelect = new JMenuItem("색 선택");
		font = new JMenuItem("폰트");
		textChange =  new JMenuItem("텍스트 변경");
		editMenu.add(colorSelect);
		colorSelect.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Color color = JColorChooser.showDialog(null, "색상 선택", Color.RED);
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
				String text = JOptionPane.showInputDialog("변경할 텍스트를 입력하세요");
				if(text.length()!=0)
					l.setText(text);
			}
		});
		
		JMenuItem aboutVersion = new JMenuItem("버전 정보");
		helpMenu = new JMenu("도움말");
		helpMenu.add(aboutVersion);
		aboutVersion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, 
						"테스트 v1.0", "버전 정보", 
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
			p.add(new JLabel("폰트종류"));
			p.add(new JLabel("폰트스타일"));
			p.add(new JLabel("폰트크기"));
			
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(0,1));
			String font[] = {"굴림","돋움","고딕","명조"};
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
			JButton b = new JButton("설정");
			b.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int st,size;
					//스타일
					st = Font.PLAIN; //Font.BOLD, Font.ITALIC
					if(s[0].isSelected())
						st =Font.BOLD;
					if(s[1].isSelected())
						st += Font.ITALIC;
					//크기
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
