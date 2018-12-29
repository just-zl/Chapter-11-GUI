package test_ActionEvent;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//���ø����ֶΣ�����ʵ�ּ���ĳЩ�����ļ�������Ӧ

public class Test_KeyEvent1 {

	public static void main(String[] args) {
		
		new KeyEventFrame("Test"); 
	}

}

class KeyEventFrame extends Frame {
	
	public KeyEventFrame(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		setBounds(300,200,400,400);
		setVisible(true);
		//���ڹر��¼�
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
		TextField tField1 = new TextField("���û� �ϼ�ͷ ��");
		TextField tField2 = new TextField();
		
		
		//����  �ϼ�ͷ   �û��¼�
		tField2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_UP) {  //VK:virtual key
					tField2.setText(tField2.getText() + "   ��֪�����û� �ϼ�ͷ ����");
					System.out.println("ok");
				}
				
			}
		});
		
		add(tField1,BorderLayout.NORTH);
		add(tField2,BorderLayout.CENTER);
	}
}