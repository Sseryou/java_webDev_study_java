package ex3_text;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex1_JText {
	public static void main(String[] args) {
		JFrame f = new JFrame("JText ����");
		
		f.setBounds(400,400,295,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		f.setLayout(new FlowLayout());
		
		//JLable : �����ӿ� �۾��� �����
		JLabel lb1 = new JLabel("�̸�");
		JLabel lb2 = new JLabel("�ּ�");
		JLabel lb3 = new JLabel("��ȣ");
		lb1.setBackground(Color.YELLOW);
		
		//JTextField : �� ���� Ű���忡�� �Է��� �� �ִ� ����
		JTextField jf = new JTextField(20);
		
		//JTextArea : ���� ���� �Է��� �� �ִ� ����
		JTextArea ja = new JTextArea(7,20);
		ja.setBackground(Color.YELLOW);
		
		//JPassWordField : �Է¹��� ���ڸ� �������� �ʴ� ���
		JPasswordField pf = new JPasswordField(20);
		
		//��� �����ӿ� �߰��ϱ�
		f.add(lb1);
		f.add(jf);
		f.add(lb2);
		f.add(ja);
		f.add(lb3);
		f.add(pf);
		
		
	}
	
}