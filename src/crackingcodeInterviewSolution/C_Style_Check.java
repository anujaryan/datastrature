package crackingcodeInterviewSolution;

/*C-style strings.A C-style string is simply an array of 
characters that uses a null terminator.A null terminator is
a special character('\0',ascii code 0)used to indicate the end of the string.
More generically,A C-style string is called a null-terminated string*/
public class C_Style_Check {

	public static String checkCStyle(String str) {

		char[] char_arr = new char[str.length()];
		int j = 0;

		for (int i = str.length() - 1; i >= 0; i--) {
			char_arr[j++] = str.charAt(i);
		}

		String result = new String(char_arr);
		System.out.println(" Result String is : " + result + " ************");
		return result;
	}

	public static void main(String[] args) {

		String str = "anuj";
		str += "\0";

		System.out.println(" C style String to reverse " + str + " **************");
		checkCStyle(str);
	}

}
