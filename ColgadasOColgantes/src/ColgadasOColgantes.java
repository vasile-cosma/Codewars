import java.util.Scanner;

public class ColgadasOColgantes {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numEntradas = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i<numEntradas; i++) {
			if (sc.nextLine().equalsIgnoreCase("colgadas"))
				System.out.println("Bien");
			else
				System.out.println("Mal");
		}

	}

}
