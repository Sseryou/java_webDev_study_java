package ex5_Abstract;

abstract public class Unit {
	
	
	String name; //�̸�
	int energy; //ü��
	
	public int getEnergy() {
		return energy;
	}
	
	//ĳ���Ͱ� ������ ������ �� ü�� ���ҷ��� ���� ���� �� ������.
	//���� ��� ��� ������ ������ �𸣴ϱ�....�׷��� �߻�޼���� ����
	abstract public void decEnergy();

}