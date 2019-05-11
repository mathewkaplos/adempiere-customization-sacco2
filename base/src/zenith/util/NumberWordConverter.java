package zenith.util;

import java.math.BigDecimal;

import pl.allegro.finance.tradukisto.MoneyConverters;

public class NumberWordConverter {

	public static final String INVALID_INPUT_GIVEN = "Invalid input given";

	public static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	public static final String[] tens = { "", // 0
			"", // 1
			"twenty", // 2
			"thirty", // 3
			"forty", // 4
			"fifty", // 5
			"sixty", // 6
			"seventy", // 7
			"eighty", // 8
			"ninety" // 9
	};

	public static String getMoneyIntoWords(String input) {
		MoneyConverters converter = MoneyConverters.ENGLISH_BANKING_MONEY_VALUE;
		return converter.asWords(new BigDecimal(input));
	}

	public static String getMoneyIntoWords(final double money) {
		long shilling = (long) money;
		long cents = Math.round((money - shilling) * 100);
		if (money == 0D) {
			return "";
		}
		if (money < 0) {
			return INVALID_INPUT_GIVEN;
		}
		String shillingPart = "";
		if (shilling > 0) {
			shillingPart = convert(shilling) + " shilling" + (shilling == 1 ? "" : "s");
		}
		String centsPart = "";
		if (cents > 0) {
			if (shillingPart.length() > 0) {
				centsPart = " and ";
			}
			centsPart += convert(cents) + " cent" + (cents == 1 ? "" : "s");
		}

		String val = capitalize(shillingPart + centsPart); // MAthew

		return val;

	}

	private static String capitalize(String text) {

		int pos = 0;
		boolean capitalize = true;
		StringBuilder sb = new StringBuilder(text);
		while (pos < sb.length()) {
			if (sb.charAt(pos) == '.') {
				capitalize = true;
			} else if (capitalize && !Character.isWhitespace(sb.charAt(pos))) {
				sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
				capitalize = false;
			}
			pos++;
		}
		return sb.toString();
	}

	private static String convert(final long n) {
		if (n < 0) {
			return INVALID_INPUT_GIVEN;
		}
		if (n < 20) {
			return ones[(int) n];
		}
		if (n < 100) {
			return tens[(int) n / 10] + ((n % 10 != 0) ? " " : "") + ones[(int) n % 10];
		}
		if (n < 1000) {
			return ones[(int) n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		if (n < 1_000_000) {
			return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
		}
		if (n < 1_000_000_000) {
			return convert(n / 1_000_000) + " million" + ((n % 1_000_000 != 0) ? " " : "") + convert(n % 1_000_000);
		}
		return convert(n / 1_000_000_000) + " billion" + ((n % 1_000_000_000 != 0) ? " " : "")
				+ convert(n % 1_000_000_000);
	}

	public static void main(String[] args) {
		System.out.println(getMoneyIntoWords(136643332.500));
	}
}