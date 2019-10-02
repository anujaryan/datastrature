package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Anuj Pachauri
 *
 *         11:19:22 pm
 */
public class DayOfYear {

	public static int dayOfYear(String date) {

		Date inp = null;
		try {
			inp = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inp);
		return cal.get(Calendar.DAY_OF_YEAR);

	}

	public static void main(String[] args) {
		String date = "2019-01-09";
		String date1 = "2019-02-10";
		String date2 = "2003-03-01";
		System.out.println(dayOfYear(date));
		System.out.println(dayOfYear(date1));
		System.out.println(dayOfYear(date2));

		System.out.println("Second of method..");
		System.out.println(daysOfYear(date));
		System.out.println(daysOfYear(date1));
		System.out.println(daysOfYear(date2));

	}

	public static int daysOfYear(String S) {

		String[] s = S.split("-");
		int year = Integer.parseInt(s[0]);

		int month = Integer.parseInt(s[1]);

		int day = Integer.parseInt(s[2]);

		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeapYear = checkLeapYear(year);
		int noOfdays = 0;
		for (int i = 0; i < month - 1; i++) {

			if (isLeapYear && i == 1) {
				noOfdays += days[i];
				continue;
			}
			noOfdays += days[i];
		}

		return noOfdays + day;

	}

	/**
	 * @param year
	 * @return
	 */
	private static boolean checkLeapYear(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;

		return false;
	}

}
