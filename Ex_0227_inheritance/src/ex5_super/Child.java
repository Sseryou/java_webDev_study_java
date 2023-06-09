package ex5_super;

public class Child extends Parent{
	
	public Child(int n) {
		//super : 부모클래스
		super(n); //부모클래스의 생성자가 생략이 되어있다.
		//부모생성자에 파라미터가 있다면 부모생성자를 생략할 수 없다.
		System.out.println("자식(Child)클래스");
	}
	
	@Override
	public int result() {
		return super.result();
	}

}
