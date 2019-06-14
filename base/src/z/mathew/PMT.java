package z.mathew;

public class PMT {

	public static void main(String[] args) {

		double r = 0.01;
		int n = 12;
		double pmt = Finance.pmt(0.01, 12, 24000);

		double interest = Finance.ipmt(0.01, 1, 12, 24000);

		double pv = FinanceLib.pv(r, 12, pmt, 0, false);
		System.out.println(pv);

		double fv = Finance.fv(0.01, 12, pmt, pv);
		// System.out.println(fv);

		double principal2 = Finance.ppmt(0.01, 11, 12, 24000, 0, 0);
		// System.out.println(pmt);
		System.out.println("principal2:" + principal2);

		double P = 24000;
		double cumulatedPrincipal = 0;
		for (int i = 1; i <= 12; i++) {
			double principal = Finance.ppmt(r, i, n, P);
			double valueRounded = Math.round(principal * 100D) / 100D;
			cumulatedPrincipal = cumulatedPrincipal + valueRounded;
		}

	}

}
