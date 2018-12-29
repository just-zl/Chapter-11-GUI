package test_ActionEvent;

//文本框事件监听
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_TextFieldActionEvent {

	public static void main(String[] args) {
		
	new TFFrame();

	}

}

class TFFrame extends Frame {
	
	TFFrame(){
		super("TEST");
		setVisible(true);
		setLocation(300, 200);
		
		TextField tf = new TextField();
		
		TFActionListener listener = new TFActionListener();
		tf.addActionListener(listener);
		
		tf.setEchoChar('*');  //设置回显字符，在文本框中输入的内容，会以该字符显示，但是实际输入的东西会显示到控制台
		
		add(tf);
		pack();
		
	}
}

class TFActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TextField tf = (TextField) e.getSource();  //获取事件源，得到的是一个Object对象，需要强制转换成TextField对象
		System.out.println(tf.getText());  //将 从键盘上输入到文本框中的内容 打印到控制台
		tf.setText("");  //每在键盘上敲一个回车，将文本框设为空
	}
	
}
