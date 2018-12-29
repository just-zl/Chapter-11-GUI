package test_ActionEvent;

//�ı����¼�����
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_TextFieldActionEvent {

	public static void main(String[] args) {
		
	new TFFrame();

	}

}

class TFFrame extends Frame {
	
	TFFrame(){
		super("TEST");
		setVisible(true);
		setLocation(300, 200);
		
		TextField tf = new TextField();
		
		TFActionListener listener = new TFActionListener();
		tf.addActionListener(listener);
		
		tf.setEchoChar('*');  //���û����ַ������ı�������������ݣ����Ը��ַ���ʾ������ʵ������Ķ�������ʾ������̨
		
		add(tf);
		pack();
		
	}
}

class TFActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TextField tf = (TextField) e.getSource();  //��ȡ�¼�Դ���õ�����һ��Object������Ҫǿ��ת����TextField����
		System.out.println(tf.getText());  //�� �Ӽ��������뵽�ı����е����� ��ӡ������̨
		tf.setText("");  //ÿ�ڼ�������һ���س������ı�����Ϊ��
	}
	
}
