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

//ʹ���ڲ�����Test_TextFieldPractice1�������

public class Test_TextFieldPractice2 {

	public static void main(String[] args) {
		
		new TFFrame3();
	}

}

class TFFrame3 extends Frame {  //TFFrame3������װ�� 
	
	TextField tf1,tf2,tf3;  //����Ϊ��Ա����
	
	TFFrame3() {
		setLocation(300, 200);
		setVisible(true);
		
		//�������
		tf1 = new TextField(5);  //�����ı���Ŀ��
		Label l = new Label("+");
		tf2 = new TextField(5);
		Button b2 = new Button("=");
		tf3 = new TextField(5);
		
		//���ڹرռ���
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
		TFActionListener3 listener = new TFActionListener3();  //������ָ����������
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
			tf3.setText(""+num3); //��int���͵�����ӡ��String���͵������

		}
		
	}
}