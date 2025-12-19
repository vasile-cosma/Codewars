import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ninots {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int votos = sc.nextInt();
		while (votos!=0) {
			Map<String, Integer> a = new HashMap<String, Integer>();
			Map<String, Integer> m = new HashMap<String, Integer>();
			
			for (int i = 0; i<votos; i++) {
				String nom = sc.next();
				if (nom.equals(nom.toLowerCase())) 
					m.put(nom, m.getOrDefault(nom, 0)+1);
				else
					a.put(nom, m.getOrDefault(nom, 0)+1);
			}
			
		}
	}
	
	private static String ganador(Map<String, Integer> m, boolean infantil) {
		int max = 0;
		String ganador;
		boolean empate;
		
		
	}
}
