package mat.mathew;

public class testing {
//testing
	public static void main(String[] ard) {
		double loanBalance = 38000;
		double Principal = 10000;
		while (loanBalance > 0) {
			if (loanBalance == 0)
				break;

			if (loanBalance < Principal) {
				Principal= loanBalance;
			} else {
				 
			}
			System.out.println(Principal);
			loanBalance = loanBalance - Principal;
		} 

	} 
}
