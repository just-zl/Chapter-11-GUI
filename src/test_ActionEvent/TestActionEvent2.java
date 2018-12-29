package test_ActionEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//多个按钮组件被同一个监听器监听时，可以通过按钮的setActionCommand()方法进行区分
public class TestActionEvent2 {

	public static void main(String[] args) {
		
		Frame f = new Frame("TestActionEvent2");
		f.setVisible(true);
		f.setLocation(300, 200);
		
		Button b1 = new Button("start");
		Button b2 = new Button("stop");
		
		Monitor2 m = new Monitor2();
		b1.addActionListener(m);
		b2.addActionListener(m);
		b2.setActionCommand("Game Over");  //b1没有设置ActionComman(),则点击b1时，会显示 start
 		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.CENTER);
		f.pack();
	}

}

class Monitor2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		
	}
	
}