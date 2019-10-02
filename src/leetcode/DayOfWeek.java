package leetcode;

/**
 * @author Anuj Pachauri
 *
 *         3:57:30 am
 */
public class DayOfWeek {

	public static int is_leap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static String dayOfTheWeek(int day, int month, int year) {

		int m[][] = { { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

		String arr[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int ret = 4;
		for (int i = 1971; i < year; i++) {
			int k = is_leap(i);
			for (int j = 1; j <= 12; j++)
				ret += m[k][j];
		}
		int k = is_leap(year);
		for (int i = 1; i < month; ++i) {
			ret += m[k][i];
		}
		ret += day;
		ret %= 7;

		return arr[ret];

	}

	public static void main(String[] args) {
		int day = 31, month = 8, year = 2019;// "Saturday"
		int day1 = 18, month1 = 7, year1 = 1999; // "Sunday"
		int day2 = 15, month2 = 8, year2 = 1993; // "Sunday"
		System.out.println(" Day Of week .." + dayOfTheWeek(day, month, year));
	}
}
