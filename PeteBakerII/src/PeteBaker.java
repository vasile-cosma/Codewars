import java.util.Map;
import java.util.Set;

public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
		Set<String> set = recipe.keySet();
		int necesarios;
		int disponibles;
		int tartas = Integer.MAX_VALUE;
		for (String string : set) {
			necesarios = recipe.get(string);
			disponibles = available.getOrDefault(string, -1);
			
			if (disponibles == -1) return 0;
			
			if (tartas > disponibles/necesarios) {
				tartas = disponibles/necesarios;
			}
		}
	  return tartas;
  }
}