package solucion;

public class OppositesAttract {
	public static boolean isLove(final int flower1, final int flower2) {
		if (flower1%2 == 0) {
			if (flower2%2 == 0) 
				return false;
			else 
				return true;
		} else {
			if (flower2%2 == 0)
				return true;
			else
				return false;
		}
	  }
}
