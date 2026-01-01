package concurso2025;

import java.util.Scanner;

public class GradosCelsius {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		final int MAX = 100; 
		for (int i = 0; i<n; ++i) {
			int x = sc.nextInt();
			System.out.println(MAX-x);
		}

	}

}
