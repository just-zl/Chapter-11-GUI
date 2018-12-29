package test_Frame;

import java.awt.Color;
import java.awt.Frame;

//创建一个图形用户界面，但该界面还没有对按键事件做出反应，得往后学
public class TestFrame {

	public static void main(String[] args) {
		
		Frame f = new Frame("第一个图形用户界面");
		f.setSize(400, 250);
		f.setLocation(500, 200);
		f.setBackground(Color.white);
		f.setVisible(true);  //是否可见
		f.setResizable(false);  //是否可以改变窗口大小
	}

}
