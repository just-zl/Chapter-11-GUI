package test_ActionEvent;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//点击窗口的“X”，窗口关闭
public class TestWindowEvent {

	public static void main(String[] args) {
		
		new WindowFrame("Test");
	}

}

class WindowFrame extends Frame {
	
	public WindowFrame(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		setBounds(300, 200, 400, 400);
		setVisible(true);
		//addWindowListener(new WindowMonitor());  //法一   内部类
		
		//法二：匿名类  或 局部类
		addWindowListener(new WindowAdapter() {
				
			public void windowClosing(WindowEvent e) {
				
				setVisible(false);
				System.exit(0);
			}
		});
	}
	
	//法一  内部类
	/*class WindowMonitor extends WindowAdapter {  //WindowAdapter实现了WindowListener接口

		public void windowClosing(WindowEvent e) {
			
			//WindowFrame wf = (WindowFrame) e.getSource();
			//wf.setVisible(false);
			setVisible(false);
			System.exit(0);
		}
		
	}*/
}

