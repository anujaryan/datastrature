/**
02-Aug-2019
Dell

 * 
 */
package exception;

/**
 * @author Dell
 *
 *         11:00:35 pm
 */
public class ExceeptionTest {

	public static String test() {

		try {
			String str = null;
			return str.toString();
		} finally {
			return "Hello World";
		}
	}

	public static void main(String[] args) throws InvalidAgeException {

		// System.out.println(test());
		Licence li = new Licence();
		li.generateLicence(14);

	}

}

class Licence {

	public void generateLicence(int age) throws InvalidAgeException {

		try {
			if (age < 15) {
				throw new InvalidAgeException("Invalid Age..");
			}

			if (age > 15 && age < 18) {
				throw new InvalidAgeException("Age must be Above 18");
			}

		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			e.fillInStackTrace();
		}

	}

}

class InvalidAgeException extends Throwable implements AutoCloseable {

	InvalidAgeException(String msg) {
		super(msg);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.AutoCloseable#close()
	 */
	@Override
	public void close() throws Exception {

	}
}