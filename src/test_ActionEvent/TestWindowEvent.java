package test_ActionEvent;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//������ڵġ�X�������ڹر�
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
		//addWindowListener(new WindowMonitor());  //��һ   �ڲ���
		
		//������������  �� �ֲ���
		addWindowListener(new WindowAdapter() {
				
			public void windowClosing(WindowEvent e) {
				
				setVisible(false);
				System.exit(0);
			}
		});
	}
	
	//��һ  �ڲ���
	/*class WindowMonitor extends WindowAdapter {  //WindowAdapterʵ����WindowListener�ӿ�

		public void windowClosing(WindowEvent e) {
			
			//WindowFrame wf = (WindowFrame) e.getSource();
			//wf.setVisible(false);
			setVisible(false);
			System.exit(0);
		}
		
	}*/
}

