package ex1_computer;

public class Computer {
	//Ŭ������ �� �� �ִ� ��� : ����, �Լ�
	
	float cpu = 4.8f;
	int ram = 64;
	int ssd = 1024;
	String color = "white";
	
	//�޼���� �޼��� �ȿ��� ������ �� ����.
	//main �Լ��� �޼����̱� ����
	
	//��ǻ���� ������ ��ȯ�� �޼��带 ����� ����.
	//�ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� �ݵ�� �ʿ��� ����
	//���� ���Ǵ� ������ �ڵ带 �޼���� �ۼ��صΰ� �ʿ��Ҷ����� ȣ�⸸ �ϸ� �ȴ�.
	
	
	public void getInfo() {
		System.out.println("cpu : " + cpu);
		System.out.println("ram : " + ram);
		System.out.println("ssd : " + ssd);
		System.out.println("color : " + color);
		System.out.println("---------------------------");
	}
	
	//�⺻��
	//���������� ��ȯ�� �Լ���(�Ķ����){ //�Ķ���Ϳ��� ����, �迭, ��ü�� ������� �� �ִ�.
	//	����1;
	//	����2;
	//	return ���ϰ�;(�������ٰ� ���ٸ� ���� ����)
	//}
	
	//���������ڿ��� public, protected, default, private
	//�� ������ �ֽ��ϴ�.
	//1. pubilc : ��� ������ ���, ���� ������Ʈ ���� ��� ��ü����
	//����� �� �ֵ��� ���
	//2. private : ���� Ŭ���� �������� ����� �㰡
	//3. protected : ��Ӱ����� ��ü�鿡�� ����� �㰡
	//4. default : ���� ��Ű������ ��ü���� ����� �㰡(�ƹ��͵� ���� ������ default)
	
	//��ȯ��
	//��ȯ���� �޼��尡 ó������ ������ ������ ��ģ�� 
	//��ȯ�ؾ��� ���� �ִ°�� ����
	//int, float, double, char, boolean��
	//�⺻ �ڷ� �Ӹ� �ƴ϶� String Ȥ�� ����ڰ� ���� ��ä�ε�
	//��ȯ�� ����, �ƹ��͵� ��ȯ���� �������� void
	//��ȯ���� ��ȯ���ִ� ���� �ڷ����� ��ġ�մϴ�.
	
	
	//�Ķ����(�Ű�����, ����, �ƱԸ���)
	//�Ķ���ʹ� �ܺο��� �ش� �޼��带 ���� Ư�� ���� �����ϰ��� �� ��,
	//�� Ư�� ���� �޾Ƽ� �Լ� �ȿ��� ó���� �� �ֵ��� �ϴ� ����
	
	//�޼����(�Լ���)
	//�޼������ �� �״�� �޼����� �̸�(ù������ �ҹ��ڷ� ����)
	
	
}