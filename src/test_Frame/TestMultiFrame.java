package test_Frame;

import java.awt.Color;
import java.awt.Frame;

//�����������
public class TestMultiFrame {

	public static void main(String[] args) {
		
		MyFrame myFrame1 = new MyFrame(200, 200, 200, 200, Color.white);
		MyFrame myFrame2 = new MyFrame(400, 200, 200, 200, Color.gray);
		MyFrame myFrame3 = new MyFrame(200, 400, 200, 200, Color.gray);
		MyFrame myFrame4 = new MyFrame(400, 400, 200, 200, Color.white);
	}

}

class MyFrame extends Frame {  //�ܼ̳оͼ̳У����������Լ��ĳ�Ա����
	
	static int id = 0;
	MyFrame(int x,int y,int width,int height,Color color) {
		
		super("MyFrame" + (++id));  //����Frame�Ĵ������Ĺ��췽��
		setBounds(x, y, width, height);
		setBackground(color);
		setLayout(null);
		setVisible(true);
	}
}