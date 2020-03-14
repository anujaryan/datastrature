package array3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
11:03:18 pm
 */
public class SubDomainVisit {


	public static List<String> subDomainVisits(String[] cpdomains) {
		
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		for (String str : cpdomains) {

			String[] domain = str.split("\\s");
			
			int fcount= Integer.valueOf(domain[0]);
			String[] subDomain = domain[1].split("\\.");

			String cur = "";


			for (int i = subDomain.length - 1; i >= 0; i--) {

				cur = subDomain[i] + (i < subDomain.length - 1 ? "." : "") + cur;
				map.put(cur, map.getOrDefault(cur, 0) + fcount);
				
				
			}

		}
		
		for (String key : map.keySet()) {
			list.add("" + map.get(key) + " " + key);
		}

		return list;

	}

	public static void main(String[] args) {

		String[] cpdomains={"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		subDomainVisits(cpdomains).forEach(x -> System.out.println(x));
	}
}
