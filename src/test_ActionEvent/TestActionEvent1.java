package test_ActionEvent;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent1 {

	public static void main(String[] args) {
		
		Frame f = new Frame("��ť����¼�");
		f.setLocation(300, 200);
		f.setVisible(true);
		
		Button b = new Button("Press me");
		
		Monitor m = new Monitor();  //��������������
		b.addActionListener(m);  //������ťb
		
		f.add(b);
		f.pack();
	}

}

class Monitor implements ActionListener {  //Monitor��Ϊ����

	@Override
	public void actionPerformed(ActionEvent e) {  //actionPerformed()����һ���ص�����������ϵͳ���õĺ�����
		
		System.out.println("a button has been pressed!");
	}
	
}
