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
	
	//方法的重写，该方法继承自Frame类的父类：Window类
	public void paint(Graphics g) {  //每次需要重画图案的时候，系统自动给调用paint()方法。 放大、缩小……
		
		Color c = g.getColor();  //先保存画笔原来的颜色
		
		//画一个实心椭圆
		g.setColor(Color.GRAY);
		g.fillOval(50, 50, 40, 40);  //参数依次为：横、纵坐标、外切矩形的长宽
		
		//画一个实心正方形
		g.setColor(Color.PINK);
		g.fillRect(90, 50, 40, 40);
		
		//画一条直线
		g.setColor(Color.BLACK);
		g.drawLine(50, 60, 130, 60);
		
		g.setColor(c);  //还原画笔原来的颜色。良好的编程习惯
	}
}