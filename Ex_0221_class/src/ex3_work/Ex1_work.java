package ex3_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에 소문자 a가 몇개 있는지 판별하는 코드를 구현해보자.
		
		//예시
//		//입력 : asdfasdf
//		//a의 개수 : 2
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("입력 : ");
//		
//		String str = sc.next();
//		
//		int count = 0; //개수를 세줄 변수
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("a의 개수 : " + count);
		
		//회문구하기
		//회문이란 앞으로 읽어도, 뒤로 읽어도 똑같이 읽히는 문장을 말합니다.
		
		//키보드에서 문자열을 입력받은 후 해당 문장이 회문인지 아닌지
		//판단하는 코드를 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String ori = sc.next();
		String rev = "";
		
		for(int i = ori.length()-1; i >= 0; i--) {
			rev+=ori.charAt(i);
		}
		if(ori.equals(rev)) {
			System.out.println(ori + "는(은) 회문입니다.");
		} else {
			System.out.println(ori + "는(은) 회문이 아닙니다.");
		}
		
		
		
		
		
		
		
		
	}

}
