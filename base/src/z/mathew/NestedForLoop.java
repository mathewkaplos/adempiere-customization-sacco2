package z.mathew;

public class NestedForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; ++i) {

			// codes inside the body of outer loop

			for (int j = 1; j <= 10; ++j) {
				// codes inside the body of both outer and inner loop
				System.out.println(i + "--" + j);
			}

			// codes inside the body of outer loop
		}

		outerloop: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i * j > 6) {
					System.out.println("Breaking");
					break outerloop;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("Done");
	}

}
