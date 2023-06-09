package ex2_stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2_Stream {
	public static void main(String[] args) {
		//기본타입형 스트림
		//제네릭을 사용하지 않고 직접적으로 해당 타입의 스트림을 다룰 수 있다.
		//요소의 타입이 T인 스트림은 기본적으로 Stream인데,
		//기본자료형을 다루려면 오토박싱 & 언박싱이 발생하여 비효율성이 증가한다.
		//(Integer <-> int)
		//비효율성을 줄이기 위해 데이터 소스의 요소를 기본형으로 다루는 스트림이 제공된다.
		//IntStream, LongStream, DoubleStream...
		//기본자료형에 유용하게 사용할 수 있는 메서드를 제공한다.
		
		//1~10까지의 총합을 구하는 코드 작성해보기
		
		//range(시작값, 끝값) : 시작값은 포함, 끝값은 미만
		//rangeClosed(시작값, 끝값) : 시작값 포함, 끝값 포함
		int result = IntStream.rangeClosed(1,10).sum();
		System.out.println("1~10 총합 : " + result);
		
		//IntStream ints(시작값, 종료값)시작값 포함, 끝값은 미만
		//LongStream longs(시작값, 종료값)
		//DoubleStream doubles(시작값, 종료값)
		
		Random rnd = new Random();
		IntStream stream = rnd.ints(1,46);//범위정하기
		stream.limit(6).distinct().forEach(System.out::println);
		
		System.out.println();
		
		//두 스트림의 연결 - concat();
		String[] str1 = {"123","456","789"};
		String[] str2 = {"abc","def","ghi"};
		
		Stream<String> stream1 = Stream.of(str1);
		Stream<String> stream2 = Stream.of(str2);
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		stream3.forEach(System.out::print);
		
		
		
		
		
		
	}
	
}
