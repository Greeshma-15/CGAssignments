package lab1;

public class Sumofthreeandfive {
	public int calculatesum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Sumofthreeandfive s = new Sumofthreeandfive();
		System.out.println(s.calculatesum(5));

	}

}
