/**
08-Aug-2019
Dell

 * 
 */
package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author Dell
 *
 *         1:35:34 am
 */
public class TopKFrequentWords {

	public static List<String> topkFrequent(String[] words, int k) {

		Map<String, Integer> smap = new HashMap<>();
		for (String s : words)
			smap.put(s, smap.getOrDefault(s, 0) + 1);

		Map<Integer, PriorityQueue<String>> treemap = new TreeMap<>(Collections.reverseOrder());

		for (String s : smap.keySet()) {
			treemap.putIfAbsent(smap.get(s), new PriorityQueue<>());
			treemap.get(smap.get(s)).add(s);

		}

		List<String> kwords = new ArrayList<String>();
		for (Integer i : treemap.keySet()) {

			while (!treemap.get(i).isEmpty() && k-- > 0) {
				kwords.add(treemap.get(i).poll());
			}
			if (k == 0)
				break;
		}

		return kwords;
	}

	public static void main(String[] args) {

		String words[] = { "i", "love", "leetcode", "i", "love", "coding" };
		int k = 2;

		List<String> list = topkFrequent(words, k);
		list.stream().forEach(s -> System.out.println(s));

	}
}
