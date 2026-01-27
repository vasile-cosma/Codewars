package sudoku_validator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FailCorregido {

	public static boolean validate(int[][] board) {
		int[] row = new int[board.length];
		int[] col = new int[board.length];
		int[][] square = new int[3][3];
		int x;
		int y;
		boolean result = true;

		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board.length; ++j) {
				x = board[i][j];
				if (x == 0)
					return false;
				row[j] = x;

				y = board[j][i];
				if (y == 0)
					return false;
				col[j] = y;

			}
			result = checkLine(row);
			if (result == false)
				return result;
			result = checkLine(col);
			if (result == false)
				return result;
		}

		/*
		 * NOTA: Estás matando moscas a cañonazos. 
		 * Pistas para forma más eficiente: VÉRTICES Y SET
		 * Terminar de hacerlo de esta forma más larga e ineficiente es por cuestión de orgullo.
		 * 
		 */
		for (int contX = 0; contX < board.length; contX +=3) {
			for (int contY = 0; contY<board.length; contY +=3) {
				for (int i = 0; i<3; ++i) {
					for (int j = 0; j<3; ++j) {
						square[i][j] = board[contX+i][contY+j];
					}
				}
			result = checkSquare(square);
			if (!result) return false;
			}
		}
		

		return result;
	}

	public static boolean checkLine(int[] row) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < row.length; ++i) {
			map.put(row[i], map.getOrDefault(row[i], 0) + 1);
		}

		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			if (integer > 1)
				return false;
		}

		return true;
	}

	public static boolean checkSquare(int[][] square) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int v;
		
		for (int i = 0; i<square.length; ++i) {
			for (int j = 0; j<square.length; ++j) {
				v = square[i][j];
				if (v==0) return false;
				map.put(v, map.getOrDefault(v, 0) + 1);
			}
		}
		
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			if (integer > 1)
				return false;
		}
		
		return true;
	}

}
