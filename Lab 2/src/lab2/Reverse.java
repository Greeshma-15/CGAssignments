package lab2;

import java.util.Arrays;

public class Reverse {
	public int getSorted(int[] arr) {
		int j = 0;
		int[] result = new int[5];
		for (int i = arr.length - 1; i >= 0; i--) {
			result[j] = arr[i];
			j++;

		}
		Arrays.sort(result);
		for (int a : result) {
			System.out.print(a);
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 9, 5, 8, 1 };
		Reverse r = new Reverse();
		r.getSorted(arr);
	}
}
