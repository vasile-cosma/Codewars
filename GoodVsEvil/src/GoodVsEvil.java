public class GoodVsEvil {
	public static final String GOOD = "Battle Result: Good triumphs over Evil";
	public static final String BAD = "Battle Result: Evil eradicates all trace of Good";
	public static final String TIE = "Battle Result: No victor on this battle field";
	
  public static String battle(String goodAmounts, String evilAmounts) {
	  int good = calcularGood(goodAmounts);
	  int evil = calcularEvil(evilAmounts);
	  
	  if (good>evil)
		  return GOOD;
	  else if (evil>good)
		  return BAD;
	  else
		  return TIE;
  }
  
  private static int calcularGood(String goodAmounts) {
	  String [] arr = goodAmounts.split(" ");
	  int sum = 0;
	  for (int i = 0; i<arr.length; ++i) {
		  switch(i){
		  case 0 -> sum = sum + (1*Integer.parseInt(arr[i]));
		  case 1 -> sum = sum + (2*Integer.parseInt(arr[i]));
		  case 2 -> sum = sum + (3*Integer.parseInt(arr[i]));
		  case 3 -> sum = sum + (3*Integer.parseInt(arr[i]));
		  case 4 -> sum = sum + (4*Integer.parseInt(arr[i]));
		  case 5 -> sum = sum + (10*Integer.parseInt(arr[i]));
		  }
	  }
	  return sum;
  }
  
  private static int calcularEvil(String evilAmounts) {
	  String [] arr = evilAmounts.split(" ");
	  int sum = 0;
	  for (int i = 0; i<arr.length; ++i) {
		  switch(i){
		  case 0 -> sum = sum + (1*Integer.parseInt(arr[i]));
		  case 1 -> sum = sum + (2*Integer.parseInt(arr[i]));
		  case 2 -> sum = sum + (2*Integer.parseInt(arr[i]));
		  case 3 -> sum = sum + (2*Integer.parseInt(arr[i]));
		  case 4 -> sum = sum + (3*Integer.parseInt(arr[i]));
		  case 5 -> sum = sum + (5*Integer.parseInt(arr[i]));
		  case 6 -> sum = sum + (10*Integer.parseInt(arr[i]));
		  }
	  }
	  return sum;
  }
}