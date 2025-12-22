public class SecureTester{
  
  public static boolean alphanumeric(String s){
	  if (s.matches("[a-zA-Z-0-9]+")) return true;
	  else return false;
  }

}
