package test_ActionEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//匿名类练习
public class TestAnonymouse {

	public static void main(String[] args) {
		
		new AnonymouseFrame("Test");
	}

}

class  AnonymouseFrame extends Frame {
	
	public AnonymouseFrame(String s) {
		
		super(s);
		setVisible(true);
		setLocation(300, 200);
	
		//窗口关闭事件
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				
				setVisible(false);
				System.exit(0);
			}
		});
		
		//文本框
		TextField tf = new TextField();
				
		//按钮及按钮事件
		Button b = new Button("start");
		b.addActionListener(new ActionListener() {
			
			int i = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText("start" + (++i));
			}
		});
		
		add(b,BorderLayout.NORTH);
		add(tf,BorderLayout.SOUTH);
		pack();
	}
}