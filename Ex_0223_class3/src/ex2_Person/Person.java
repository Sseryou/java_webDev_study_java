package ex2_Person;

public class Person {
	
	//사람마다 이름, 나이, 전화번호가 다 다르기 때문에
	//미리 설정할 수 없다.
	//this : 여기(현재 클래스)
	
	//전역변수와 지역변수의 이름이 같기 때문에 this를 꼭 적어줘야 한다.
	//메서드 안에선 지역변수가 우선순위이기때문에!
	
	private int age;
	private String name, tel;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setproperty(int a) {
		age = a;
		
	}
	
	
	
}
