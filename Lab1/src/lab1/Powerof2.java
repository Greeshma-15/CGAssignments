package lab1;

public class Powerof2 {
	public boolean checknumber(int n) {
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return true;
		} else {

		}
		return false;

	}

	public static void main(String[] args) {
		int n = 8;
		Powerof2 pf = new Powerof2();
		System.out.println(pf.checknumber(n));

	}

}
