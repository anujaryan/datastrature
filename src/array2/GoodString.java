package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         11:00:58 pm
 */
public class GoodString {

	public static int countCharacters(String words[], String chars) {

		int wordlen = 0;
		for (String word : words) {

			char wordchar[] = word.toCharArray();
			boolean isGoodString = true;
			for (char c : wordchar) {
				if (chars.indexOf(c) == -1) {
					isGoodString = false;
					break;
				}
			}
			if (isGoodString) {
				wordlen += word.length();
			}

		}

		return wordlen;
	}

	public static void main(String[] args) {

		String[] words = { "cat", "bt", "hat", "tree" };
		String chars = "atach";
		String words1[] = { "hello", "world", "leetcode" };
		String chars1 = "welldonehoneyr";

		String[] words3 = {
				"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
				"ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb", "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
				"boygirdlggnh", "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx",
				"nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop",
				"hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx",
				"juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo",
				"oxgaskztzroxuntiwlfyufddl",
				"tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp",
				"qnagrpfzlyrouolqquytwnwnsqnmuzphne", "eeilfdaookieawrrbvtnqfzcricvhpiv",
				"sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz", "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue",
				"hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv",
				"cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo", "teyygdmmyadppuopvqdodaczob",
				"qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs",
				"qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs" };
		String chars3 = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";

		System.out.println(countCharacters(words, chars));
		System.out.println(countCharacters(words1, chars1));

		System.out.println(countCharacters(words3, chars3));

		System.out.println(countCharacters1(words, chars));
		System.out.println(countCharacters1(words1, chars1));

		System.out.println(countCharacters1(words3, chars3));
	}

	public static int countCharacters1(String words[], String chars) {

		int c[] = new int[128];
		for (char chr : chars.toCharArray()) {
			c[chr]++;
		}

		int wordlen = 0;
		for (String word : words) {
			int c2[] = Arrays.copyOf(c, 128);
			char wordchar[] = word.toCharArray();
			boolean isGoodString = true;
			for (char chr : wordchar) {
				c2[chr]--;

				if (c2[chr] < 0) {
					isGoodString = false;
					break;
				}
			}
			if (isGoodString) {
				wordlen += word.length();
			}

		}

		return wordlen;
	}

}
