package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
11:11:43 pm
 */
public class UniqueEmailAddress {

	public static int numUniqueEmails(String emails[]) {

		Set<String> uniEmail = new HashSet<>();
		for (int i = 0; i < emails.length; i++) {
			String email = emails[i];
			int k = email.indexOf('@');
			String local = email.substring(0, k);
			String rest = email.substring(k);
			if (local.contains("+")) {
				int plsIndex = local.indexOf('+');
				local = local.substring(0, plsIndex);

			}
			local = local.replace(".", "");
			uniEmail.add(local + rest);

			}

		return uniEmail.size();
	}

	public static void main(String[] args) {

		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leet+code.com",
				"testemail+david@lee.tcode.com" };

		String[] emails1 = { "test.emailalex@leetcode.com", "test.e.mailbob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };

		// System.out.println(emails[0].replace(".", ""));

		System.out.println(numUniqueEmails(emails1));
	}
}
