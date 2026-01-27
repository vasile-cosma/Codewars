package matrix_weight;

public class Solution {
	public static String thinOrFat(int[][] matrix) {
		float x = 0;
		double y = 0;
		double totalRow = 0;
		double totalCol = 0;

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix.length; ++j) {
				x += matrix[i][j];
				if (x<0) return null;
				y += matrix[j][i];
				if (y<0) return null;
				
			}
			totalRow += Math.sqrt(x);
			totalCol += Math.sqrt(y);
			y = 0;
			x = 0;
		}

		if (totalRow < totalCol) {
			return "thin";
		} else if (totalRow > totalCol) {
			return "fat";
		} else {
			return "perfect";
		}
	}
}