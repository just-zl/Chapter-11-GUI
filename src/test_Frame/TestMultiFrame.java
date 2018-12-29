package test_Frame;

import java.awt.Color;
import java.awt.Frame;

//创建多个窗口
public class TestMultiFrame {

	public static void main(String[] args) {
		
		MyFrame myFrame1 = new MyFrame(200, 200, 200, 200, Color.white);
		MyFrame myFrame2 = new MyFrame(400, 200, 200, 200, Color.gray);
		MyFrame myFrame3 = new MyFrame(200, 400, 200, 200, Color.gray);
		MyFrame myFrame4 = new MyFrame(400, 400, 200, 200, Color.white);
	}

}

class MyFrame extends Frame {  //能继承就继承，可以设置自己的成员变量
	
	static int id = 0;
	MyFrame(int x,int y,int width,int height,Color color) {
		
		super("MyFrame" + (++id));  //调用Frame的带参数的构造方法
		setBounds(x, y, width, height);
		setBackground(color);
		setLayout(null);
		setVisible(true);
	}
}