package zenith.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.compiere.model.Sacco;

/**
 * @author MATT
 *
 */
public final class Util {

	public static void main(String[] args) {
		BigDecimal value = BigDecimal.valueOf(76999.999999999998);
		BigDecimal increment = BigDecimal.valueOf(1);
		BigDecimal rounded = round(value, increment, RoundingMode.CEILING);
		System.out.println(rounded.toPlainString());
	}

	public static BigDecimal round(BigDecimal value) {
		Sacco sacco = Sacco.getSaccco();
		BigDecimal increment = sacco.getsaccoroundcurrency();
		return round(value, increment, RoundingMode.HALF_UP);
	}

	public static BigDecimal round(BigDecimal value, BigDecimal increment) {
		return round(value, increment, RoundingMode.HALF_UP);
	}

	private static BigDecimal round(BigDecimal value, BigDecimal increment, RoundingMode roundingMode) {
		if (increment.signum() == 0) {
			// 0 increment does not make much sense, but prevent division by 0
			return value.stripTrailingZeros();
		} else {
			BigDecimal divided = value.divide(increment, 0, roundingMode);
			BigDecimal result = divided.multiply(increment);
			return result.stripTrailingZeros();
		}
	}

}
