

public class Greed {
	public static int greedy(int[] dice) {
		int[] arr = new int[6];
		int acum = 0;

		for (int i = 0; i<dice.length; ++i) {
			int num = dice[i];
			arr[num-1]++;
		}
		
		for (int i = 1; i<arr.length; ++i) {
			acum += ((arr[i]/3)*((i+1)*100));
		}
		
		acum += (arr[0]/3)*1000;
		acum += (arr[0]%3)*100;
		acum += (arr[4]%3)*50;
		
		return acum;
	}
	
	
}