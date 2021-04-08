package lab1;

public class Sumofcubes {
	int sum = 0;

	void sumofcubes(int n) {
		for (int i = 1; i <= n; i++) {
			sum += i * i * i;

		}
		System.out.println("Sum of the cubes is" + sum);
	}

	public static void main(String[] args) {
		int n = 3;
		Sumofcubes s = new Sumofcubes();
		s.sumofcubes(n);

	}

}
