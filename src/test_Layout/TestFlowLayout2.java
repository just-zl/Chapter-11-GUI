package test_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestFlowLayout2 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("���ֹ�����2");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,40));  //���ң�����
		frame.setBounds(300, 200, 400, 400);
		frame.setVisible(true);
		
		for(int i=0;i<7;i++) {
			frame.add(new Button("Button" + i));
		}
	}

}
