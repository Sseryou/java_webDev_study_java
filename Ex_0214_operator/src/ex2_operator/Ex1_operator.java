package ex2_operator;

public class Ex1_operator {

	public static void main(String[] args) {
		//연산자 : 연산기능이 있는 문자
		
		//1. 최고연산자 : . ()
		//2. 증감연산자 : ++ --
		//3. 산술연산자 : +, -, *, /(몫을 구함), %(모듈러, 나머지를 구하는 연산자)
		//4. 시프트연산자 : >>, <<, >>>
		//5. 비교연산자 : <, >, <=, >=, ==, !=
		//6. 비트연산자 : &, |, ^, ~
		//7. 논리연산자 : &&, ||, !
		//8. 삼항(조건)연산자 : ?, :
		//9. 대입연산자 : =, +=, -=, *=, /=, %=
		
		//산술연산자
		//산술연산자는 4칙연산과 나머지를 구분하는 연산자(%)로 나뉜다.
		int n1, n2, n3;
		n1 = 20;
		n2 = 7;
		
		n3 = n1+n2;
		System.out.println("n3의 값 : " + n3);
		
		n3 = n1-n2;
		System.out.println("n3의 값 : " + n3);
		
		n3 = n1/n2;
		System.out.println("n3의 값 : " + n3);
		
		n3 = n1%n2;
		System.out.println("n3의 값 : " + n3);
		//1. 홀짝 구할 때
		//2. 배수 구할 때
	}

}
