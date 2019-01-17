package z.mathew;

public class AmountInWords {

	public static void main(String[] args) {
		double one = 123.20;
		String WholeNumber = "", Decimal = "";
		String StringOfOne = Double.toString(one);
		int decimalIndex = StringOfOne.lastIndexOf(".");
		if (one % 1 == 0) {
			WholeNumber = StringOfOne.substring(0, decimalIndex);
			System.out.println(WholeNumber);
		}
		else {
			WholeNumber = StringOfOne.substring(0, decimalIndex);
			Decimal = StringOfOne.substring(decimalIndex + 1, StringOfOne.length())
					+ StringOfOne.substring(StringOfOne.length());
			System.out.println(WholeNumber);
			System.out.println(Decimal);
		}
		
		outputWholeAndDecimal();
		outputWhole();

	}

	private static void outputWhole() {

	}

	private static void outputWholeAndDecimal() {

	}

}
