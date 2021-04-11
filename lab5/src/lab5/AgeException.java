package lab5;

public class AgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AgeException(String str) {
		super(str);
	}

	static class InvalidAge {
		public static void validate(int age) throws AgeException {
			if (age < 15) {
				throw new AgeException("Invalid Age");
			} else {
				System.out.println("Age is above 15");
			}
		}

		public static void main(String[] args) {
			try {
				validate(10);
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
	}
}
