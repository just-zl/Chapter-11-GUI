package test_Panel;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class TestPanel {

	public static void main(String[] args) {
		
		MyFrame2 frame = new MyFrame2("包含Panel的窗口",200,300,400,400);
	}

}

class MyFrame2 extends Frame {
	
	MyFrame2(String s,int x,int y,int width,int height){
		
		super(s);
		setLayout(null);  //Frame 对象不带布局管理器
		setBounds(x, y, width, height);
		setVisible(true);
		
		MyPanel p1 = new MyPanel(0, 0, width/2, height/2,Color.pink);
		MyPanel p2 = new MyPanel(width/2, 0, width/2, height/2,Color.blue);
		MyPanel p3 = new MyPanel(0, height/2, width/2, height/2,Color.green);
		MyPanel p4 = new MyPanel(width/2, height/2, width/2, height/2,Color.black);
		
		/*p1.setBounds(0, 0, width/2, height/2);
		p2.setBounds(width/2, 0, width/2, height/2);
		p3.setBounds(0, height/2, width/2, height/2);
		p4.setBounds(width/2, height/2, width/2, height/2);
		
		p1.setBackground(Color.pink);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.green);
		p4.setBackground(Color.black);*/
		
		add(p1);add(p2);add(p3);add(p4);
	}
}

class MyPanel extends Panel {
	
	MyPanel(int x,int y,int width,int height,Color color) {
		super(null);  //Panel对象不带布局管理器
		setBounds(x, y, width, height);
		setBackground(color);
	}
}