import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class ListTest extends JFrame{
	JTextField tfName,tfResult;
	JList <String> list;
	JButton btnModify,btnDelete;
	DefaultListModel <String> model;
	public ListTest(){
		setTitle("리스트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //BorderLayout
		
		tfName = new JTextField(10);
		tfName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s = tfName.getText();
				model.addElement(s);
				tfName.setText("");
			}
		});
		
		model = new DefaultListModel<String> ();
		list = new JList<String> (model);
		list.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e) {
				String name = list.getSelectedValue();
				tfResult.setText(name);
			}
		});
		
		JPanel p = new JPanel();
		tfResult = new JTextField(10);
		btnModify = new JButton("수정");
		btnDelete = new JButton("삭제");
		MyListener ml = new MyListener();
		btnModify.addActionListener(ml);
		btnDelete.addActionListener(ml);
		
		p.add(tfResult);
		p.add(btnModify);
		p.add(btnDelete);
		
		c.add(tfName, BorderLayout.NORTH);
		c.add(new JScrollPane(list), BorderLayout.CENTER);
		c.add(p, BorderLayout.SOUTH);
		
		setSize(300,200);
		setVisible(true);
	}
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Object o = e.getSource();
			int n = list.getSelectedIndex();
			if(o==btnModify){
				model.setElementAt(tfResult.getText(), n);
			}else{ //o==btnDelete
				model.remove(n);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListTest();
	}

}
