/**
24-Aug-2019
Anuj Pachauri

 * 
 */
package array;

/**
 * @author Anuj Pachauri
 *
 *         5:35:30 pm
 */
public class MountainArray {

	public static boolean validateMountainArray(int A[]) {

		int n = A.length;
		int i = 0;
		while (i + 1 < n && A[i] < A[i + 1]) {
			++i;
		}
		if (i == 0 || i == n - 1) {
			return false;
		}
		while (i + 1 < n && A[i] > A[i + 1]) {
			++i;
		}
		return i == n - 1;
	}

	public static void main(String[] args) {

		int A[] = { 1, 2 };
		int A1[] = { 3, 5, 5 };
		int A2[] = { 0, 3, 2, 1 };
		int A3[] = { 0, 1, 2, 1, 2 };
		int A4[] = { 2, 1, 2, 3, 5, 7, 9, 10, 12, 14, 15, 16, 18, 14, 13 };
		int A5[] = { 0, 1, 2, 4, 2, 1 };
		System.out.println("is Moutain in Arrays ... " + validateMountainArray(A));

		System.out.println("is Moutain in Arrays ... " + validateMountainArray(A1));

		System.out.println("is Moutain in Arrays ... " + validateMountainArray(A2));

		System.out.println("is Moutain in Arrays ... " + validateMountainArray(A3));
		System.out.println("is Moutain in Arrays ... " + validateMountainArray(A4));
		System.out.println("is Moutain in Arrays ... " + validateMountainArray(A5));
	}

}
