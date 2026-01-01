package calentamiento;

import java.util.Scanner;

public class LaFiestaEsAburrida {
public static Scanner sc = new Scanner(System.in);
public static final String COMIENZO = "Hola,";
	public static void main(String[] args) {
		int num = Integer.parseInt(sc.nextLine());
		for (int i = 0; i<num; ++i) {
			StringBuilder sb1 = new StringBuilder(COMIENZO);
			StringBuilder sb2 = new StringBuilder(sc.nextLine());
			sb1.append(sb2.substring(sb2.indexOf(" "))+ ".");
			System.out.println(sb1.toString());
		}

	}

}
