/**
25-Aug-2019
Anuj Pachauri

 * 
 */
package string;

/**
 * @author Anuj Pachauri
 *
 *         1:28:21 pm
 */
public class DefanginIP {

	public static String defangIpAdd(String ipaddress) {

		StringBuilder sb = new StringBuilder();

		for (Character ch : ipaddress.toCharArray()) {

			switch (ch) {
			case '.':
				sb.append("[.]");

				break;

			default:
				sb.append(ch + "");
				break;
			}
		}

		return sb.toString();

	}

	public static void main(String str[]) {

		String ipaddress = "192.123.192.124";

		System.out.println("After Defanging Ip Address.. " + defangIpAdd(ipaddress));

	}

}
