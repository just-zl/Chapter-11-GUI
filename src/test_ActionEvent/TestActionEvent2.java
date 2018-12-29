package test_ActionEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�����ť�����ͬһ������������ʱ������ͨ����ť��setActionCommand()������������
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
		b2.setActionCommand("Game Over");  //b1û������ActionComman(),����b1ʱ������ʾ start
 		
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