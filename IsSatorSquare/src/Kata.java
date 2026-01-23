public class Kata {
  
  public static Boolean isSatorSquare(char[][] tablet) {
	  boolean flag = true;
	  int l = tablet.length;
	  
	  for (int x = 0; x<tablet.length; ++x) {
		  for (int y = 0; y<tablet.length; ++y) {
			  char a = tablet[x][y];
			  char b = tablet[y][x];
			  if (a != b) {
				  flag = false;
				  break;
			  }
			  if (tablet[x][y] != tablet[l-1-x][l-1-y]) {
				  flag = false;
				  break;
			  }
		  }
	  }
    
	  return flag;
  }
}