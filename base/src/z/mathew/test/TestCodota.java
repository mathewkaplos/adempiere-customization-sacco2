package z.mathew.test;

import java.util.stream.Stream;

public class TestCodota {

	public static void main(String[] args) {
		Integer[] ints = { 1, 3, 4, 6 };
		Stream.of(ints).forEach(x -> System.out.println(x));
		
	}

}
