package ex4_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		// 컬렉션(collection) : java.util패키지에 있는 인터페이스
		// 배열의 단점을 보완하여 index개수가 정해지지 않은 다수의 객체를
		// 다루기 위해 사용하는 프로그래밍 방식

		// Set, Map, List -> 컬렉션 인터페이스

		// Set 인터페이스를 구현하고 있는 클래스
		// HashSet, TreeSet

		// Set에게 물려받은 추상메서드가 오버라이딩(재정의)이 다 되어있다.
		HashSet<String> hs1 = new HashSet<>();

		// set에 데이터를 추가하는법
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");

		// HashSet에 들어있는 요소의 개수를 보는 메서드
		System.out.println("hs1의 요소의 개수 : " + hs1.size());

		// HashSet은 중복된 데이터를 추가할 수 없다.
		System.out.println(hs1.add("a"));
		hs1.add("b");

		// HashSet에 저장되어있는 데이터를 제거하는 법
		hs1.remove("a");

		// HashSet의 출력
		System.out.println(hs1);

		// HashSet에 저장되어있는 모든 데이터를 제거하는 법
		hs1.removeAll(hs1); // 결과를 논리형으로 반환해준다.
		hs1.clear(); // 삭제하고 반환하는값이 없다.
		System.out.println(hs1);

		// HashSet 객체 hs2를 만들어 1~45까지 난수 6개를 요소로 넣어서 출력하기

		HashSet<Integer> hs2 = new HashSet<>();
//		Random r = new Random();
//		for (int i = hs2.size(); i < 6; i++) {
//			if (hs2.add(r.nextInt(45) + 1) == false) {
//				i--;
//				continue;
//			}
//		}
//		System.out.println(hs2);
		
		while (hs2.size() < 6) {
			int rnd = new Random().nextInt(45)+1;
			
			hs2.add(rnd);
		}
		System.out.println(hs2);
		//index가 없기 때문에 요소 하나하나에 접근을 할 수가 없다는 것
		//Set -> 배열로 변환
		
		
		Integer[] arr = hs2.toArray(new Integer[0]);
		//Integer[0] --> 배열의 방의 갯수를 0으로 잡으면 Set이 add해둔 요소의 개수만큼
		//알아서 방을 만들어준다.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i, arr[i]);
		}

	}
	
	
	
	

}
