package lab1;

public class Difference {
	public int calculatedifference(int n) {
		int diff;
		int sumsq = 0;
		int sqsum = 0;
		for (int i = 1; i <= n; i++) {
			sqsum += i * i;
			sumsq += i;
		}
		sumsq = sumsq * sumsq;

		diff = (sumsq - sqsum);
		return diff;
	}

	public static void main(String[] args) {
		Difference d = new Difference();
		System.out.println(d.calculatedifference(5));
	}

}
