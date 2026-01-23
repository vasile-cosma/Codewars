import java.util.stream.Stream;

public class Solution{
  public static String doubleChar(String s){
	StringBuilder sb = new StringBuilder();
	s.chars().forEach(x -> {
		sb.append((char)x);
		sb.append((char)x);
	});
	return sb.toString();
  }
}