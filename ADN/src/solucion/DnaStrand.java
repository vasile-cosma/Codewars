package solucion;

public class DnaStrand {
	public static String makeComplement(String dna) {
		StringBuilder sb = new StringBuilder(dna);
		for (int i = 0; i < dna.length(); i++) {
			switch (sb.charAt(i)) {
			case 'A':
				sb.setCharAt(i, 'T');
				break;
			case 'T':
				sb.setCharAt(i, 'A');
				break;
			case 'C':
				sb.setCharAt(i, 'G');
				break;
			case 'G':
				sb.setCharAt(i, 'C');
				break;
			}
		}
		return sb.toString();
	}
}
