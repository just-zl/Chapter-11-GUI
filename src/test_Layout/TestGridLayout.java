package test_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

//GridLayout�Ͳ��ֹ��������ռ仮�ֳɹ���ľ�������ÿ����Ԫ�������С��ȣ��������ӵ�ÿ����Ԫ���У��������ҡ�����������䡣
//��GridLayout���췽����ָ���ָ������������
public class TestGridLayout {

	public static void main(String[] args) {
		
		Frame f = new Frame("TestGridLayout");
		f.setVisible(true);
		/*Button b1 = new Button("Button");
		Button b2 = new Button("Button");
		Button b3 = new Button("Button");
		Button b4 = new Button("Button");
		Button b5 = new Button("Button");
		Button b6 = new Button("Button");*/
		for(int i=1;i<6;i++) {
			f.add(new Button("Button" + i));
		}
		
		f.setLayout(new GridLayout(3, 2));
		f.setLocation(300, 200);
		f.pack();  //����f�Ĵ�С�պý����������
	}

}
