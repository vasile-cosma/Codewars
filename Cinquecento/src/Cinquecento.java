import java.util.Scanner;

public class Cinquecento {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numEntradas = Integer.parseInt(sc.nextLine());
		int entrada;

		for (int i = 0; i < numEntradas; i++) {
			entrada = Integer.parseInt(sc.nextLine());
			System.out.println((entrada-1)/100+1); 
		}
	}

}
