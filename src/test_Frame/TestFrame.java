package test_Frame;

import java.awt.Color;
import java.awt.Frame;

//����һ��ͼ���û����棬���ý��滹û�ж԰����¼�������Ӧ��������ѧ
public class TestFrame {

	public static void main(String[] args) {
		
		Frame f = new Frame("��һ��ͼ���û�����");
		f.setSize(400, 250);
		f.setLocation(500, 200);
		f.setBackground(Color.white);
		f.setVisible(true);  //�Ƿ�ɼ�
		f.setResizable(false);  //�Ƿ���Ըı䴰�ڴ�С
	}

}
