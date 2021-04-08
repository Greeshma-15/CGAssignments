package lab2;

import java.util.Arrays;

public class Duplicate {
	public static int modifyarray(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
			}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int a[] = {6,6,7,2,4,5,3,5,7,2};
		Arrays.sort(a);
		int len = a.length;
		len = modifyarray(a, len);
		for (int i = 0; i < len; i++)
			System.out.print(a[i] + "");

	}

}
