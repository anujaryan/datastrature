package leetcode;

public class FirstBadVersion extends VersionControl {

	public static int firstBadVersion(int n) {

		for (int i = 1; i <= n; i++) {
			if (isBadVersion(i)) {
				return i;
			}
		}

		return 0;
	}

	public static int firstBadVersion1(int n) {

		int res = findbadVersion(n, 0, n);
		return res;
	}

	private static int findbadVersion(int n, int start, int end) {
		int res = -1;
		if (start == end)
			return start;

		int mid = start + (end - start) / 2;
		if (isBadVersion(mid)) {
			res = findbadVersion(n, start, mid);
			if (res != -1)
				return res;
		} else {
			res = findbadVersion(n, mid + 1, end);
			if (res != -1)
				return res;
		}

		return res;
	}

	public static void main(String[] args) {

		int n = 5;
		System.out.println("First Bad version is :" + firstBadVersion1(n));

	}
}

class VersionControl {
	public static boolean isBadVersion(int i) {
		if (i >= 4) {
			return true;
		} else {
			return false;
		}

	}
}