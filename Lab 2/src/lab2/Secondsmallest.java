package lab2;

public class Secondsmallest {
	public int getSecondSmallest(int[] arr) {
		int temp;
		{
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}

			}
		}
		System.out.println(arr[1]);
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 9, 3, 7, 4 };
		Secondsmallest s = new Secondsmallest();
		s.getSecondSmallest(arr);
	}
}
