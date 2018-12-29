package test_Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//BorderLayout��Frame��Ĭ�ϲ��ֹ�������BorderLayout �����������Ĳ��ֻ���Ϊ �����������У���ÿ������ֻ�ܷ�һ���齨������ͨ������panel�Ŷ�����
public class TestBorderLayout {

	public static void main(String[] args) {
		
		Frame f = new Frame("TestBorderLayout");
		f.setBounds(300, 200, 400, 400);
		f.setVisible(true);
		
		Button bN = new Button("bN");
		Button bS = new Button("bS");
		Button bC = new Button("bC");
		Button bW = new Button("bW");
		Button bE = new Button("bE");
		
		//��һ
		/*f.add(bN,"North");
		f.add(bS,"South");
		f.add(bC,"Center");
		f.add(bW,"West");
		f.add(bE,"East");*/
		
		//��������Ҫѡ����
		f.add(bN,BorderLayout.NORTH);  //BorderLayout �����������Ĳ��ֻ���Ϊ ������������
		f.add(bS,BorderLayout.SOUTH);
		f.add(bC,BorderLayout.CENTER);
		f.add(bW,BorderLayout.WEST);
		f.add(bE,BorderLayout.EAST);
		
	}

}
