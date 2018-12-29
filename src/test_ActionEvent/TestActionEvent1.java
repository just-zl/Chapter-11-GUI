package test_ActionEvent;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent1 {

	public static void main(String[] args) {
		
		Frame f = new Frame("按钮点击事件");
		f.setLocation(300, 200);
		f.setVisible(true);
		
		Button b = new Button("Press me");
		
		Monitor m = new Monitor();  //创建监听器对象
		b.addActionListener(m);  //监听按钮b
		
		f.add(b);
		f.pack();
	}

}

class Monitor implements ActionListener {  //Monitor译为监听

	@Override
	public void actionPerformed(ActionEvent e) {  //actionPerformed()，是一个回调函数。即被系统调用的函数。
		
		System.out.println("a button has been pressed!");
	}
	
}
