import java.util.HashMap;
import java.util.Map;


public class Kata {
	public static Map<Character, Integer> count(String str) {
		char[] caracteres = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : caracteres) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		return map;
	}
}