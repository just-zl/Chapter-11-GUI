package test_Graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPaint {

	public static void main(String[] args) {
		
		new PaintFrame().launchFrame();
	}

}

class PaintFrame extends Frame { 
	
	public void launchFrame() {
		setVisible(true);
		setBounds(300,200,400,400);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
	}
	
	//��������д���÷����̳���Frame��ĸ��ࣺWindow��
	public void paint(Graphics g) {  //ÿ����Ҫ�ػ�ͼ����ʱ��ϵͳ�Զ�������paint()������ �Ŵ���С����
		
		Color c = g.getColor();  //�ȱ��滭��ԭ������ɫ
		
		//��һ��ʵ����Բ
		g.setColor(Color.GRAY);
		g.fillOval(50, 50, 40, 40);  //��������Ϊ���ᡢ�����ꡢ���о��εĳ���
		
		//��һ��ʵ��������
		g.setColor(Color.PINK);
		g.fillRect(90, 50, 40, 40);
		
		//��һ��ֱ��
		g.setColor(Color.BLACK);
		g.drawLine(50, 60, 130, 60);
		
		g.setColor(c);  //��ԭ����ԭ������ɫ�����õı��ϰ��
	}
}