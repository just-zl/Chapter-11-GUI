package test_ActionEvent;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//运用各种手段，试着实现键盘某些按键的监听及响应

public class Test_KeyEvent1 {

	public static void main(String[] args) {
		
		new KeyEventFrame("Test"); 
	}

}

class KeyEventFrame extends Frame {
	
	public KeyEventFrame(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		setBounds(300,200,400,400);
		setVisible(true);
		//窗口关闭事件
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
		TextField tField1 = new TextField("请敲击 上箭头 键");
		TextField tField2 = new TextField();
		
		
		//键盘  上箭头   敲击事件
		tField2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_UP) {  //VK:virtual key
					tField2.setText(tField2.getText() + "   我知道你敲击 上箭头 键了");
					System.out.println("ok");
				}
				
			}
		});
		
		add(tField1,BorderLayout.NORTH);
		add(tField2,BorderLayout.CENTER);
	}
}