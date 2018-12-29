package test_ActionEvent;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//使用文本框实现简单的数值运算,怎么拿到前两个数值是一个问题，因为拿不到另一个类的局部变量。

//法二：持有对方引用，很重要，掌握。门面模式 Facade 
public class Test_TextFieldPractice1 {

	public static void main(String[] args) {
		
		new TFFrame2();

	}

}

class TFFrame2 extends Frame {
	
	TextField tf1,tf2,tf3;  //定义为成员变量
	
	TFFrame2() {
		setLocation(300, 200);
		setVisible(true);
		
		//创建组件
		tf1 = new TextField(5);  //设置文本框的宽度
		Label l = new Label("+");
		tf2 = new TextField(5);
		Button b2 = new Button("=");
		tf3 = new TextField(5);
		
		TFActionListener2 listener = new TFActionListener2(this);  //传的是指向对象的引用
		b2.addActionListener(listener);
		
		setLayout(new FlowLayout());
		add(tf1);add(l);add(tf2);add(b2);add(tf3);
		pack();
	}
}

class TFActionListener2 implements ActionListener {
	
	/*TextField t1,t2,t3;
	TFActionListener2(TextField t1,TextField t2,TextField t3){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}*/
	TFFrame2 tfframe2 = null;
	TFActionListener2(TFFrame2 tfframe2){
		this.tfframe2 = tfframe2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int num1 = Integer.parseInt(tfframe2.tf1.getText());
		int num2 = Integer.parseInt(tfframe2.tf2.getText());
		int num3 = num1 + num2;
		
		//t3.setText(String.valueOf(num3));
		tfframe2.tf3.setText(""+num3); //将int类型的数打印成String类型的巧妙方法

	}
	
}
//法一
/*public class Test_TextFieldPractice {

	public static void main(String[] args) {
		
		new TFFrame2();

	}

}

class TFFrame2 extends Frame {
	
	TFFrame2() {
		setLocation(300, 200);
		setVisible(true);
		
		//创建组件
		TextField tf1 = new TextField(5);  //设置文本框的宽度
		Label l = new Label("+");
		TextField tf2 = new TextField(5);
		Button b2 = new Button("=");
		TextField tf3 = new TextField(5);
		
		TFActionListener2 listener = new TFActionListener2(tf1,tf2,tf3);
		b2.addActionListener(listener);
		
		setLayout(new FlowLayout());
		add(tf1);add(l);add(tf2);add(b2);add(tf3);
		pack();
	}
}

class TFActionListener2 implements ActionListener {
	
	TextField t1,t2,t3;
	TFActionListener2(TextField t1,TextField t2,TextField t3){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		int num3 = num1 + num2;
		
		//t3.setText(String.valueOf(num3));
		t3.setText(""+num3); //巧妙方法

	}
	
}*/
