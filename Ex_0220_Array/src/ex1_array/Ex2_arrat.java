package ex1_array;

public class Ex2_arrat {

	public static void main(String[] args) {
		
		//마지막 인덱스 번호는 x - 1이다.
		char ch[];
		ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!'; 없는 index에 값을 넣으려고할때는 오류가 난다.
		
		//배열의 내용 출력
		for(int i = 0; i < ch.length; i++) {
			System.out.printf("ch[%d] : %c\n", i, ch[i]);
			
		}
		System.out.println(ch); //문자형배열은 배열명으로 출력하는게 가능하다.
		
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();
		//System.out.println(str); 배열명으로 출력하는것이 불가능하다.
		

	}

}
