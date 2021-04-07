package lab1;

public class Increasingnumber {
	public boolean checknumber(int n) {
		int num;
		boolean flag = true;
		while (n > 0) {
			num = n % 10;
			n = n / 10;
			if (num < n % 10) {
				flag = false;
				break;
			}
			num = n % 10;
			n = n % 10;
		}
		return flag;
	}

	public static void main(String[] args) {
		int n = 321;
		Increasingnumber in = new Increasingnumber();
		System.out.println(in.checknumber(n));
	}
}
