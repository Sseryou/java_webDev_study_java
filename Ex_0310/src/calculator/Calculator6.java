package calculator;

import java.util.ArrayList;

public class Calculator6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" , ");
		}
		
		//향상된 for문
		for(String name : list) {
			System.out.println(name + " , ");
			
		}
		
		//forEach() 사용하여 출력하기
		list.forEach(x -> System.out.println(x+ " , "));
		
		
	}

}
