package concurso2025;

import java.util.Scanner;

public class NoMeDaLaVida {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int n = sc.nextInt();
			int t = 0;
			int h = 0;
			int m = 0;
			int s = 0;
			if (n==0) break;
			for (int i = 0; i<n; ++i) {
				t += sc.nextInt();
			}
			h = t/3600;
			m = (t%3600)/60;
			s = t%60;
			System.out.printf("%02d:%02d:%02d%n", h,m,s);
		}

	}

}
