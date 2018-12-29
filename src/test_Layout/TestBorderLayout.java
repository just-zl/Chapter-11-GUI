package test_Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//BorderLayout是Frame的默认布局管理器。BorderLayout 将整个容器的布局划分为 ：东南西北中，且每个区域只能放一个组建，可以通过插入panel放多个组件
public class TestBorderLayout {

	public static void main(String[] args) {
		
		Frame f = new Frame("TestBorderLayout");
		f.setBounds(300, 200, 400, 400);
		f.setVisible(true);
		
		Button bN = new Button("bN");
		Button bS = new Button("bS");
		Button bC = new Button("bC");
		Button bW = new Button("bW");
		Button bE = new Button("bE");
		
		//法一
		/*f.add(bN,"North");
		f.add(bS,"South");
		f.add(bC,"Center");
		f.add(bW,"West");
		f.add(bE,"East");*/
		
		//法二，主要选法二
		f.add(bN,BorderLayout.NORTH);  //BorderLayout 将整个容器的布局划分为 ：东南西北中
		f.add(bS,BorderLayout.SOUTH);
		f.add(bC,BorderLayout.CENTER);
		f.add(bW,BorderLayout.WEST);
		f.add(bE,BorderLayout.EAST);
		
	}

}
