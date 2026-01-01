package concurso2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TripleYQuintupleRepeticion {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			boolean b = false;
			Map<String, Integer> m = new HashMap<String, Integer>();
			for (int i = 0; i<n; ++i) {
				String s = sc.next();
				int turno = i%2;
				String k = s + turno;
				int v;
				if (m.containsKey(k))
					v = m.get(k) + 1;
				else
					v = 1;
				
				m.put(k, v);
				
				if (v >= 5) {
					b = true;
					break;
				}

			}
			System.out.println(b ? "SI" : "NO");
		}

	}

}
