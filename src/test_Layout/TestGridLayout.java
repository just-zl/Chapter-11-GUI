package test_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

//GridLayout型布局管理器将空间划分成规则的矩形网格，每个单元格区域大小相等，组件被添加到每个单元格中，从左往右、从上往下填充。
//在GridLayout构造方法中指定分割的行数和列数
public class TestGridLayout {

	public static void main(String[] args) {
		
		Frame f = new Frame("TestGridLayout");
		f.setVisible(true);
		/*Button b1 = new Button("Button");
		Button b2 = new Button("Button");
		Button b3 = new Button("Button");
		Button b4 = new Button("Button");
		Button b5 = new Button("Button");
		Button b6 = new Button("Button");*/
		for(int i=1;i<6;i++) {
			f.add(new Button("Button" + i));
		}
		
		f.setLayout(new GridLayout(3, 2));
		f.setLocation(300, 200);
		f.pack();  //设置f的大小刚好将组件包起来
	}

}
