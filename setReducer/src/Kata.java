import java.util.LinkedList;
import java.util.List;

public class Kata {
  
  public static int setReducer(int[] input) {
	  List<Integer> lista = new LinkedList<Integer>();
	  for (int i = 0; i<input.length; ++i) {
		lista.add(input[i]);
	  }
	  List<Integer> newList = reducer(lista);
	  return newList.get(0);
	  
  }
  
  private static List<Integer> reducer(List<Integer> lista) {
	  if (lista.size() == 1) return lista;
	  List<Integer> newLista = new LinkedList<Integer>();
	  int cont = 1;
	  int[] arr;
	  
	  for (int i = 0; i<lista.size()-1; ++i) {
		  if (lista.get(i)==lista.get(i+1)) {
			  cont++;
		  } else {
			  newLista.add(cont);
			  cont = 1;
		  }
	  }
	  newLista.add(cont);
	  
	  return reducer(newLista);
  }
}