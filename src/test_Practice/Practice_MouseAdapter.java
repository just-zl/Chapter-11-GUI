package test_Practice;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

//Ĭд��껭Բ
public class Practice_MouseAdapter {

	public static void main(String[] args) {
		
		new MouseFrame("Test");
	}

}

class MouseFrame extends Frame {
	
	ArrayList<Point> points = null;
	
	MouseFrame(String s) {
		
		super(s);
		setBounds(300, 200, 400, 400);
		setBackground(Color.GRAY);
		setVisible(true);
		
		addMouseListener(new MouseMonitor2());
		
		points = new ArrayList<>();
	}
	
	public void paint(Graphics g) {
		
		Iterator<Point> i = points.iterator();
		while(i.hasNext()) {
			Point p = i.next();
			g.setColor(Color.PINK);
			g.drawOval(p.x, p.y, 15, 15);
		}
	}
	
	public void addPoint(Point p) {
		
		points.add(p);
	}
}

class MouseMonitor2 extends MouseAdapter {
	
	public void mousePressed(MouseEvent e) {
		
		MouseFrame mf = (MouseFrame) e.getSource();
		mf.addPoint(new Point(e.getX(), e.getY()));
		mf.repaint();
	}
}
