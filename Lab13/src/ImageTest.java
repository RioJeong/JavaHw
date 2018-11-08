import javax.swing.*;
import java.awt.*;
public class ImageTest extends JFrame {
	MyPanel panel = new MyPanel();
	public ImageTest(){
		setTitle("그래픽 이미지 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("back.jpg");
		Image img = icon.getImage();
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			int w = getWidth()/2;
			int h = getHeight()/2;
			int imgw = icon.getIconWidth()/2;
			int imgh = icon.getIconHeight()/2;
			g.drawImage(img, 0,0,w-5,h-5,0,0,imgw,imgh,this);
			g.drawImage(img, w+5,0,w*2,h-5,512,0,imgw*2,imgh,this);
			g.drawImage(img, 0,h+5,w-5,h*2,0,384,imgw,imgh*2,this);
			g.drawImage(img, w+5,h+5,w*2,h*2,512,384,imgw*2,imgh*2,this);
	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageTest();
	}

}
