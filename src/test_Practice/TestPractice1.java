package test_Practice;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

//ʹ��Container��Ƕ��ʵ��ָ���Ĳ���
public class TestPractice1 {

	public static void main(String[] args) {
		
		//�Լ�д�ģ�û�н����ֹ�����ȫ��Ӧ��,���ǲ��ܵ������ڴ�С
		/*Frame f = new Frame("Practice");
		f.setLocation(300, 200);
		f.setVisible(true);
		
		Button b1 = new Button("Button");
		Button b2 = new Button("Button");
		Button b3 = new Button("Button");
		Button b4 = new Button("Button");
		
		//�ϰ벿��
		Panel p1 = new Panel();
		Button b5 = new Button("Button");
		Button b6 = new Button("Button");
		p1.add(b5);p1.add(b6);
		p1.setLayout(new GridLayout(2, 1));
		
		//�°벿��
		Panel p2 = new Panel();
		Button b7 = new Button("Button");
		Button b8 = new Button("Button");
		Button b9 = new Button("Button");
		Button b10 = new Button("Button");
		p2.add(b7);p2.add(b8);p2.add(b9);p2.add(b10);
		p2.setLayout(new GridLayout(2, 2));
		
		
		f.add(b1);f.add(p1);f.add(b2);
		f.add(b3);f.add(p2);f.add(b4);
		
		f.setLayout(new GridLayout(2, 3));
		f.pack();*/
		
		//��Ƶ��Ĵ���
		Frame f = new Frame("FramePractice");
		f.setLayout(new GridLayout(2, 1));
		f.setVisible(true);
		f.setBounds(300,200,300,200);
		
		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new BorderLayout());
		
		Panel p11 = new Panel(new GridLayout(2, 1));
		Panel p21 = new Panel(new GridLayout(2, 2));
		
		//�ϰ벿��
		p1.add(new Button("Button"),BorderLayout.WEST);
		p1.add(new Button("Button"),BorderLayout.EAST);
		p11.add(new Button("Button"));p11.add(new Button("Button"));
		p1.add(p11, BorderLayout.CENTER);
		
		//�°벿��
		p2.add(new Button("Button"),BorderLayout.WEST);
		p2.add(new Button("Button"),BorderLayout.EAST);
		for(int i=0;i<4;i++)  p21.add(new Button("Button"));
		p2.add(p21, BorderLayout.CENTER);
		
		f.add(p1);f.add(p2);
	}

}
