
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
	public static int findIt(int[] a) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int num = 0;
		for (int i = 0; i < a.length; ++i) {
			m.put(a[i], m.getOrDefault(a[i], 0) + 1);
		}
		for (int i : m.keySet()) {
			if (m.get(i) % 2 != 0) {
				return i;
			}
		}
		return num;
	}
}
