package calculator;

public class Calculator2 {
	
	//���� ���� �͸� Ŭ����
	//�͸� Ŭ������ ���� Ŭ����(inner class)�� ��������
	//�̸��� ���� Ŭ������ ���Ѵ�.
	//���߿� �ٽ� �ҷ��� ������ ���ٴ� ���� �����ϰ� �ִ�.
	//��, ���α׷����� �Ͻ������� ���ǰ� �������� ��ü��� ���� �ȴ�.
	//(��ȸ�� Ŭ����)
	public static void main(String[] args) {
		int num3 = 30;
		
		
		
		
		MyCalculator calc = new MyCalculator() {
			//num3 = 40; //final int num3 ������ ���ȭ
			
			
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
	}
	
	
	

}