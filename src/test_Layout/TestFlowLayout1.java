package test_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

//体会布局管理器的作用.FlowLayout是Panel类的默认布局管理器
public class TestFlowLayout1 {

	public static void main(String[] args) {
		
		Frame f = new Frame("FLowLayout");
		
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		
		f.setLayout(new FlowLayout());  //组件之间，使用缺省的居中对齐方式，水平和垂直间距为缺省值（5）
		//f.setLayout(new FlowLayout(FlowLayout.RIGHT));  //与窗口右对齐
		f.add(button1);
		f.add(button2);
		f.add(button3);
		
		f.setBounds(300, 200, 200, 200);
		f.setVisible(true);
		
	}

}
