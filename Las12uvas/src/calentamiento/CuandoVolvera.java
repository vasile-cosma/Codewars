package calentamiento;

import java.util.Scanner;

public class CuandoVolvera {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int y = sc.nextInt();
			int n = sc.nextInt();
			if (y == 0 && n == 0)
				break;
			int a1 = y + n * 74;
			int a2 = y + n * 79;
			System.out.println("[" + a1 + " .. " + a2 + "]");
		}
	}
}
