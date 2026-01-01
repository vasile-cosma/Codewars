package concurso2025;

import java.util.Scanner;

public class LigasEscolares {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long c = sc.nextInt();
		for (int i = 0; i < c; ++i) {
			long n = sc.nextInt();
			long e = sc.nextInt();
			long t = factorial(n) / (factorial(e) * factorial(n - e));
			System.out.println(t);
			// Bien pero se desborda, tengo que aprender a usar BIG INTEGER
		}

	}

	private static long factorial(long x) {
		long factorial = 1;
		for (long i = 2; i <= x; ++i) {
			factorial *= i;
		}
		return factorial;
	}

}
