package string;

/**
 * @author Anuj Pachauri
 *
 *         12:01:11 am
 */
public class MaximumTime {

	public static void main(String[] args) {
		String time = "?4:5?";
		String time1 = "23:5?";// "23:59"
		String time2 = "2?:22";// 23:22
		String time3 = "0?:??";// 09:59
		String time4 = "??:??";// 23:59
		System.out.println(maximumTime(time));
		System.out.println(maximumTime(time1));
		System.out.println(maximumTime(time2));
		System.out.println(maximumTime(time3));
		System.out.println(maximumTime(time4));

		System.out.println(maxTime(time));
		System.out.println(maxTime(time1));
		System.out.println(maxTime(time2));
		System.out.println(maxTime(time3));
		System.out.println(maxTime(time4));
	}

	public static String maxTime(String time) {
		char[] cTime = time.toCharArray(), ans = "23:59".toCharArray();
		ans[0] = cTime[1] != '?' && cTime[1] > '3' ? '1' : ans[0];
		ans[1] = cTime[0] != '?' && cTime[0] < '2' ? '9' : ans[1];
		for (int i = 0; i < cTime.length; ++i) {
			ans[i] = cTime[i] != '?' ? cTime[i] : ans[i];
		}
		return new String(ans);
	}

	/**
	 * @param time
	 * @return
	 */
	private static String maximumTime(String time) {

		char[] arr = time.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '?') {

				if (i == 0 && arr[i + 1] != '?' && Integer.parseInt(String.valueOf(arr[i + 1])) <= 3) {
					sb.append(2);
				} else if (i == 0 && arr[i + 1] != '?' && Integer.parseInt(String.valueOf(arr[i + 1])) > 3) {
					sb.append(1);
				} else if (i == 0 && arr[i + 1] == '?') {
					sb.append(2);
				} else if (i == 1 && arr[i - 1] != '?' && Integer.parseInt(String.valueOf(arr[i - 1])) <= 1) {
					sb.append(9);
				} else if (i == 1 && arr[i - 1] != '?' && arr[i - 1] == '2') {
					sb.append(3);
				} else if (i == 1 && arr[i - 1] == '?') {
					sb.append(3);
				} else if (i == 3 && arr[i + 1] == '?') {
					sb.append(5);
				} else if (i == 4) {
					sb.append(9);
				}
			} else {
				sb.append(arr[i]);
			}
		}

		return sb.toString();
	}

}
