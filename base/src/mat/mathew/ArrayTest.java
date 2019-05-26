package mat.mathew;

import java.util.Arrays;

public class ArrayTest {
	int s_loantype_ID = 0;

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 2 };
		int arr2[] = { 3, 2, 4 };
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.equals(arr1, arr2));
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

////business rules
	// 1,2,7
	//

	// 1,2
	// 7,7

	// 23,31

	// 12,12,12,12,
	/// Charges auto-creation

}
