package test_ActionEvent;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//使用内部类解决Test_TextFieldPractice1里的问题

public class Test_TextFieldPractice2 {

	public static void main(String[] args) {
		
		new TFFrame3();
	}

}

class TFFrame3 extends Frame {  //TFFrame3叫做包装类 
	
	TextField tf1,tf2,tf3;  //定义为成员变量
	
	TFFrame3() {
		setLocation(300, 200);
		setVisible(true);
		
		//创建组件
		tf1 = new TextField(5);  //设置文本框的宽度
		Label l = new Label("+");
		tf2 = new TextField(5);
		Button b2 = new Button("=");
		tf3 = new TextField(5);
		
		//窗口关闭监听
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
		TFActionListener3 listener = new TFActionListener3();  //传的是指向对象的引用
		b2.addActionListener(listener);
		
		setLayout(new FlowLayout());
		add(tf1);add(l);add(tf2);add(b2);add(tf3);
		pack();
	}
	
	class TFActionListener3 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			int num3 = num1 + num2;
			
			//t3.setText(String.valueOf(num3));
			tf3.setText(""+num3); //将int类型的数打印成String类型的巧妙方法

		}
		
	}
}