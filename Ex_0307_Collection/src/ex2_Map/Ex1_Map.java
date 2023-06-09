package ex2_Map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		//Map구조는 키(Key)와 값(value)가 한 쌍의 데이터로 저장됩니다.
		//Map구조는 Key값을 통해 Value값을 검색하기 때문에 많은 양의 데이터를
		//조회하는 데 있어서 매우 뛰어난 성능을 발휘합니다.
		
		//Map은 인터페이스이고 Map인터페이스를 구현하는 클래스 중 많이 사용되는
		//클래스는 HashMap입니다.
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
		//HashMap에 요소를 추가할 때
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
		//map에 저장되는 value값은 중복이 될 수 있다.
		//없는 key값으로 추가를 하면 새롭게 추가가 된다.
		map.put(4, 'A');
		
		//map에 저장되는 key값은 중복이 될 수 없다.
		//기존에 같은 이름을 가진 key가 있다면 value를 갱신한다.
		map.put(1, 'F');
		
		//HashMap의 크기
		System.out.println("map의 크기 : " + map.size());
		
		//HashMap의 요소 제거하기
		//key값을 이용하여 요소를 제거합니다.
		map.remove(3);
		
		//HashMap의 출력
		System.out.println(map);
		
		//HashMap에서 value값을 추출하기
		//key값을 통해 Value값을 가져온다.
		char ch = map.get(1);
		System.out.println("map.get(1) : " + ch);
	}
	

}
