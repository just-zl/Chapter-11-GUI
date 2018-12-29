package test_ActionEvent;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

//在Frame窗口里，点击任意坐标，就在Frame里根据获取到的坐标作为圆的外切矩形的左上角坐标，画圆
public class TestMouseAdapter {

	public static void main(String[] args) {
		
		new MyFrame8("Test"); 
	}

}

class MyFrame8 extends Frame {
	
	ArrayList<Point> points = null;  //创建一个 点 容器 
	
	MyFrame8(String s) {
		super(s);
		setBounds(300,200,400,400);
		setVisible(true);
		setBackground(Color.gray);
		setLayout(null);
		points = new ArrayList<>();
		
		//窗口关闭监听
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
		addMouseListener(new MouseMonitor());
	}
	

	//根据获取到的坐标作为圆的外切矩形的左上角坐标，画圆
	public void paint(Graphics g) {  //方法的重写，该方法继承自Frame类的父类：Window类
		Iterator<Point> i = points.iterator();
		while(i.hasNext()) {
			Point p = (Point)i.next();
			g.setColor(Color.GREEN);
			g.drawOval(p.x,p.y,15,15);
		
		}
	}
	
	public void addPoint(Point p) {  //添加点对象到容器里
		points.add(p);
	}
}

class MouseMonitor extends MouseAdapter {  //MouseAdapter实现了MouseListener接口，并已经重写了接口里的方法，用MouseAdapter会更方便
	
	public void mousePressed(MouseEvent e) {  //重写MouseListener里的方法
		MyFrame8 myFrame = (MyFrame8)e.getSource();
		myFrame.addPoint(new Point(e.getX(), e.getY()));  //通过返回的MouseEvent对象，获取当前鼠标点击的坐标
		myFrame.repaint();  //强制重画，相当于刷新，十分重要的一条语句.repaint->update->paint双缓冲
	}
}
