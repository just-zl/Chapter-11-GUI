package test_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

//��᲼�ֹ�����������.FlowLayout��Panel���Ĭ�ϲ��ֹ�����
public class TestFlowLayout1 {

	public static void main(String[] args) {
		
		Frame f = new Frame("FLowLayout");
		
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		
		f.setLayout(new FlowLayout());  //���֮�䣬ʹ��ȱʡ�ľ��ж��뷽ʽ��ˮƽ�ʹ�ֱ���Ϊȱʡֵ��5��
		//f.setLayout(new FlowLayout(FlowLayout.RIGHT));  //�봰���Ҷ���
		f.add(button1);
		f.add(button2);
		f.add(button3);
		
		f.setBounds(300, 200, 200, 200);
		f.setVisible(true);
		
	}

}
