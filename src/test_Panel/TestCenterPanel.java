package test_Panel;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

//��Panel�����Զ���ʾ��Frame��������м�
public class TestCenterPanel {

	public static void main(String[] args) {
	
		MyFrame3 frame = new MyFrame3("CentetPanel", 300, 200, 500, 400, Color.blue);
	}

}

class MyFrame3 extends Frame {
	
	private Panel panel = new Panel(null);
	
	MyFrame3(String frameName, int x,int y, int width, int height ,Color color) {
		
		super(frameName);
		setBounds(x, y, width, height);
		setBackground(color);
		setVisible(true);
		setLayout(null);  //���ֹ���������
		
		panel.setBounds(width/4, height/4, width/2, height/2);
		panel.setBackground(Color.yellow);
		
		add(panel);
	} 
}
