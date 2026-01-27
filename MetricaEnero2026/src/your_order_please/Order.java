package your_order_please;

public class Order {
	  public static String order(String words) {
		  if (words.equals("")) return words;
		  
	    String[] arr = words.split(" ");
	    int ord;
	    String[] arr2 = new String[arr.length];
	    StringBuilder sb = new StringBuilder();
	    
	    for (String string : arr) {
			for (int i = 0; i<string.length(); ++i) {
				if (Character.isDigit(string.charAt(i))) {
					ord = Integer.parseInt(Character.toString(string.charAt(i))); 
					arr2[ord-1] = string;
				}
			}
		}
	    
	    for (String string : arr2) {
			sb.append(string + " ");
		}
	    
	    sb.deleteCharAt(sb.length()-1);
	    
	    return sb.toString();
		  
	  }
	}