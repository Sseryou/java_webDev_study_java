package ex1_if;

public class Ex_1_if {

	public static void main(String[] args) {
		//제어문(control-statement) : 코드의 흐름을 제어하는 문법
		//-조건문 if, switch
		//-반복문 for, while
		
		//조건문 : 조건에 대하여 명령을 실행할지 않을지 정하는 문법
		
		//기본형
//		if(조건식) {
//			조건식이 참일때 실행할 명령	
//			
//		}
		//조건식 : 참, 거짓을 판별할수 있는식
		
		int n = 50;
		String str = null;
		
		if(n == 50) {
			str = "n은 50입니다.";
		}
		if(n != 50) {
			str = "n은 50이 아닙니다.";
		}
		System.out.println(str);
		
	}

}
